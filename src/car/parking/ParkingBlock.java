package car.parking;

public class ParkingBlock {
	private int number;
	private TypeService typeService;
	private String carPlate;
	private String clientName;
	
	public ParkingBlock() {}
	
	public ParkingBlock(int number) {
		this.number = number;
	}

	public ParkingBlock(TypeService service, String clientName, String plate) {
		this.clientName = clientName;
		this.typeService = service;
		this.carPlate = plate;
	}

	public int getNumber() {
		return number;
	}

	public TypeService getTypeService() {
		return typeService;
	}

	public void setTypeService(TypeService typeService) {
		this.typeService = typeService;
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
	
	public static ParkingBlock builBlockComplete(TypeService service, String clientName, String plate) {
		return new ParkingBlock(service, clientName, plate);
	}

	@Override
	public String toString() {
		return "ParkingBlock [number=" + number + ", typeService=" + typeService + ", carPlate=" + carPlate
				+ ", clientName=" + clientName + "]";
	}
	
	
	
	
}
