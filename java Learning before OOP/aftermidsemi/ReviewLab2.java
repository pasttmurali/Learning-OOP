import java.util.Scanner;
public class ReviewLab2
{
	 public String numberMeaning()
	 {
		 Scanner userIn = new Scanner(System.in);
		 String retString = "";
		 System.out.print("Welcome to the game! Please enter a number: ");
		 int userVal = userIn.nextInt();
		 
 
		 while(true)
		 {
			if (userVal < -1)
			{
				retString = "Please enter a Valid Number\n";
				
			}
			else if(userVal == -1) 
			{
				break;
				
			}
			else if(userVal > -1)
			{
				retString = "User Number is " + userVal + " and is";
				if (userVal<100)
				{
					retString += " a small number!\n";
				}
				else 
				{
					retString += " a large number!\n";
				}
			}
			System.out.println(retString + "\nEnter a number: ");
			userVal = userIn.nextInt();
			//return "Thanks for playing!";
		 }
		 
		
	return "Thanks for playing!";
	}
	
	public static void main(String args [])
	{
		ReviewLab ob1 = new ReviewLab();
		String output = ob1.numberMeaning();
		System.out.println(output);
	}
}
