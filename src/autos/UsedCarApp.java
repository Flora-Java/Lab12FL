package autos;

// FLora Lopez

import java.util.ArrayList;
import java.util.Scanner;

public class UsedCarApp {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

	
		ArrayList<Car> listCars = new ArrayList<>();
		
	//	new cars
			
		listCars.add(new Car("GM","Chevy",2018,22000.00));
		listCars.add(new Car("VW","Toureg",2018,27000.00));
		listCars.add(new Car("Audi","Quatro",2019,32000.00));
		listCars.add(new Car("Ford","Focus",2019,18000.00));
    // used cars
		listCars.add(new UsedCar("VW", "Tiguan", 2010,10000.50,95000.00));
		listCars.add(new UsedCar("Chrysler", "Jeep", 2012,12000,80000));
		listCars.add(new UsedCar("Chrysler", "Compass", 2016,12900,50000));
		listCars.add(new UsedCar("GM", "Volt", 2013,20000,93000));

		char flag = 0;
		int max;
	do {
    	printList(listCars);
		max = listCars.size()+1;
		int selection = Validator.getInt(scan, "Which car would you like? :", 1,max);
		if (selection == max) {
			break;
		}
		System.out.println("");
		System.out.println(listCars.get(selection-1));
		System.out.println("Would you like to buy this car? (y)");
		flag = scan.next().charAt(0);
		scan.nextLine();
		if (flag == 'y') {
		   System.out.println("");
		   System.out.println("Excellent! Our finance department will be in touch shortly.");
		   System.out.println("");
		   listCars.remove(selection-1);
		} else {
			continue;
		}
		
	} while (max > 0 || !(flag == max+1));
	System.out.println("");
	System.out.println("Have a great day!");
	
       scan.close();

	}
	public static void printList(ArrayList<Car> list) {

	System.out.println("Available cars:");
	String format = "%-10s %-10s %-10s $%-10s  %-10s \n";
	System.out.printf(format, "Make", "Model", "Year", "Price", "milage (Used)");
	System.out.println("========================================================");
	int i = 1;
	for (Car car : list) {
		System.out.print(i + " ");
		System.out.println(car);
		i++;
	}
	System.out.println(i + " Quit");
	System.out.println("");
	}
	

}
