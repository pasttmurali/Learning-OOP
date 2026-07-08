import java.util.Scanner;
public class PowerOf2
{
	public static void main(String [] args)
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the number");
		int num =scanner.nextInt();
		
		
		
		
			int power=1;
			for(int i =0;i<num;i++)
			{
				System.out.println("2^"+i+"="+power);
				power=power*2;
			}
	
			
		
	}
}



