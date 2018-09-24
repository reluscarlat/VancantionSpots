package com.project.VacantionSpots.service;

import java.util.List;

import com.project.VacantionSpots.model.County;

public interface CountyService {
	public List<County> getAllCounties();
	
	public County getCountyById(Integer id);
	
	public void saveOrUpdate(County county);
	
	public void deleteCounty(Integer id);
}
