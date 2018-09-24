package com.project.VacantionSpots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.VacantionSpots.model.Country;
@Repository
public interface CountryRepository extends JpaRepository<Country, Integer>{

}
