package com.Practice001;

public class RoverMain {
	

	
	public static void main(String[] args) {

		
		//instantiate these variables in the main method, else they would be static methods if done at the class level
		Rover persistance = new Rover2ndGen();		
		Location location = new Location();
		
		location = persistance.getLocation();//make sure you put this in the main method else you will get an error
				
		System.out.println("The latitude is: " + new Integer(location.getLatitude()).toString());
		System.out.println("The longitude is: " + new Integer(location.getLongitude()).toString());
		
		
    }
	
}
