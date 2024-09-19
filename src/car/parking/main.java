package car.parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //Ya tenemos el "lector"

		
		Parking parking = new Parking();
		Scanner scanner = new Scanner(System.in);
		
		Boolean breakDown = true;
		do {	
			printMenu();
			String value = scanner.next();
			if(value.equals("1")) {
				String clientName = "";
				String plate = "";
				try {

					System.out.print("Ingrese el nombre del cliente: ");
					clientName = br.readLine();

					System.out.print("Ingrese la placa del carro: ");
					plate = br.readLine(); 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				parking.pickUpParking(TypeService.HOUR, clientName, plate);
			}
			
			breakDown = !value.equalsIgnoreCase("fin");
			System.out.println(" -------- // --------// ----------- TOTAL: "+ parking.getTotal());
			
		} while(breakDown);
		
	}
	
	public static void printMenu() {
		System.out.println("Menu:");
		System.out.println("1. Parquear por hora.");
		System.out.println("2. Parquear por media jornada ");
		System.out.println("3. Parquear por jornada completa. ");
		System.out.println("4. FIN ");
		System.out.print("escoger una opcion: ");
	}

}
