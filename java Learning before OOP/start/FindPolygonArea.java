import java.util.Scanner;
public class  FindPolygonArea
{
	public static void main(String [] args)
		{
		Scanner scanner =new Scanner(System.in);
			System.out.println("Enter the width of Square");
			double	sqw =scanner.nextDouble();
			double areaOfSquare=sqw*sqw ;
			
			
			System.out.println("Enter the width of Rectangle");
			double rew =scanner.nextDouble();
			System.out.println("Enter the length of Rectangle");
			double rel =scanner.nextDouble();
			double areaOfRectangle=rew*rel ;
			
			
			
			System.out.println("Enter the width of Triangle");
			double triw =scanner.nextDouble();
			System.out.println("Enter the height of Triangle");
			double trih =scanner.nextDouble();
			double areaOfTriangle=(triw*trih)/2 ;
			
			System.out.println("The Area Of Square is :"+areaOfSquare);	
			System.out.println("The Area Of Rectangle is :"+areaOfRectangle);
			System.out.println("The Area Of Triangle is :"+areaOfTriangle);
		
			
		

		}
}	