import java.util.Scanner;
public class lettercount
{
	public static void main (String args[])
	{
	 Scanner scanner =new Scanner(System.in);
	 System.out.println("enter the sentense");
	 String senten=scanner.nextLine();

	 System.out.println("enter the character");
	 
	 char ch=scanner.nextLine().charAt(0);
	 
	 
	 int n=senten.length();
	 
	 
	 char[] index =new char[n];
	
	 for(int i=0;i<n;i++)
	 {
		 index[i]=senten.charAt(i);
	 }
	 
	 
	 for(int i=0;i<n;i++)
	 {
		 System.out.print(index[i]+" ");
	 }
	 
	 int count=0;
	
		
		for(int i=0;i<n;i++) 
		{
			if(ch==index[i])
			{
				count=count+1;
			}
		}
		
		System.out.println(" ");
		System.out.println(count);
	
	}
	
}