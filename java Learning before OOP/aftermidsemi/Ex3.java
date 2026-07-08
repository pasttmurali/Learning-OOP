import java.util.Scanner;
public class Ex3
{
	public static int[] getInput(int n)
	{
		Scanner scan=new Scanner(System.in);
		int[] list =new int[n];
		for(int i=0;i<n;i++)
		{
			list[i]=scan.nextInt();
		}
		return list;
	}
	
	public static int returnMethod(int[] array1, int[] array2)
	{
		boolean state=true;
		int index=0;
		for(int i=0;i<array2.length;i++)
		{
			for(int j=0;j<array1.length;j++)
			{
				if(array1[j]==array2[j+i] )
				{ 
					state=true;	
				}else 
				{
					state=false;
					break;
				}
			}
			if(state)
			{
				index=i+array1.length;
				break;
			}
		}
		
		 if(!state)
		{
            index=-1;
        }
		
		return index;
		
	}
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int[] a,b;
		int n1,n2;
		while(true)
		{
			System.out.println("Enter array size for list 1");
			n1 =scanner.nextInt();	
			if(n1>0)
			{
				System.out.println("Enter array value for list 1");
				a=getInput(n1);
				break;
			}else
			{
				System.out.println("your input is wrong.that value must be >0");
			}
		}
		
		System.out.println(" ");
		
		
		
		while(true)
		{
			System.out.println("Enter array size for list 2");
			n2 =scanner.nextInt();
			
			if(n2>0)
			{
				System.out.println("Enter array value for list 1");
				b=getInput(n2);
				break;
			}else
			{
				System.out.println("your input is wrong.that value must be >0");
			}
		} 
		
		System.out.println("answer");
		int c=returnMethod(a,b);
		
		for(int i=0;i<n1;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println(" ");
		
		for(int i=0;i<n2;i++)
		{
			System.out.print(b[i]+" ");
		}
		System.out.println("First array last element occur index is : "+c);
		
	}
}