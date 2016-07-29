package com.Practice001;

public class Rover2ndGen extends Rover {

	
//---------------Properties-------------//
	
	private Navigation navigation;
	private Location location;
	
		
//---------------Constructor-------------//
	
	
	public Rover2ndGen(){
		navigation = new GPSModule(); 
		location = new Location();
	}
	
	
//---------------Methods-------------//
	
	
	public Location getLocation() {
		//get longitude and latitude from the GPSModule, then store in the in location object
		location.setLongitude(navigation.getLongitude());		
		location.setLatitude(navigation.getLatitude());
		return location;
	}

	
	
	
	
	
}
