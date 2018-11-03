package com.project.VacantionSpots.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.VacantionSpots.model.County;
@Repository
public interface CountyRepository extends JpaRepository<County, Integer>{
	public List<County> getCountyByCountryId(int id);
}
