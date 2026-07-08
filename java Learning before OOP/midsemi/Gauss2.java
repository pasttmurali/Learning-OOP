import java.util.Scanner;
public class Gauss2
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the value for x:");
		int x = sc.nextInt();
		System.out.print("Enter the no of terms n:");
		int n =sc.nextInt();
		double sum=0;
		
		for(int i=1; i<=n; i++)
		{
			int a=1;
			int r=-1;
			while(a<=i)
			{
				r=r*(-1);
				a++;
				
			}
			//System.out.println("r"+r);
			
			double p =1;
			for(int j=1; j<=2*(i-1); j++)
			{
				p=p*x;
			}
			//System.out.println("p"+p);
			
			
			double f=1;
			for(int k=1; k<=i-1; k++ )
			{
				f=f*k;
			}
			//System.out.println("f"+f);
			double t=(r*p)/f;
			
			sum=sum+t;
			
			
		}
		System.out.println(sum);
	}
	
}