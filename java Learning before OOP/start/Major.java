import java.util.Scanner;
public class Major
{
	public static void main(String [] args)
	{
		Scanner scanner =new Scanner
		(System.in);
	System.out.println("Enter two characters{[M or C or I] with [1 or 2 or 3 or 4]} eg:-M1" );
		String Char =scanner.nextLine();
		char char1 =Char.charAt(0);
		char char2=Char.charAt(1);
		
		
		String Subject;
		switch(char1){
			case 'M':
			Subject ="Mathematics ";
			break;
			
			case 'C':
			Subject ="Computer Science  ";
			break;
			
			case 'I':
			Subject ="Information Technology";
			break;
			
			default:
			Subject="wrong input";
			break;
		}
		

		String student;
		switch(char2){
			case '1':
			student ="freshman";
			break;
			
			case '2':
			student ="sophomore";
			break;
			
			case '3':
			student ="junior";
			break;
			
			case '4':
			student ="senior";
			break;
			
			default:
			student="your input is wrong";
			break;
		}
		
		System.out.println(Subject+" "+student);
		
		
		
		
		
	}
}