package com.workload.repository;

import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.workload.model.Station;
import com.workload.model.Employee;

@Repository
public interface StationRepository
        extends JpaRepository<Station, Long> {
 
}

/*public class StationRepository {

	public List<Station> getAllStation() {
		// TODO Auto-generated method stub
		return null;
	}

	public Station getStationByCode(Long stationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteStationByCode(Long stationCode) {
		// TODO Auto-generated method stub
		
	}

	public Station createOrUpdateStation(Station station) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Station> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<Station> findById(Long stationCode) {
		// TODO Auto-generated method stub
		return null;
	}

	public Station save(Station newEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

}
*/