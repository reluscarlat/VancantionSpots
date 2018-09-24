package com.project.VacantionSpots.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.VacantionSpots.model.Country;
import com.project.VacantionSpots.repository.CountryRepository;
import com.project.VacantionSpots.service.CountryService;

@Service
@Transactional
public class CountryServiceImpl implements CountryService {

	@Autowired
	CountryRepository CountryRepository;
	
	@Override
	public List<Country> getAllCountries() {
		return CountryRepository.findAll();
	}

	@Override
	public Country getCountryById(Integer id) {
		return CountryRepository.findById(id).orElse(null);
	}

	@Override
	public void saveOrUpdate(Country Country) {
		CountryRepository.save(Country);
		
	}

	@Override
	public void deleteCountry(Integer id) {
		CountryRepository.deleteById(id);
		
	}

}
