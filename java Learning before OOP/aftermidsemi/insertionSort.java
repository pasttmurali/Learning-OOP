import java.util.Scanner;
public class insertionSort
{
	public static void main (String args[])
	{
	 Scanner scanner =new Scanner(System.in);
	 System.out.println("enter the size of the arry ");
	 int n =scanner.nextInt();
	 
	 int[] index =new int[n];
	 
	 for(int i=0;i<n;i++)
	 {
		 index[i]=scanner.nextInt();
		
	 }
	 for(int i=0;i<n;i++)
	 {
		  System.out.print(index[i]+" ");
	 }
	 
	 int temp;
	
		for(int j=1;j<n;j++)
		{		
			for(int i=j-1;i>=0;i--)
			{
		
				if(index[j]<index[i])
				{
					temp=index[j];
					index[j]=index[i];
					index[i]=temp;
					
					j--;
				}
			}
		}
	 
	  System.out.println(" ");
	 for(int i=0;i<n;i++)
	 {
		  System.out.print(index[i]+" ");
	 }
	 
	
	}
	
}