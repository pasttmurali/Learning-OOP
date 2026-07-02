import java.util.Scanner;
public class Salary{
	public static void main(String [] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the current salary");
		double currentsalary =scanner.nextDouble();
		
		System.out.println("Enter the performance rating: ");
		int rating =scanner.nextInt();
		
		
		
			if(rating==1)
			{
				double raice1=currentsalary*6/100;
				System.out.println("Amount of your raice: $" +raice1);
				System.out.println("Your new salary:$"+(raice1+currentsalary));
			}
			else if(rating==2)
			{
				double raice2=currentsalary*4/100;
				System.out.println("Amount of your raice: $" +raice2);
				System.out.println("Your new salary:$"+(raice2+currentsalary));
			}else if(rating==3)
			{
				double raice3=currentsalary*1.5/100;
				System.out.println("Amount of your raice: $" +raice3);
				System.out.println("Your new salary:$"+(raice3+currentsalary));
			}
		
	}
}
