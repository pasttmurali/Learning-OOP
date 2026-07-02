import java.util.Scanner;
public class nextfor
{
	public static void main(String args [])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter the value for n");
		
		int n=scanner.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int a=1;a<=i;a++)
			{
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		for(int i=n-1;i>=1;i--)
		{
			for(int j=1;j<=n-i;j++)
			{
				System.out.print(" ");
				
			}
			for(int a=i;a>=1;a--)
			{
				System.out.print("* ");
				
			}
			System.out.println("");
		}
		
		
	}
}
	