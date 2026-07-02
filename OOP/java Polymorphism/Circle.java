public class Circle{
	private double radius;
	
	public Circle(double radius)
	{
		this.radius=radius;
	}
	
	public double getRadius()
	{
		return this.radius;
	}
	
	public double getArea()
	{
		return radius*radius*Math.PI;
	}
	
	public String toString()
	{
		return "Circle[radius="+radius+"]";
	}
}

class Cylinder extends Circle{
	private double height;
	
	public Cylinder(double radius,double height)
	{
		super(radius);
		this.height=height;
	}
	
	public double getHeight()
	{
		return this.height;
	}
	
	public double getVolume(){
		return super.getArea()*height;
	}
	
	public double getArea(){
		return 2*Math.PI* getRadius()*height;
	}
	
	public String toString()
	{
		return"Cylinder[height="+height+","+super.toString()+"]";
	}
}

class Main
{
	public static void main(String args[])
	{
		Circle c1=new Cylinder(1.1,2.2);
		System.out.println(c1.getRadius());
		System.out.println(c1.getArea());
	}
}