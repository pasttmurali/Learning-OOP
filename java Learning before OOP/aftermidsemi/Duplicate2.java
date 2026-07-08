import java.util.Scanner;
public class Duplicate2
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
	
	public void duplicateArray(int[] inarray)
	{
		boolean[] boolarray=new boolean[inarray.length];
		
		for(int i=0;i<inarray.length;i++)
		{
				for(int j=i+1;j<inarray.length;j++)
				{
					if(inarray[i]==inarray[j])
					{
						boolarray[j]=true;
					}
				}
		}
		for(int i=0;i<inarray.length;i++)
		{
			if(! boolarray[i])
			{
				System.out.print(inarray[i]+" ");
			}
		}
	}
	
		
	public static void main(String[] args)
	{
		Duplicate2 ob1=new Duplicate2();
		int a[]=ob1.getArray();
		System.out.println("");
		System.out.println("inputarray is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println(" ");
		ob1.duplicateArray(a);
	}
}