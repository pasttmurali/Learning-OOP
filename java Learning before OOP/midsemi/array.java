import java.util.Scanner;
public class array
{
	public static void main(String[]args)
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter value of n for size of array");
		int n =scanner.nextInt();
		
		int [] numbers=new int[n];
		
		for(int i =0;i<n;i++)
		{
			System.out.println("Enter numbers to array for index "+i );
			numbers[i]=scanner.nextInt();
			
			
			
		}
		
	/*	int maxnum=numbers[0];
		int minnum=numbers[0];
		for(int i=1;i<n;i++)
		{
			
			if(maxnum<numbers[i])
			{
				maxnum=numbers[i];
			}
			if(minnum>numbers[i])
			{
				minnum=numbers[i];
			}
			
		}
		
		
		
		System.out.println("max number is:"+maxnum );
		System.out.println("min number is:"+minnum );
		*/
		int ntimessum=0;
		for(int i=0;i<n;i++)
		{
			int a=1;;
			for(int j=1;j<=n;j++)
			{
				a=a*numbers[i];
			}
			ntimessum=ntimessum+a;
		}
		System.out.println("sum:"+ntimessum);
	}
}