import java.util.Scanner;

public class UsernameValidator 
{
    public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the user name");
		String userName=scanner.nextLine();
		//System.out.println(userName);
		int n=userName.length();
		
			boolean count= n>=8 && n<=32;
			
			
			char c =userName.charAt(0);
			boolean firstletter=c >='A' && c<='Z';
			
			
		
		boolean isvalid=true;
		if(count && firstletter)
		{
		
			for(int i =0;i<n;i++)
			{			
			
				char ch =userName.charAt(i);
			
				if(!((ch>='a' && ch <='z') || (ch>='A' && ch <='Z') || (ch>='0' && ch<='9') || ch == '_' ))
				{
					isvalid=false;
					break;
				}
				
				
				
			}	
			
				if(isvalid)
				{
					System.out.println("valid");
				}
				else
				{
					System.out.println("Invalid");
				}
		}
		else
		{
			System.out.println("invalid");
		}
		
		
		
			
			

		
    }
}