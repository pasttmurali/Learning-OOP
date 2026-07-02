import java.util.Scanner;
public class tag_based
{
	public static void main(String args[]){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter tag_based sentense");
		String tagbased =scanner.nextLine();
		
		int n=tagbased.length();
		char[] index =new char[n];
		
		for(int i =0;i<n;i++)
		{
			index[i]=tagbased.charAt(i);
		}
		
		boolean abc = (index[0]=='<' && index[n-1]=='>');
		
		int a =tagbased.indexOf('>');
		
		
		String firsttag="";
		for(int i =0;i<=a;i++)
		{
			firsttag=firsttag+index[i];
		}
		
		System.out.println(firsttag);
		
		int b=tagbased.lastIndexOf('/');
		
		String lasttag="";
		for(int i =b+1;i<=n-1;i++)
		{
			lasttag=lasttag+index[i];
		}
		String finalLasttag= tagbased.charAt(b-1)+lasttag;
		
		System.out.println(finalLasttag);
		
		String output="";
		if(finalLasttag.equals(firsttag))
		{
			output=tagbased.substring(a+1,b-1);
		}
		
		System.out.println(output);
		
		
		/*if(abc)
		{
			System.out.println("true");
		}*/
		
		
		
		
		
	}
}