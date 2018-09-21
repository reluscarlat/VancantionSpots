package com.project.VacantionSpots.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class County implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column
	String value;
	
	@Column
	String abbreviation;
	
	@ManyToOne
	@JoinColumn(name = "country_id")
	Country country;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getAbbreviation() {
		return abbreviation;
	}

	public void setAbbreviation(String abbreviation) {
		this.abbreviation = abbreviation;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public County(int id, String value, String abbreviation, Country country) {
		super();
		this.id = id;
		this.value = value;
		this.abbreviation = abbreviation;
		this.country = country;
	}

	public County() {
		super();
	}

	@Override
	public String toString() {
		return "County [id=" + id + ", value=" + value + ", abbreviation=" + abbreviation + ", country=" + country
				+ "]";
	}	
	
}
