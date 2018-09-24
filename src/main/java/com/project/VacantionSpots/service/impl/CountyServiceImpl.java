package com.project.VacantionSpots.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.VacantionSpots.model.County;
import com.project.VacantionSpots.repository.CountyRepository;
import com.project.VacantionSpots.service.CountyService;

@Service
@Transactional
public class CountyServiceImpl implements CountyService {

	@Autowired
	CountyRepository countyRepository;
	
	@Override
	public List<County> getAllCounties() {
		return countyRepository.findAll();
	}

	@Override
	public County getCountyById(Integer id) {
		return countyRepository.findById(id).orElse(null);
	}

	@Override
	public void saveOrUpdate(County county) {
		countyRepository.save(county);
		
	}

	@Override
	public void deleteCounty(Integer id) {
		countyRepository.deleteById(id);
		
	}

}
