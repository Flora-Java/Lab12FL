package autos;
import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("How many cars do you want to add to the list?");
		
		int numCars = Validator.getInt(scan, "How many cars do you want to add to the list?", 1, 4);
		ArrayList<Car> listCar = new ArrayList<>();

		for (int i = 0; i < numCars; i++) {
			System.out.println("Enter Car #" + (i + 1) + " Make: ");
			String make = scan.nextLine();
			System.out.println("Enter Car #" + (i + 1) + " Model: ");
			String model = scan.nextLine();
			System.out.println("Enter Car #" + (i + 1) + " Year: ");
			int year = scan.nextInt();
			System.out.println("Enter Car #" + (i + 1) + " price: ");
			
			double price = scan.nextDouble();

			scan.nextLine();
			listCar.add(new Car(make, model, year, price));
		}
		String format = "%-10s %-10s %-10s %-10s \t \n";
		System.out.println("");
		System.out.println("Current inventory");
		System.out.printf(format,"Make","Model","Year", "Price");
		System.out.println("===========================================");
		
		for (Car car: listCar) {
		System.out.println(car);
		
		}
		int selection = Validator.getInt(scan, "What car would you like?",1,6);
		

		
	}

}
