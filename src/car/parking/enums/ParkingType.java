package car.parking.enums;

import java.util.HashMap;

public enum ParkingType {
	
	HOUR(3, 0, "1"),
	HALF(15, 0.05, "2"),
	COMPLETE(30, 0.1, "3");
	
	private Integer value;
	private double discount;
	private String chooice;
	
	ParkingType(Integer value) {
		this.value = value;
	}
	
	ParkingType(Integer value, double discount) {
		this.value = value;
		this.discount = discount;
	}
	
	ParkingType(Integer value, double discount, String chooice) {
		this.value = value;
		this.discount = discount;
		this.chooice = chooice;
	}
	
	public Integer getValue() {
		return this.value;
	}
	
	public double getDiscount() {
		return this.discount;
	}
	
	
	public String getChooice() {
		return chooice;
	}
	
	public static ParkingType typeServiceChooiced(String value) {
		HashMap<String, ParkingType> hashMap = new HashMap<String, ParkingType>(){{
			put("1", HOUR);
			put("2", HALF);
			put("3", COMPLETE);
		}};
		
		return hashMap.get(value);
	}

}
