public class Bike extends Vehicle{
	private String model;
	
	public Bike(String brand,String model,int speed){
		super(brand,speed);
		this.model=model;
	}
	
	public void move(){
		System.out.println(super.getBrand()+" model " +this.model+" Bike moving speed is "+super.getSpeed());
	}
}