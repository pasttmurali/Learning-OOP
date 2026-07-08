import java.util.Scanner;
public class BubbleShort
{
	public static void main(String[]args)
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter a value of n for size of array");
		int n =scanner.nextInt();
		
		int [] index=new int[n];
		int tem;
		for(int i =0;i<n;i++)
		{
			System.out.println("enter numbers for index"+i);
			index[i]=scanner.nextInt();
		}
		
		for(int j=n-1;j>0;j--)
			{
				for(int i=0;i<n-1;i++)
				{
					if(index[i]>index[i+1])
					{
						tem=index[i];
						index[i]=index[i+1];
						index[i+1]=tem;
					}	
			
				}
			}
		for(int i=0;i<n;i++)
		{
			System.out.println(index[i]+" ");
			
		}
	}
}