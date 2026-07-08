import java.util.Scanner;
public class TemperatureConverter
{
	public static void main(String [] args)
		{
		Scanner temp =new Scanner(System.in);
		System.out.println("Enter the temperature in celsius");
		double c =temp.nextDouble();
		double f =(c*9/5)+32;
		System.out.println("The temperature in Fahrenheit is :"+f);

		}
}
