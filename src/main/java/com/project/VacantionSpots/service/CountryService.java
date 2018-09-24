package com.project.VacantionSpots.service;

import java.util.List;

import com.project.VacantionSpots.model.Country;

public interface CountryService {
	public List<Country> getAllCountries();
	
	public Country getCountryById(Integer id);
	
	public void saveOrUpdate(Country county);
	
	public void deleteCountry(Integer id);
}
