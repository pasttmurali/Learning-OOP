import java.util.Scanner;
public class past2019q1
{
	public static void main(String args[])
	{
		/*
		for(int i=5;i>=1;i--)
		{
			for(int f=0;f<5-i;f++)
			{
				System.out.print(" ");
			}
			
			for(int j=1;j<=i;j++)
			{
				System.out.print((5-i+1)+" ");
			}
			System.out.println("");
		}*/
		
		Scanner scanner =new Scanner(System.in);
		System.out.println("enter array size");
		int n=scanner.nextInt();
		int[] numarray =new int[n];
		for(int i=0;i<n;i++)
		{
			numarray[i]=scanner.nextInt();
		}
		
		int count=1;
		int b=numarray[0];
		int maxcount=0;
		for(int i=0;i<n-1;i++)
		{
			for(int j=(i+1);j<n;j++)
			{
				if(numarray[i]==numarray[j])
				{
					count++;
				}
				
				if(maxcount<count)
				{
					maxcount=count;
					b=numarray[i];
				}
			}
			count=1;
		}
		
		
		boolean state=false;
		int c=0;
		for(int i=0;i<n;i++)
		{
			if(b==numarray[i])
			{
				state= true;
				c=i;
				break;
			}
		}
		if(state)
		{
			System.out.println(" first index of the element which has the maximum value is index "+c);
		}
		System.out.println(" the maximum value is "+b);
	}
}

