package com.workload.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.workload.model.Station;

@Repository
public interface StationRepository
        extends JpaRepository<Station, Long> {
 
}
