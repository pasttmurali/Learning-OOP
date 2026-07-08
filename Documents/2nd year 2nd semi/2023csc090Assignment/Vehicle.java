public class Vehicle{
	private String vehicle_Make;
	private String model;
	private int year;
	
	public Vehicle(String vehicle_Make,String model,int year){
		this.vehicle_Make=vehicle_Make;
		this.model=model;
		this.year=year;	
	}
	
	public String getVehicle_Make(){
		return this.vehicle_Make;
	}
	
	public String getModel(){
		return this.model;
	}
	
	public int getYear(){
		return this.year;
	}
	
	public void setVehicle_Make(String vehicle_Make){
		this.vehicle_Make=vehicle_Make;
	}
	
	public void setModel(String model){
		this.model=model;
	}
	
	public void setYear(int year){
		this.year=year;
	}
	
	
	public String display(){
		return "Vehicle's make:"+this.vehicle_Make+"\nVehicle Model:"+this.model+"\nVehicle Manufactured Year:"+this.year;
	}
	
}

class Car extends Vehicle{
	private	String fuelType;
	
	public Car(String vehicle_Make,String model,int year,String fuelType){
		super(vehicle_Make,model,year);
		this.fuelType=fuelType;
	}
	
	public String getFuelType(){
		return this.fuelType;
	}
	
		@Override
	public String display(){
		return super.display()+"\nFuel Type: "+this.getFuelType();
	}
	

	public void setFualType(String fuelType){
		this.fuelType=fuelType;
	}
}

class Motorcycle extends Vehicle{
	private	double mileage;
	
	public Motorcycle(String vehicle_Make,String model,int year,double mileage){
		super(vehicle_Make,model,year);
		this.mileage=mileage;
	}
	
	public double getMileage(){
		return this.mileage;
	}
	
	public void setMileage(double mileage){
		this.mileage=mileage;
	}
	
	@Override
	public String display(){
		return super.display()+"\nMileage: "+this.getMileage();
	}
}

class Main{
	public static void main(String args[]){
		Motorcycle m1 =new Motorcycle("Bajaj","Discovery",2024,60);
		Car c1 =new Car("Tesla","TMax",2022,"Petrol");
		
		System.out.println("Motorcycle Details\n -----------\n"+m1.display());
		System.out.println();
		System.out.println("Car Details\n -----------\n"+c1.display());
	}
}