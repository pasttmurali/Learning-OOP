import java.util.Scanner;
public class abecedarianarray
{
	public static void main(String[]args)
	{
		Scanner scanner =new Scanner(System.in);
		
		System.out.println("Enter a word");
		String word =scanner.nextLine();
		
		
		int n =word.length();
		
		char [] letter=new char[n];
		
		for(int i =0;i<n;i++)
		{
			letter[i]=word.charAt(i);
			
		}
		
		boolean answer=true;
		for(int i=0;i<n-1;i++)
		{
			if(letter[i]<letter[i+1])
			{
				answer=true;
			}else
			{
				answer=false;
				break;
			}
		}
		
		if(answer)
		{
			System.out.println("word is abecedarian");	
		}
		else
		{
			System.out.println("word is not abecedarian");	
		}
		
	}
}