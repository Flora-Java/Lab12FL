package autos;

public class UsedCar extends Car {

	private double mileage;

	public double getMileage() {
		return mileage;
	}

	public void setMileage(double milage) {
		this.mileage = milage;
	}

	public UsedCar(double mileage) {
		super();
		this.mileage = mileage;
	}
	

	public UsedCar(String make, String model, int year, double price, double mileage) {
		super(make, model, year, price);

	this.mileage = mileage;
	}

	@Override
	public String toString() {
		String format = "%-10s %-10s %-10s $%-10s %-5s %-10s \n";
		return String.format(format, getMake(), getModel(), getYear(), getPrice(),"used" ,getMileage());

	}

	

	
	
//	@Override
//	public String toString() {
//		String format = "%-10s %10s %10s $%-8s %10s \n";
//		return super.toString() + milage;
//	}


}
