import java.util.Scanner;

public class Gauss{
	public static void main(String args[])
	
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for x");
		int x=scanner.nextInt();
		System.out.println("Enter a number for n");
		int n=scanner.nextInt();
		int a=1;
		for(i=1,i<2n,i++)
		{
			a=x*x;
		}
		System.out.println(a);
		
	}	

}
