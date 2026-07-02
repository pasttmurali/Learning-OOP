import java.util.Scanner;
import java.util.Random;
public class Rock{
	public static void main(String [] args)
	{
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		
		
		
		int computerinput =random.nextInt(2);
		String computerplay;
		switch(computerinput)
		{
			case 0:
			computerplay="R";
			break;
			
			case 1:
			computerplay="P";
			break;
			
			case 2:
			computerplay="S";
			break;
			
			default:
			computerplay="UNKNOWN";
			break;
		}
		System.out.println("Enter your play R or P or S  ");
		String userplay =scanner.nextLine();
		System.out.println("computerplay is : "+computerplay);
		
		
		
		if(computerplay.equals("S") && userplay.equals("R") )
		{
			System.out.println("Rock crushes scissors, you win!");
		}
		else if(computerplay.equals("P") && userplay.equals("R"))
		{
			System.out.println("you loss!");
		}
		else if(computerplay.equals("S") && userplay.equals("P"))
		{
			System.out.println("scissors cuts the paper ,you loss!");
		}
		else if(computerplay.equals("R") && userplay.equals("P"))
		{
			System.out.println("you win!");
		}
		else if(computerplay.equals("R") && userplay.equals("S"))
		{
			System.out.println("Rock crushes scissors,you loss!");
		}
		else if(computerplay.equals("P") && userplay.equals("S"))
		{
			System.out.println("scissors cuts the paper ,you win!");
		}
		else
		{
			System.out.println("Both are same.Try again");
		}
		
		
	}
}