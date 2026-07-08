import java.util.Scanner;
public class CreditCard{
	public static void main(String [] args){
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the previous balance");
		double previousBalance =scanner.nextDouble();
		System.out.println("Enter the additional charges");
		double additionalCharges =scanner.nextDouble();
		System.out.println("CS CARD International Statement ");
		System.out.println("================================");
		System.out.println("Previous Balance:\t$"+previousBalance);
		System.out.println("Additional Charges:\t$"+additionalCharges);
		double previoustotalbalance =previousBalance+additionalCharges;
		if(previoustotalbalance >0)
		{
			double interest = previoustotalbalance*2/100;
			System.out. println("Interest:\t\t$"+interest);
			double newBalance=previoustotalbalance+interest;
			System.out.println("New balance:\t\t$"+newBalance);
			if(newBalance <+50)
			{
				System.out.println("Minimum payment:\t$"+newBalance);
			}
			else if(newBalance >50 && newBalance <300)
			{
				System.out.println("Minimum payment:\t$50");
			}
			else
			{
			double newPayment =newBalance*20/100;
			System.out.println("Minimum payment:\t$"+newPayment);
			
			}
		}
		else
		{
			System.out.println("the previous balance was 0 ");
		}
	
	}

}