package car.parking.enums;

import java.util.HashMap;

public enum ParkingType {
	
	HOUR(3, 0),
	HALF(15, 0.05),
	COMPLETE(30, 0.1);
	
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
	
	public Integer getValue() {
		return this.value;
	}
	
	public double getDiscount() {
		return this.discount;
	}

}
