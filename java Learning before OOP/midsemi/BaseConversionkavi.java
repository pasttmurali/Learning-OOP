import java.util.Scanner;
public class BaseConversionkavi
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base 10 number:");
		int n = sc.nextInt();
		System.out.println("Enter the new base: ");
		int b = sc.nextInt();
		int maxNumber= b*b*b*b-1;
		System.out.println("maxNumber is: "+maxNumber);
		String x="";
		
		if(n==0)
		{
			System.out.println("0");
		}
		if(n<=maxNumber)
		{
			while(n>0)
			{
				int quotient= n/b;
				int remainder = n%b;
				n=quotient;
				x=remainder+x;
			}
		System.out.print(x);	
		}
		
		else
		{
			System.out.println("Can't change to base "+b);
		}
		
	}
}