package com.project.VacantionSpots.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.VacantionSpots.model.Location;
@Repository
public interface LocationRepository extends JpaRepository<Location, Long>{

}
