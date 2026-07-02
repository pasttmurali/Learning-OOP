import java.util.Scanner;
public class FindCircle
{
	public static void main(String [] args)
		{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the radius of the circle (r):");
		double r =scanner.nextDouble();
		double area =Math.PI*r*r;
		double	perimeter=2*Math.PI*r;

		System.out.println("The area of the circle is: " + area);
		System.out.println("The perimeter of the circle is: "+perimeter);
		

		}
}
