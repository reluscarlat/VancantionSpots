package com.project.VacantionSpots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.VacantionSpots.model.Spot;
@Repository
public interface SpotRepository extends JpaRepository<Spot, Long>{

}
