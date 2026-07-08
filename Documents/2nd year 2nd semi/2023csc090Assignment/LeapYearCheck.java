import java.util.Scanner;
public class LeapYearCheck{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a year to check:");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0) || year%400==0){
			System.out.println(year+" is a leap Year");
		}else
		{
			System.out.println(year+" is not a leap Year");
		}
		
		sc.close();
 }
}