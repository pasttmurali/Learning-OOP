import java.util.Scanner;
public class Factorial
{
	public int findFact(int n)
	{
		
		int a=1;
		
			for(int i=1;i<=n;i++)
			{
				a=a*i;
			}
		return a;
	}
	
	public void getsum()
	{
		Scanner scanner =new Scanner(System.in);
		Factorial ob1 =new Factorial();
		int sum=0;
		String response="";
		do
		{
			System.out.println("Enter the a non-negative integer for find fact");
			int n =scanner.nextInt();
			scanner.nextLine();
		if(n>=0)
		{
			int fact=ob1.findFact(n);
			sum=sum+fact;
		}
		else
		{		
			System.out.println("that a nonnegative number is required and ask the user the enter another number");
			sum=sum+0;
		}
			System.out.println("do you want to Enter the a non-negative integer for find fact? yes:Y, No:N");
			response=scanner.nextLine().toUpperCase();
			
		}while(response.equals("Y"));
		System.out.println(sum);
		
	}

	public static void main(String args[])
	{
		
		Factorial ob2 =new Factorial();
		Scanner scan =new Scanner(System.in);
		ob2.getsum();
		

	}
}