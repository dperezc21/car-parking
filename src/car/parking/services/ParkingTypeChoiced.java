package car.parking.services;

import java.util.HashMap;

import car.parking.enums.ParkingType;

public class ParkingTypeChoiced {
	
	private static HashMap<String, ParkingType> parkingType;
	
	private ParkingTypeChoiced() {
		
	}
	
	public static ParkingType parkingTypeChoiced(String value) {
		 if(parkingType == null) {
			 parkingType = new HashMap<String, ParkingType>(){{
					put("1", ParkingType.HOUR);
					put("2", ParkingType.HALF);
					put("3", ParkingType.COMPLETE);
				}};
		 }
		
		return parkingType.get(value);
	}

}
