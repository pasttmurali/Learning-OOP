abstract class Vehicle{
	//private String name;
	private String brand;
	private int speed;
	
	public Vehicle(String brand ,int speed){
		//this.name=name;
		this.brand=brand;
		this.speed=speed;
	}
	
	public String getBrand(){
		return this.brand;
		
	}
	
	public int getSpeed(){
		return this.speed;
		
	}
	abstract void move();
}