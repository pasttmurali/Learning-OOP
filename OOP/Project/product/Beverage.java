public class Beverage extends Product{
	private boolean iced;
	private Size size;
	
	
	public Beverage(String name,double basePrice,Size size,boolean iced)
	{
		super(name,basePrice);
		this.size=size;
		this.iced=iced;
	}
	
	public double sizeMultifier()
	{
		switch(size){
			case SMALL:
				return 1.0;
			case MEDIUM:
				return 1.25;
			case LARGE:
				return 1.5;
			default: 
				return 1.0;
		}
	}
	public double price(){
		
		double fprice=super.getBasePrice()*sizeMultifier();
		
		if(iced)
		{
			fprice=fprice+0.30;
		}
		
		return fprice;
	}
	
	public String isIced()
	{
		if(iced)
		{
			return "Iced";	
		}else{
			return "Hot";
		}
	}
	
	public String prepNote(){
		return "Beverage["+getName()+" "+" Size"+" "+this.size+" It is "+this.isIced();
	}
	 
}

