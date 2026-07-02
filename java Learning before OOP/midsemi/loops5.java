import java.util.Scanner;
public class loops5
{
	public static void main(String [] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number 1");
		int num1 =scanner.nextInt();
		
		System.out.println("Enter the number 2");
		int num2 =scanner.nextInt();
		int answer=1;
		for(int i =num2;i>=1;i--)
		{
		
			answer=answer*num1;
		}
	
		System.out.println(answer);
	}
}