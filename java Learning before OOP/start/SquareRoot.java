import java.util.Scanner;
import java.util.Random;
public class SquareRoot
{
	public static void main(String args [])
	{
		Scanner scanner =new Scanner(System.in);
		Random random =new Random();
		System.out.println("Enter the number a");
		double a = scanner.nextDouble();
		if(a>=0)
		{
			int x0=0;
			while(x0 == 0)
			{	
			x0 =random.nextInt();
			x0=x0;
			}
			  double x=x0;
			while(x*x-a>0.0000001)
			
			{
			
				double x1=(x+a/x)/2;
				x=x1;
			
			}
			if (x>0)
			{
				System.out.printf("%.6f",x);
			}
			else
			{
			System.out.printf("%.6f",x*(-1));
			}
		}else
		{
			System.out.printf("wrong input,input a positive number or 0 ");
		}
			
	}
}