package com.project.VacantionSpots.service;

import java.util.List;

import com.project.VacantionSpots.model.Spot;

public interface SpotService {

	public List<Spot> getAllSpots();

	public Spot getSpotById(Long id);

	public void saveOrUpdate(Spot spot);

	public void deleteSpot(Long id);
}
