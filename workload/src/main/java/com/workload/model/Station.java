package com.workload.model;

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
	private Long StationCode;
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
