package car.parking;

import java.util.HashMap;

public enum TypeService {
	
	HOUR(3, 0, "1"),
	HALF(15, 0.05, "2"),
	COMPLETE(30, 0.1, "3");
	
	private Integer value;
	private double discount;
	private String chooice;
	
	TypeService(Integer value) {
		this.value = value;
	}
	
	TypeService(Integer value, double discount) {
		this.value = value;
		this.discount = discount;
	}
	
	TypeService(Integer value, double discount, String chooice) {
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
	
	public static TypeService typeServiceChooiced(String value) {
		HashMap<String, TypeService> hashMap = new HashMap<String, TypeService>(){{
			put("1", HOUR);
			put("2", HALF);
			put("3", COMPLETE);
		}};
		
		return hashMap.get(value);
	}

}
