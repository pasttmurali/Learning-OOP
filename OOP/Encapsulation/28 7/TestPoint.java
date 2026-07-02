import java.util.Arrays;
public class TestPoint{
	public static void main(String args[]){
		Point p1=new Point(0,6);
		Point p2=new Point(5,5);
		
		System.out.println(p1.distance(0,0));
		System.out.println(p1.distance(p2));
		
		System.out.println();
		Line line1=new Line(p1,p2);
		System.out.println(line1);
		System.out.println("Line 1 length "+line1.getLength());
		
		System.out.println();
		
		System.out.println("Begin array is "+Arrays.toString(line1.getEndXY()));
		System.out.println();
		
		int[] EndArray=line1.getEndXY();
		System.out.println("End array is "+Arrays.toString(EndArray));
		
		System.out.println();
		
		
		
		Line line2=new Line(9,6,3,1);
		System.out.println(line2);
		System.out.println("Line 2 length "+line2.getLength());
		System.out.println();
		
		line2.setBeginXY(1,3);
		System.out.println(line2);
		System.out.println("Line 2 length "+line2.getLength());
		System.out.println();
		
		line2.setEndXY(6,9);
		System.out.println(line2);
		System.out.println("Line 2 length "+line2.getLength());
		
		Circle c1=new Circle(0,0,7);
		Circle c2=new Circle(p1,7);
		Circle c3=new Circle(7);
		System.out.println();
		System.out.println(c2.toString());
		System.out.println();
		System.out.println(c1.toString());
		System.out.println();
		System.out.println(c3.toString());
		
		
		System.out.println("find cylinder volume");
		System.out.println();
		Cylinder cylinder1 =new Cylinder(c1,c2);
		System.out.println(cylinder1);
	
	}
}