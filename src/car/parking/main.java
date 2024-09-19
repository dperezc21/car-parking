package car.parking;

import java.util.Scanner;

import car.parking.enums.ParkingType;
import car.parking.interfaces.MenuInterface;
import car.parking.interfaces.ValuesUserInterface;
import car.parking.services.InfoUserService;
import car.parking.services.MenuService;
import car.parking.services.ParkingTypeChoiced;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MenuInterface menuService = new MenuService();
	
		Parking parking = new Parking();
		ValuesUserInterface userInfo = new InfoUserService(); 
		Scanner scanner = new Scanner(System.in);
		
		Boolean breakDown = true;
		do {	
			menuService.printMenu();
			String value = scanner.next();
			
			breakDown = !value.equalsIgnoreCase("fin");
			
			if(!breakDown) break;
		
			if(!value.isEmpty()) {

				ParkingType service = ParkingTypeChoiced.parkingTypeChoiced(value);
				
				if(service == null) continue;
				
				userInfo.giveInfo();
				String clientName = userInfo.clientName();
				String plate = userInfo.carPlate();
				parking.pickUpParking(service, clientName, plate);
			}
			
		} while(breakDown);
		System.out.println("TOTAL DEL DIA: $"+ parking.getTotal() + " Dolares");
		
	}

}
