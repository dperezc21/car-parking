package car.parking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Parking {
	
	private final ArrayList<ParkingBlock> parkingBlock;
	private final int BLOCK_NUMBERS = 10;
	private double total;
	
	public Parking() {
		this.parkingBlock = generateParking();
	}
	
	private ArrayList<ParkingBlock> generateParking() { 
		ArrayList<ParkingBlock> p = new ArrayList<>();
		for (int i = 1; i < BLOCK_NUMBERS; i++) {
			p.add(ParkingBlock.build(i));
		}
		return p; 
	}

	public ArrayList<ParkingBlock> getParkingBlock() {
		return parkingBlock;
	}
	
	public void pickUpParking(TypeService service, String clientName, String plate) {
		ParkingBlock blockSelected = parkingBlock.stream()
				.filter(t -> t.getTypeService() == null)
				.findFirst()
				.orElse(null);
		
		if(blockSelected != null) {
			ParkingBlock newBlock = new ParkingBlock(service, clientName, plate);
			newBlock.setNumber(blockSelected.getNumber());
			ParkingBlock p = parkingBlock.stream()
					.filter(t -> t.getNumber() == newBlock.getNumber())
					.findFirst().get();
			
			parkingBlock.add(parkingBlock.indexOf(p), newBlock);
			addValueToTotal(service);
		}
		print();
	}
	
	public void print() {
		parkingBlock.forEach(t -> System.out.println(t.toString()));
	}
	
	public double getTotal() {
		return this.total;
	}
	
	public void addValueToTotal(TypeService service) {
		double value = calculateValueByDiscount(service);
		total += value;
	}
	
	public double calculateValueByDiscount(TypeService typeService) {
		return typeService.getValue() - (typeService.getDiscount() * typeService.getValue());
	}
	
	
	
	
	
	
}
