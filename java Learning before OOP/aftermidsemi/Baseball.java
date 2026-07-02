import java.util.Scanner;
public class Baseball
{
	public String[] getinput()
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the data");
		String input=scanner.nextLine();
		String letter [] =input.split(",");
		return letter;
	}
	
	public int[] count(String[] letter)
	{
		int ocount=0,wcount=0,hcount=0,scount=0;
		for(int i=0;i<letter.length;i++)
		{
			switch (letter[i])
			{
				case"w":
				wcount++;
				break;
				
				case"o":
				ocount++;
				break;
				
				case"s":
				scount++;
				break;
				
				case"h":
				hcount++;
				break;
				
				default:
				break;
				
			}
			
		}
		return new int[]{wcount,ocount,scount,hcount};
	}

	public void print(int[] Count)
	{
		int wCount=Count[0];
		int oCount=Count[1];
		int sCount=Count[2];
		int hCount=Count[3];

		System.out.println("w count is "+wCount);
		System.out.println("0 count is "+oCount);
		System.out.println("s count is "+sCount);
		System.out.println("h count is "+hCount);
	}
	
	
	public void percentageFind(int[] array,String[] a)
	{
		int total =array[0]+array[1];
		double percen=(array[0]*100)/total;
		System.out.println(a[0]+" percentage is :"+percen);
	}

	
	public static void main(String args[])
	{
		Scanner scan =new Scanner(System.in);
		Baseball ob1=new Baseball();
		String response;

		do
		{
			String a[]=ob1.getinput();
			int Count[]=ob1.count(a);
			ob1.print(Count);
			ob1.percentageFind(Count,a);
			System.out.println("Do you want to find another player average? yes:Y,No:N");
			response=scan.nextLine().toUpperCase();
			
		}while(response.equals("Y"));
		
	}
}