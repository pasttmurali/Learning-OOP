public class TestPoint{
	public static void main(String args[]){
		Point p1 =new Point(1,2);
		System.out.println(p1);  //(1,2)
		
		
		Point p2=new Point();
		System.out.println(p2);//(0,0)
		
		p1.setX(3);
		p1.setY(4);
		System.out.println(p1);//(3,4)
		
		System.out.println("X is: " + p1.getX());
		 //X is: 3
		System.out.println("Y is: " + p1.getY());
		 //Y is: 4
		 
		p1.setXY(5,6);
		System.out.println(p1);  //(5,6)
		/*System.out.println("X is: " + p1.getXY()[0]);
		 //X is: 5
		System.out.println("Y is: " + p1.getXY()[1]);
		 //Y is: 6*/
		 
		 p2.setXY(10,11);
		 System.out.printf("Distance is: %.2f%n",p1.distance(p2));
		 System.out.printf("Distance is: %.2f%n", p1.distance());
	}
}