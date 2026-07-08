import java.util.Scanner;

public class html 
{
    public static void main(String[] args)
	{
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the contents:contents are enclosed between a start tag and an end ");
        String word=scanner.nextLine();
		
		char lastc;
		do
		{
		int a=word.indexOf('>');
		int b=word.lastIndexOf('/');
		
		String sub1=word.substring(0,a+1);
		
		//String sub2=word.substring(b);
		char ch =word.charAt(b);
		
		String sub3=word.substring(b+1);
		
		//System.out.println(sub1);

		//System.out.println(ch);
		
		String last =word.charAt(b-1)+sub3;
		
		
		
		//System.out.println(last);
		
		String lastsub="";
		
		if(ch=='/')
		{
			
			if(sub1.equals(last))
			{
				lastsub=word.substring(a+1,b-1);
				//System.out.println(lastsub);
				
			}else
			{
				System.out.println("None");
			}
			
		}
		else
		{
			System.out.println("None");
		}
		
		
		 word=lastsub;
		 
		 
		int length=word.length();
		
		lastc =lastsub.charAt(length-1);
		}while(lastc=='>');

		
		System.out.println(word);
		
    }
}