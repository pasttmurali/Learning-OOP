import java.util.Scanner;
public class MultidimensionalArray2
{
	public static void main (String[] args)
	{
		Scanner scanner= new Scanner(System.in);
		System.out.println("enter size of array row");
		int r=scanner.nextInt();
		
		System.out.println("enter size of array coloumn");
		int c=scanner.nextInt();
		
		int index[][] =new int[r][c];
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.println("enter value for "+i+" "+j);
				index[i][j]=scanner.nextInt();
			}
		}
		
		//int tem=r;
		//r=c;
		//c=tem;
		
		for(int i=0;i<c;i++)
		{
			for(int j=0;j<r;j++)
			{
				System.out.print(index[j][i]+" ");
			}
			
			
			System.out.println(" ");
		}
		
	}
}