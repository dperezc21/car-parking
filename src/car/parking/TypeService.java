package car.parking;

public enum TypeService {
	
	HOUR(3, 0),
	HALF(15, 0.05),
	COMPLETE(30, 0.1);
	
	private Integer value;
	private double discount;
	
	TypeService(Integer value) {
		this.value = value;
	}
	
	TypeService(Integer value, double discount) {
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
