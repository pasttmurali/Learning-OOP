import java.util.Arrays;
public class TestBall{
	public static void main(String args[]){
	
		Ball b1= new Ball(1.0,2.0,11.0,12.0);
		System.out.println(b1);

		b1.setX(3);
		b1.setY(4);
		b1.setXStep(13);
		b1.setYStep(14);
		System.out.println(b1);
		
		System.out.println("x is: " + b1.getX());
		System.out.println("y is: " + b1.getY());
		System.out.println("xStep is: " + b1.getXStep());
		System.out.println("yStep is: " + b1.getYStep());
		
		b1.setXY(5, 6);
		b1.setXYStep(15, 16);
		System.out.println(b1);
		
		System.out.println("x and y are: "+Arrays.toString(b1.getXY()));
		System.out.println("xStep and yStep are: "+Arrays.toString(b1.getXYStep()));
		
		//b1.setY(4);
		System.out.println(b1.move());
		System.out.println(b1.move().move().move());
	}
}