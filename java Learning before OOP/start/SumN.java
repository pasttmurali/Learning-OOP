import java.util.Scanner;

public class SumN{
	
	static void SumMethod()
	{
		
	Scanner scanner =new Scanner(System.in);
	System.out.println("Enter the  number n1");
	int n1 =scanner.nextInt();
	String answer;
	int sum=n1;
	do
	{
		System.out.println("Enter the next number n2");
		int n2 =scanner.nextInt();
		sum=sum+n2;
		System.out.println("current sum"+sum);
		System.out.println("Do you addition another number:y or N");
		scanner.nextLine(); 
		answer =scanner.nextLine();
	
	}while(answer.equalsIgnoreCase("y"));
	System.out.println("final sum"+sum);
	
	}
		
	public static void main(String args[])
	
	{
		SumMethod();
		
		System.out.println("--------------------------");
		
		SumMethod();
	}	

}
