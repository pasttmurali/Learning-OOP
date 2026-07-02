public class Car extends Vehicle{
	private String model;
	
	public Car(String brand,String model,int speed){
		super(brand,speed);
		this.model=model;
	}
	
	public void move(){
		System.out.println(super.getBrand()+" model " +this.model+" car moving speed is "+super.getSpeed());
	}
}