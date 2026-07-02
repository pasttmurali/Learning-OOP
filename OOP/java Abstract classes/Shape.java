abstract public class Shape{
	private String color;
	
	public Shape(String color)
	{
		this.color=color;
	}
	
	 public String toString() {
		return "Shape[color=" + color + "]";
	 }
	 
	 abstract public double getArea();
}

class Triangle extends Shape{
	private int base;
	private int height;
	
	
	public Triangle(String color, int base,int height)
	{
		super(color);
		this.base=base;
		this.height=height;
	}
	
	public double getArea()	
	{
		return (double)base*height*0.5;
	}
	
	public String toString()
	{
		return "Triangle[Base="+base+",height="+height+","+super.toString()+"]";
	}
	
}

class Rectangle extends Shape{
	private int length;
	private int width;
	
	public Rectangle(String color,int length,int width)
	{
		super(color);
		this.length=length;
		this.width=width;
	}
	
	public double getArea()
	{
		return length*width; 
	}
	
	public String toString()
	{
		return "Rectangle[Width="+width+",Length"+length+","+super.toString()+"]";
	}
}

class Main
{
	public static void main(String args[])
	{
		//Shape sape=new Shape("yellow");
		//compilation error: Shape is abstract; cannot be instantiated
		
		Shape s1=new Rectangle("Blue",5,10);
		Shape s2=new Triangle("Red",4,10);
		System.out.println(s1);
		System.out.println(s1.getArea());
		System.out.println(s2);
		System.out.println(s2.getArea());
	}
}