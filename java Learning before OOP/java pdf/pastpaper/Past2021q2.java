//float myFloatNumjavac  = 5.99f;
import java.util.Random;
import java.util.Scanner;
public class Past2021q2
{
	public static void main(String args[])
	{
		Scanner scanner= new Scanner(System.in);
		Random rand=new Random();
		/*int max=50;
		int max0=10
		
		int randomnum=rand.nextInt((max-min)+1)+min;*/
		System.out.println("enter the array value for array size");
		int n=scanner.nextInt();
		int[] array=new int[n];
		for(int i=0;i<n;i++)
		{
			array[i]=scanner.nextInt();
		}
	/*	
		System.out.print("input array is :");
		for(int i:array)
		{
			System.out.print(i+" ");
		}
		
		System.out.println(" ");
		System.out.println("enter the specified element");
		int n1=scanner.nextInt();
		
		int a=-1;
		for(int i=0;i<n;i++)
		{
			
			if(array[i]==n1)
			{
				a=i;
				break;
			}
		}
		
		if(a==-1)
		{
			System.out.println("Specified element not found in array");
		}
		else
		{
			System.out.println("Specified element  found in index "+a);
		}
		
		int max=array[0];
		for(int i:array)
			{
				if(i>max)
				{
					max=i;
				}		
			}	
		
		System.out.println("maximum value in array is "+max);
		
		int sum=0;
		for(int i:array)
		{
			sum+=i;
		}
		System.out.println("array sum is :"+sum);*/
		
		
		int maxcount=0;
		int maxnum=array[0];
		for(int i=0;i<n-1;i++)
		{
			int temcount=1;
			for(int j=(i+1);j<n;j++)
			{
				if(array[i]==array[j])
				{
					temcount++;
				}
				
				if(temcount>maxcount)
				{
					maxcount=temcount;
					maxnum=array[i];
				}
			}
			
		}
		System.out.println("num"+maxnum);
		System.out.println("num count"+maxcount);
	}
}

