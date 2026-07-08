import java.util.Scanner;

public class Gauss{
	public static void main(String args[])
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for x");
		int x=scanner.nextInt();
		System.out.println("Enter a number for n");
		int n=scanner.nextInt();
		double sum=0;
		
		for(int j=1;j<=n;j++)
		{
			double a=1;
		for(int i=1;i<=2*(j-1);i++)
			{
				a =a*x;

			}
			
	
			double b=1;
			int i=j-1;
			while(i>=1)
			{
				b=b*i;
				i--;
			}
		
			
			double c;
			if ((j-1)%2==0)
			{
				c=(a*1)/b;
			}
			else
			{
				c=(a*(-1))/b;
			}
		
	
		sum =sum+c;
		
		}
		System.out.println(sum);
	}
	

}
