import java.util.Scanner;
public class nextfor2
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
				System.out.print(i+" ");
				
			}
			System.out.println("");
		}
					
	}
}
	 