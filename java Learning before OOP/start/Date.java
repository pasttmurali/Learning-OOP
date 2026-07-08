import java.util.Scanner;
public class Date{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the month");
		int month=scanner.nextInt();
		System.out.println("Enter the year");
		int year =scanner.nextInt();
		System.out.println("Enter the day");
		int day=scanner.nextInt();
		
		boolean monthValid =month<=12 && month>= 0;
		boolean yearValid=year<=1999 && year >=1000;
		boolean leyear =(year % 400 ==0) || (year % 4 ==0 && year % 100 !=0);
		
		int daysInMonth=0;
		if(monthValid)
		{
			switch(month)
			{
				case 2:
				daysInMonth=leyear ? 29:28;
				break;
				
				case 1:case 3:case 5:case 7:case 9:case 11:
				daysInMonth=31;
				break;
				
				default:
				daysInMonth=30;
				break;
				
			}
		}
		boolean dayValid =(day <= daysInMonth && day >= 1);
		if(monthValid && yearValid && dayValid)
		{
				System.out.println("Date is valid");
				if(leyear)
				{
					System.out.println("it's a leap year");
				}
		
		}
		else
		{
				System.out.println("Date not is valid");
		}
		
	}
}	