abstract class Product{
	private String name;
	private double basePrice;
	
	public Product(String name,double basePrice){
		this.name=name;
		this.basePrice=basePrice;
	}
	
	public String getName(){
		return this.name;	
	}
	
	public double getBasePrice(){
		return this.basePrice;
	}
	
	abstract public double price();
	abstract public String prepNote();
		
	
}