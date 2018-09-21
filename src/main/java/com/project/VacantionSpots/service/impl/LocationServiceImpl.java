package com.project.VacantionSpots.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.VacantionSpots.model.Location;
import com.project.VacantionSpots.repository.LocationRepository;
import com.project.VacantionSpots.service.LocationService;

@Service
@Transactional
public class LocationServiceImpl implements LocationService{

	@Autowired
	LocationRepository locationRepository;
	
	@Override
	public List<Location> getAllLocations() {
		return locationRepository.findAll();
	}

	@Override
	public Location getLocationById(Long id) {
		return  locationRepository.findById(id).orElse(null);
	}

	@Override
	public void saveOrUpdate(Location location) {
		locationRepository.save(location);
	}

	@Override
	public void deleteLocation(Long id) {
		locationRepository.deleteById(id);	
	}

}
