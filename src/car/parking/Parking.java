package car.parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Optional;

import car.parking.enums.ParkingType;

public class Parking {
	
	private final ArrayList<ParkingBlock> parkingBlock;
	private final int BLOCK_NUMBERS = 10;
	private double total;
	
	public Parking() {
		this.parkingBlock = generateParking();
	}
	
	private ArrayList<ParkingBlock> generateParking() { 
		ArrayList<ParkingBlock> p = new ArrayList<>();
		for (int i = 1; i <= BLOCK_NUMBERS; i++) {
			p.add(ParkingBlock.build(i));
		}
		return p; 
	}

	public ArrayList<ParkingBlock> getParkingBlock() {
		return parkingBlock;
	}
	
	public void pickUpParking(ParkingType service, String clientName, String plate) {
		
		ParkingBlock blockSelected = getParkingWithoutUse();
		
		if(blockSelected != null) {
			int index = parkingBlock.indexOf(blockSelected);
			
			blockSelected.setCarPlate(plate);
			blockSelected.setClientName(clientName);
			blockSelected.setTypeService(service);
			
			parkingBlock.remove(index);
			parkingBlock.add(index, blockSelected);

			addValueToTotal(service);
		}
	}
	
	private ParkingBlock getParkingWithoutUse() {
		return parkingBlock.stream()
				.filter(t -> t.getTypeService() == null)
				.findFirst().orElseGet(null);
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public void addValueToTotal(ParkingType service) {
		double value = calculateValueByDiscount(service);
		total += value;
	}
	
	public double calculateValueByDiscount(ParkingType parkingType) {
		return parkingType.getValue() - (parkingType.getDiscount() * parkingType.getValue());
	}
		
}
