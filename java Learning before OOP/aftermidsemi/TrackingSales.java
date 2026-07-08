import java.util.Scanner;
public class TrackingSales
{
	
	public int[] getSales(int n)
	{
		Scanner scan =new Scanner(System.in);
		
		
		int sales[]=new int[n];
		System.out.println("Enter sales amount each of "+n+" sales people");
		for(int i=0;i<sales.length;i++)
		{
			sales[i]=scan.nextInt();
		}
		return sales;
	
	}
	public void printSales(int num[])
	{
		for(int i=0;i<num.length;i++)
		{
			System.out.println((i+1)+" sales amount is "+num[i]+" ");
		}
		
	}
	
	public int totalSales(int array[])
	{
	
		int sum=0; 
			for(int i=0;i<array.length;i++)
		{
			sum=sum+array[i];
		}
		return sum;
	}
	
	public double averageOfSales(int total,int b)
	{
		double average=total/(double)b;
		return average;
	}
	
	
	public int maximumOfSales(int num1[])
	{
		int max =num1[0];
		for(int i=0;i<num1.length;i++)
		{
			if(max<num1[i])
			{
				max=num1[i];
			}
		}
		return max;
	}
	
	
	
	
	public int minimumOfSales(int num3[])
	{
		int min =num3[0];
		for(int i=0;i<num3.length;i++)
		{
			if(min>num3[i])
			{
				min=num3[i];
			}
		}
		return min;
	}
	
	public int findSalePerson(int num2[],int value)
	{
		
		int count=0;
		for(int i=0;i<num2.length;i++)
		{
			if((value!=num2[i]))
			{
				count=count+1;
			}else
			{
				
				break;
			}
		}
		return count+1;
	}
	
	

	public void limitMethod(int num5[], int limitvalue)
	{
		System.out.println("Below salespeople whose sales exceeded the value");
		int limitcount=0;
		for(int i=0;i<num5.length;i++)
		{
			if(num5[i]>limitvalue)
			{
				limitcount=limitcount+1;
				System.out.println("The  salespeople " +(i+1)+" whose sales amount is "+num5[i]);
				
			}
			
		}
		System.out.println(" ");
		System.out.println("The total number of salespeople whose sales exceeded the value="+limitcount);
	}
		
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of sales peoples for array size");
		int arraysize=scanner.nextInt();
		
		TrackingSales ob1= new TrackingSales();
		int a[]=ob1.getSales(arraysize);
		System.out.println(" ");
		
		
		ob1.printSales(a);
		System.out.println(" ");
		
		int total = ob1.totalSales(a);
		System.out.println("Sales total amount is : "+total);
		
		
		System.out.println("Average Of Sales : "+ob1.averageOfSales(total,arraysize));
		
		System.out.println(" ");		
		System.out.println("Maximum Of Sales : "+ob1.maximumOfSales(a));
		System.out.println("Salesperson "+ ob1.findSalePerson(a,ob1.maximumOfSales(a)) +" had the highest sale with $"+ob1.maximumOfSales(a)+".");
		
		System.out.println(" ");
		System.out.println("Minimum Of Sales : "+ob1.minimumOfSales(a));
		System.out.println("Salesperson "+ ob1.findSalePerson(a,ob1.minimumOfSales(a)) +" had the lowest sale with $"+ob1.minimumOfSales(a)+".");
		
		System.out.println(" ");
		System.out.print("Enter Limit Value=");
		int limitV=scanner.nextInt();
		
		System.out.println(" ");
		
		ob1.limitMethod(a,limitV);
		
		
	}
}