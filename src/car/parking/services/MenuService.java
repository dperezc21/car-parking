package car.parking.services;

import car.parking.interfaces.MenuInterface;

public class MenuService implements MenuInterface {

	@Override
	public void printMenu() {
		System.out.println("Menu:");
		System.out.println("1. Parquear por hora.");
		System.out.println("2. Parquear por media jornada ");
		System.out.println("3. Parquear por jornada completa. ");
		System.out.println("4. FIN ");
		System.out.print("escoger una opcion: ");
		
	}

}
