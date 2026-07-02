import java.util.Scanner;
public class BaseConversion
{
	public static void main(String args [])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a value for base b between 2 to 9");
		int b=scanner.nextInt();
		
		
		if(b>=2 && b<=9)
		{
			int a=1;
			for(int i=1;i<=4;i++)
			{
				a=b*a;
			}
			int maxNumber=a-1;
			System.out.println("Enter a base 10 number 1 to "+maxNumber);
			int n=scanner.nextInt();
			
			
			String x="";
		
			int rem=0;
			if(n<=maxNumber)
			{
				while(n>0)
				{
				rem = n%b;
				int quo=n/b;
				n=quo;
				x=rem+x;
				
				}
				System.out.print(x);
			}
		}
		else
		{
			System.out.println("The input value is wrong ,Please enter a value for base b between 2 to 9");
		}
		
		
	}
}