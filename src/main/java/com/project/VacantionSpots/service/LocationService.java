package com.project.VacantionSpots.service;

import java.util.List;

import com.project.VacantionSpots.model.Location;

public interface LocationService {
	public List<Location> getAllLocations();
	
	public Location getLocationById(Long id);
	
	public void saveOrUpdate(Location location);
	
	public void deleteLocation(Long id);
}
