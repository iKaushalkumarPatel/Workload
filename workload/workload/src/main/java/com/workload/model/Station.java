package com.workload.model;


import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
@Table(name="STATION")
public class Station {

	public Long getStationCode() {
		return StationCode;
	}
	public void setStationCode(Long stationCode) {
		StationCode = stationCode;
	}
	public String getStationName() {
		return StationName;
	}
	public void setStationName(String stationName) {
		StationName = stationName;
	}
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Long StationCode;
    
    @Column(name="StationName")
    private String StationName;

    
    @Override
    public String toString() {
        return "Station [StationCode=" + StationCode + ", StationName=" + StationName +"]";
    }
	public void setStationCode() {
		// TODO Auto-generated method stub
		
	}
	public void setStationName() {
		// TODO Auto-generated method stub
		
	}
    
}
