package com.project.VacantionSpots.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.VacantionSpots.model.Spot;
import com.project.VacantionSpots.repository.SpotRepository;
import com.project.VacantionSpots.service.SpotService;

@Service
@Transactional
public class SpotServiceImpl implements SpotService{
	@Autowired
	SpotRepository spotRepository;
	
	@Override
	public List<Spot> getAllSpots() {
		return spotRepository.findAll();
	}

	@Override
	public Spot getSpotById(Long id) {
		return spotRepository.findById(id).orElse(null);
	}

	@Override
	public void saveOrUpdate(Spot spot) {
		spotRepository.save(spot);
	}

	@Override
	public void deleteSpot(Long id) {
		spotRepository.deleteById(id);
	}

}
