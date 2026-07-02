import java.util.Scanner;
public class fact
{
	public static void main(String args [])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the value for n");
		
		int n=scanner.nextInt();
		int k=scanner.nextInt();
	
			int b=1;
			for(int a=n;a>=1;a--)
			{
				
				b=b*a;
			}
			System.out.println(b);
			
			int c=1;
			for(int a=k;a>=1;a--)
			{
				
				c=c*a;
			}
			System.out.println(c);
			
			
			int d=1;
			for(int a=(n-k);a>=1;a--)
			{
				
				d=d*a;
			}
			
			System.out.println(c);
			
		
					
	}
}

/*for(int i=0;i<n;i++)
		{ */