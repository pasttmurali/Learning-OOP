import java.util.Scanner;
public class maxExq3
{
	public static void main(String[]args)
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter your word : ");
		String word =scan.nextLine();
		String wordlower =word.toLowerCase();
		
		int count =1;
		int maxcount =0;	
		char maxletter=wordlower.charAt(0);;
		for(int i=0;i<word.length()-1;i++)
		{
			for(int j=(i+1);j<word.length();j++)
			{
				if(wordlower.charAt(i)==wordlower.charAt(j))
				{
					count++;
				}
			}
			if(count>maxcount)
			{
				maxcount =count; 
				maxletter=wordlower.charAt(i);
				
			}
			count=1;
		}
		System.out.println("your highest count character is "+maxletter);
	}
}