public class Cylinder{
	private Circle circle1;
	private Circle circle2;
	private double height;
	private Line newLine;
	
	public Cylinder(Circle circle1,Circle circle2)
	{
		this.circle1=circle1;
		this.circle2=circle2;
	}
	
	public int getCircle1CenterX()
	{
		return circle1.getCenterX();
	}
	public int getCircle1CenterY()
	{
		return circle1.getCenterY();
	}
	public int getCircle2CenterX()
	{
		return circle2.getCenterX();
	}
	public int getCircle2CenterY()
	{
		return circle2.getCenterY();
	}
	
	public double hValue()
	{
		this.newLine=new Line(circle1.getCenterX(),circle1.getCenterY(),circle2.getCenterX(),circle2.getCenterY());
		return newLine.getLength();
	}
	
	public double getVolume()
	{
		return ((double)(22*circle1.getRadious()*circle1.getRadious()*this.hValue())/7);
	}
	
	public String toString()
	{
		return "Cylinder volume:"+this.getVolume();
	}

}