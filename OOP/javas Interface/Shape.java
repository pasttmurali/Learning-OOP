public interface Shape{
	double getArea();
}

class Rectangle implements Shape{
	private int length,width;
	
	public Rectangle(int length,int width)
	{
		this.length=length;
		this.width=width;
		
	}
	
	 public String toString() {
		 return "Rectangle[length=" + length + ",width=" + width +"]";
	 }
	 
	  public double getArea() {
		return length * width;
	 }
}

 class Triangle implements Shape {
	 private int base,height;
	 
	 public Triangle(int base, int height)
	 {
		 this.base = base;
		 this.height = height;
	 }
	 
	 public String toString()
	 {
		return "Triangle[base=" + base + ",height=" + height + "]";
	 }
	 
	 public double getArea()
	 {
		return 0.5 * base * height;
	 }
 
 }
 class Main {
 public static void main(String[] args) {
 Shape s1 = new Rectangle(1, 2); // upcast
 System.out.println(s1);
 //Rectangle[length=1,width=2]
 
 System.out.println("Area is " + s1.getArea());
 //Area is 2.0
 Shape s2 = new Triangle(3, 4); // upcast
 System.out.println(s2);
 //Triangle[base=3,height=4]
 
 System.out.println("Area is " + s2.getArea());
 //Area is 6.0
 
	 // Cannot create instance of an interface
	 //Shape s3 = new Shape("green");
	//compilation error: Shape is abstract; cannot be instantiated
	}
 }
 