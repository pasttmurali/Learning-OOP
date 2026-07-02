import java.util.Scanner;
public class Anagrams
{
	public static void main(String args [])
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter string1 ");
		String string1=scanner.nextLine();
		System.out.println("Enter string2 ");
		String string2=scanner.nextLine();
		
		String word1=string1.toLowerCase();
		String word2=string2.toLowerCase();
		
		
		int word1length=word1.length();
		int word2length=word2.length();
		
		if(word1length==word2length)
		{
			for(int i=0;i<word1length;i++)
			{	
					char y =word1.charAt(i);
						System.out.println(y);
			}
		
		}
		else
		{
			System.out.print("not Anagrams");
		}
	}
}
		
		