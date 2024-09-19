package car.parking;

import car.parking.enums.ParkingType;

public class ParkingBlock {
	private int number;
	private ParkingType parkingType;
	private String carPlate;
	private String clientName;
	
	public ParkingBlock() {}
	
	public ParkingBlock(int number) {
		this.number = number;
	}

	public ParkingBlock(ParkingType service, String clientName, String plate) {
		this.clientName = clientName;
		this.parkingType = service;
		this.carPlate = plate;
	}

	public int getNumber() {
		return number;
	}

	public ParkingType getTypeService() {
		return parkingType;
	}

	public void setTypeService(ParkingType parkingType) {
		this.parkingType = parkingType;
	}

	public String getCarPlate() {
		return carPlate;
	}

	public void setCarPlate(String carPlate) {
		this.carPlate = carPlate;
	}

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public static ParkingBlock build(int number) {
		return new ParkingBlock(number);
	}
	
	public static ParkingBlock builBlockComplete(ParkingType service, String clientName, String plate) {
		return new ParkingBlock(service, clientName, plate);
	}

	@Override
	public String toString() {
		return "ParkingBlock [number=" + number + ", typeService=" + parkingType + ", carPlate=" + carPlate
				+ ", clientName=" + clientName + "]";
	}
	
	
	
	
}
