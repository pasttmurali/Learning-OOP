import java.util.Scanner;
public class gcd
{
	public static void gcd(int m,int n)
	{
		
		
		int temp,temp2;
		
		if(m<=0 || n<=0  )
		{
			System.out.println('0');
		}else if(m==n)
		{
			System.out.println(1);
		}
		else
		{
		
			if(m>n)
			{
				temp=m;
				m=n;
				m=temp;
			}
			
			int r;
			do
			{
				r=n%m;
			
				temp2=m;
				m=r;
				n=temp2;
	
			}while(r!=0);
			
		System.out.println(temp2);
		
		}
	
	}
	
	public static void main(String args[])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number num1");
		int m=scanner.nextInt();
		System.out.println("Enter the number num2");
		int n=scanner.nextInt();
		
		gcd(m,n);

	}
}