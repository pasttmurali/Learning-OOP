import java.util.Scanner;
public class Date2{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the valid month");
		int monthValid =scanner.nextInt();
		System.out.println("Enter the valid year");
		int yearValid =scanner.nextInt();
		System.out.println("Enter the day");
		int dayValid =scanner.nextInt();
		
		
		if(monthValid <=12 && monthValid >= 0 )
		{
			System.out.println("Month is valid");
		}
		else
		{
			System.out.println("Month is not valid");
		}
		if(yearValid <=1999 && yearValid >=1000)
			{
				System.out.println("Year is valid");
				
				boolean leyear =(yearValid % 400 ==0) || (yearValid % 4 ==0 &&yearValid % 100 !=0);
				if(leyear)
				{
					System.out.println("it's a leap year");
				}
				else
				{
					System.out.println("it's not a leap year");
				}
			
				int daysInMonth;
				if(monthValid == 2)
				{
					daysInMonth= leyear ? 29:28;
				
				}
				else if(monthValid ==1 || monthValid ==3 || monthValid ==5 || monthValid ==7 || monthValid ==9 || monthValid ==11)
				{
					daysInMonth=31;
				}
				else 
				{
					daysInMonth=30;
				}
				
				
				
				
				if(dayValid <=  daysInMonth && dayValid >=1)
				{
					System.out.println("Date is valid");
				}
				else{
					System.out.println("Date is valid");
				}

				
			}
			else
			{
				System.out.println("Year is not valid");
			}
				
	}
}	