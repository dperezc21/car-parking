package car.parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

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
		
			if(!value.isEmpty()) {

				TypeService service = TypeService.typeServiceChooiced(value);
				
				userInfo.giveInfo();
				String clientName = userInfo.clientName();
				String plate = userInfo.carPlate();
				parking.pickUpParking(service, clientName, plate);
			}
			
			breakDown = !value.equalsIgnoreCase("fin");
			
		} while(breakDown);
		System.out.println(" -------- // --------// ----------- TOTAL: "+ parking.getTotal());
		
	}

}
