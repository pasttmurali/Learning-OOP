import java.util.Scanner;
public class Election
{
	public int[] getvotePrecinct()
	{
		Scanner scanner=new Scanner(System.in);
		
		int voteinpresint[] =new int[2];
		
		System.out.println("number of votes for Polly in each precinct");
		voteinpresint[0]=scanner.nextInt();
		
		System.out.println("number of votes for Ernest in each precinct");
		voteinpresint[1]=scanner.nextInt();
		
		return voteinpresint;
	}
	
public static void main (String[] args)
{
	Election ob1=new Election();
	int votesForPolly; 
	int votesForErnest;
	int totalPolly;
	int totalErnest; 
	String response;
	
	Scanner scan = new Scanner(System.in);
	System.out.println ();
	System.out.println ("Election Day Vote Counting Program");
	System.out.println ();

	int pollyWoncount=0,ernestcountWon=0,tiescount=0;

	
		double percentagePolly;
		double percentageErnest;
		int totalVotes;
		
		totalPolly=0;
		totalErnest=0;
		do
		{
			int a[]=ob1.getvotePrecinct();
			votesForPolly=a[0];
			votesForErnest=a[1];
			
			totalPolly=totalPolly+votesForPolly;
			totalErnest=totalErnest+votesForErnest;
			
			System.out.println(" ");
			System.out.print("the user whether or not there are more precincts to report ");
			response=scan.nextLine().toUpperCase();
			
			
			
			if(a[0]>a[1])
			{
				pollyWoncount++;
			}else if(a[0]<a[1])
			{
				ernestcountWon++;
			}
			else 
			{
				tiescount++;
			}
			
		}while(response.equals("Y"));
		
		totalVotes=totalPolly+totalErnest;
		
			percentagePolly=((double)totalPolly/totalVotes)*100;
			percentageErnest=((double)totalErnest/totalVotes)*100;
			
	
		System.out.printf("Polly percentage is :%.4f\n",percentagePolly);
		System.out.printf("Ernest percentage is :%.4f\n",percentageErnest);
		
		System.out.println(" ");
		

		System.out.println(" Polly won count is "+pollyWoncount);
		System.out.println(" Ernest won count is "+ernestcountWon);
		System.out.println(" number of both are equals count is "+tiescount);
		
		



}
}