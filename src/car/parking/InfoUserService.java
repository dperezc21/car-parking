package car.parking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InfoUserService implements ValuesUserInterface {
	
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private String name;
	private String plate;

	@Override
	public void giveInfo() {
		try {

			System.out.print("Ingrese el nombre del cliente: ");
			this.name = br.readLine();

			System.out.print("Ingrese la placa del carro: ");
			plate = br.readLine(); 
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public String clientName() {
		return name;
	}

	@Override
	public String carPlate() {
		return plate;
	}

}
