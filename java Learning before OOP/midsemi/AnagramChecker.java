import java.util.Scanner;

public class AnagramChecker 
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a word1: ");
        String word1 = scanner.nextLine();
		
		System.out.print("Enter a word2: ");
        String word2 = scanner.nextLine();
		
		String word1Lower=word1.toLowerCase();
		String word2Lower=word2.toLowerCase();
        
        
        
		String changeWord1Alphabet = "";
        
		String changeWord2Alphabet = "";
        for (char c = 'a'; c <= 'z'; c++)
		{
			
          
            for (int i = 0; i < word1Lower.length(); i++)
			{
                
                if (word1Lower.charAt(i) == c)
				{
                    
                   changeWord1Alphabet +=c;
				   System.out.println(changeWord1Alphabet);
                }
            }
        }
		
		 for (char c = 'a'; c <= 'z'; c++)
		{
          
            for (int i = 0; i < word2Lower.length(); i++)
			{
                
                if (word2Lower.charAt(i) == c)
				{
                    
                    changeWord2Alphabet +=c;
					 System.out.println(changeWord2Alphabet);
                }
            }
        }
		
		if(changeWord1Alphabet.equals(changeWord2Alphabet))
		{
			System.out.println("word 1 and word2 are anagram");
		}
		else
		{
			System.out.println("word 1 and word2 are not anagram");
		}
        
        
        //System.out.println("In alphabetical order: " +changeWord1Alphabet);
        
    }
}