import java.util.Scanner;
public class NegativeElements
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
	

	public int[] orderMethod(int[] inputarray)
	{
		int temp;
		for(int i=0;i<inputarray.length;i++)
		{
			for(int j=0;j<inputarray.length-1;j++)
			{
				if(inputarray[j]>0 && inputarray[j+1]<0  )
				{
					temp=inputarray[j+1];
					inputarray[j+1]=inputarray[j];
					inputarray[j]=temp;
				}
			}
		}
		return inputarray;
	}
	
	public static void main(String[] args)
	{
		NegativeElements ob1=new NegativeElements();
		int a[]=ob1.getArray();
		System.out.println("");
		System.out.println("inputarray is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println(" ");
		
		int c[]=ob1.orderMethod(a);
		System.out.println("");
		
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}
		
	}
}