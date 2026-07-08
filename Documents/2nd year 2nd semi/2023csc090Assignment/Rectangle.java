import java.util.Scanner;
public class Rectangle{
	private double length;
	private double width;
	
	public Rectangle(){
		this.width=0;
		this.length=0;
	}
	
	public double getLength(){
		return this.length;
	}
	
	public double getWidth(){
		return this.width;
	}
	
	public void setWidth(double width){
		this.width=width;
	}
	
	public void setLength(double length){
		this.length=length;
	}
	
	public double calculateArea(){
		return this.width*this.length;
	}
	
	public double calculatePerimeter(){
		return 2*(this.width+this.length);
	}
}

class Main{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		Rectangle r1=new Rectangle();
		
		System.out.println("Enter value for length");
		double len=sc.nextDouble();
		
		System.out.println("Enter value for width");
		double wid=sc.nextDouble();
		
		r1.setLength(len);
		r1.setWidth(wid);
		
		System.out.println("Rectangle Area is:"+r1.calculateArea());
		System.out.println("Rectangle Perimeter is:"+r1.calculatePerimeter());
	}
}