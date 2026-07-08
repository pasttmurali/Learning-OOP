import java.util.Scanner;
public class IsPrime
{

	public static void  isPrime(int n)
	{

		int count=0;
	
		if(n<=1)
		{
			System.out.println(0);
		}else
		{
			for(int i=1;i<=n;i++)
			{
			
				if(n%i==0)
				{
					count=count+1;
				}
			
			}
		
			if(count==2)
			{
				
				System.out.println(1);
			}else
			{
				System.out.println(0);
			}
		}
	}

	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number num1");
		int m=scanner.nextInt();

		isPrime(m);

	}
}