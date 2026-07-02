import java.util.Date;
public class TestDate{
	public static void main(String args[]){
		MyDate d1=new MyDate(2020,2,25);
		System.out.println(d1.toString());
		
		 d1.setYear(2012);
		 d1.setMonth(12);
		 d1.setDay(23);
		 System.out.println(d1);
		 
		  System.out.println("Year is: " + d1.getYear());
		  System.out.println("Month is: " + d1.getMonth());
		  System.out.println("Day is: " + d1.getDay());
		  
		   d1.setDate(2988, 1, 2);
			System.out.println(d1);
	}
}