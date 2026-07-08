import java.util.Scanner;
public class DigitName
{

	public static void  digitName(int n)
	{
		Scanner scan =new Scanner(System.in);
		String name="";
		switch(n)
		{
			case 1:
			name ="one";
			break;
			
			case 2:
			name ="Two";
			break;
			
			case 3:
			name ="Three";
			break;
			
			case 4:
			name ="fOUR";
			break;
			
			case 5:
			name ="five";
			break;
			
			case 6:
			name ="six";
			break;
			
			case 7:
			name ="seven";
			break;
			
			case 8:
			name ="Eight";
			break;
			
			case 9:
			name ="Nine";
			break;
			
			default:
			name ="digit error ";
			break;
			
			
			
		}
		
		System.out.println(name);
		//System.out.println("");
	
	}

	public static void main(String args[])
	{
		/*Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number num");
		int m=scanner.nextInt();*/

		digitName(5);
		digitName(11);
		digitName(0);
		
		
	}
}