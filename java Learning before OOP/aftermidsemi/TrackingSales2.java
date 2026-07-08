import java.util.Scanner;
public class TrackingSales2
{
	
	public int[] getSales(int n)
	{
		
		
		Scanner scanner =new Scanner(System.in);
		int sales[]=new int[n];
		System.out.println("Enter sales amount");
		for(int i=0;i<sales.length;i++)
		{
			sales[i]=scanner.nextInt();
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
	
	public double averageOfSales(int total, int b)
	{
		double average=total/b;
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
	
	
	public int maxSalePerson(int num2[],int maxamount)
	{
		
		int count=0;
		for(int i=0;i<num2.length;i++)
		{
			if((maxamount!=num2[i]))
			{
				count=count+1;
			}else
			{
				
				break;
			}
		}
		return count+1;
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
	
	
	public int miniSalePerson(int num4[],int minamount)
	{
		
		int count=0;
		for(int i=0;i<num4.length;i++)
		{
			if((minamount!=num4[i]))
			{
				count=count+1;
			}else
			{
				
				break;
			}
		}
		return count+1;
	}
	
	public static void mymethod(){
		
		TrackingSales2 ob1=new TrackingSales2();
		Scanner scan =new Scanner(System.in);
		
		System.out.println("Enter array Size");
		int arraysize=scan.nextInt();
		
		int a[]=ob1.getSales(arraysize);
		System.out.println(" ");
		
		
		ob1.printSales(a);
		System.out.println(" ");
		System.out.println("Sales total amount is : "+ob1.totalSales(a));
		
		System.out.println(" ");
		System.out.println("Average Of Sales : "+ob1.averageOfSales(ob1.totalSales(a),arraysize));
	
		System.out.println(" ");
		System.out.println("Maximum Of Sales : "+ob1.maximumOfSales(a));
		
		System.out.println(" ");
		System.out.println("Salesperson "+ ob1.maxSalePerson(a,ob1.maximumOfSales(a)) +" had the highest sale with $"+ob1.maximumOfSales(a)+".");
		
		System.out.println(" ");
		System.out.println("Salesperson "+ ob1.miniSalePerson(a,ob1.minimumOfSales(a)) +" had the highest sale with $"+ob1.minimumOfSales(a)+".");
		
	}
	
	public static void main(String args[])
	{
		
		mymethod();
		
	}
}