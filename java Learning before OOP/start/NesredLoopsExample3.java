public class NesredLoopsExample3
{
	public static void main(String [] args)
	{
		
		for(int i =1;i<=4;i++)
		{
			System.out.println("week "+i+":");
			for(int j=1;j<=7;j++)
			{
				if(j%2==0)
				{
					System.out.println("\tDay "+j);
				}
			}
		}
		
		
		
	}
}