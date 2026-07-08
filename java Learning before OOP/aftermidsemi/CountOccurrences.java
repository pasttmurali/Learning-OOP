import java.util.Scanner;
public class CountOccurrences
{
	public int[] getArray()
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scanner.nextInt();
		
		int[] innarray=new int[n];
		for(int i=0;i<innarray.length;i++)
		{
			System.out.print("enter the value for index "+i+" :");
			innarray[i]=scanner.nextInt();
		}
	
		return innarray;
	}
	
	
	public int[] sortArray(int[] b)
	{
		int temp;
		
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(b[j]>b[j+1])
				{
					temp=b[j+1];
					b[j+1]=b[j];
					b[j]=temp;
				}
			}
			
		}
		
		
		return b;
	}
	
	public void countArray(int[] d)
	{
		int[] outarray=new int[d.length];
		
			System.out.println("output array is ");
			
			outarray[0]=d[0];
			int j=1;
			for(int i=0;i<d.length-1;i++)
			{
				if(d[i]!=d[i+1])
				{
					outarray[j]=d[i+1];
					j++;
				}
				
			}
			
		for(int i=0;i<j;i++)
		{
			System.out.print(outarray[i]+" ");
		}
		
		
		System.out.println("");
		
		
		int count;
		for(int i=0;i<j;i++)
		{
			count=0;
			for(int e=0;e<d.length;e++)
			{
				if(outarray[i]==d[e])
				{
					count++;
				}
				
			}
			System.out.println(outarray[i]+" count is "+count);
		}
	}
	
	
		
	
		
	public static void main(String[] args)
	{
		CountOccurrences ob1=new CountOccurrences();
		int a[]=ob1.getArray();
		System.out.println("");
		System.out.println("inputarray is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println(" ");
		
		int c[]=ob1.sortArray(a);
		System.out.println("");
		ob1.countArray(c);
		
		
	}
}