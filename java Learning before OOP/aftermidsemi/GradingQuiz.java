import java.util.Scanner;
public class GradingQuiz{
	
	public void getinput(int questcount)
	{
		Scanner scanner=new Scanner(System.in);
		int num[]=new int[questcount];
		System.out.println("Enter correct answer for 1 to "+questcount+" question");
		for(int i=0;i<questcount;i++)
		{
			num[i]=scanner.nextInt();
		}
			
		int count=0;
		for(int i=0;i<questcount;i++)
		{
			System.out.println("Enter your answers for "+(i+1)+" question");
			int num1=scanner.nextInt();
			if(num[i]==num1)
			{
				count=count+1;
			}
			
		}
		double per=((double)count/questcount)*100;
		System.out.println("correct number count is :"+count);
		System.out.println("correct percentage is :"+(per));
	
	}
	
	
	public static void main(String args[])
	{
		GradingQuiz ob1=new GradingQuiz();
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter array size");
		int arraysize=scan.nextInt();
		
		
		ob1. getinput(arraysize);
		
	}
}