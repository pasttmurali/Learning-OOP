import java.util.Scanner;
import java.util.Random;
public class Abecedarian
{
	public static void main(String args [])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter a word");
		String word=scanner.nextLine();
		int n=word.length();
		boolean answer=true;
		int i =0;
		while(i<(n-1))
		{
			
			if(word.charAt(i)<word.charAt(i+1))
			{
				answer = true;
			
			}
			else
			{
				answer = false;
				break;
			}
			i++;
		}
		if(answer)
		{
			System.out.println("word is abecedarian ");
		}
		else
		{
			System.out.println("word is not abecedarian");
		}
		
		
	}
}