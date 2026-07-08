import java.util.Scanner;
public class MultidimensionalArray1
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
		
		
		//int lencol=index[1].length;
		//int lenrow=index.length;
		//System.out.println(lenrow);
		//System.out.println(lencol);
		
		int temp;
		for(int i =0;i<r;i++)
		{
			for(int a=0;a<c-1;a++)
			{
				
			for(int j=0;j<c-1;j++)
			{
				
				if(index[i][j]>index[i][j+1])
				{
					temp=index[i][j];
					index[i][j]=index[i][j+1];
					index[i][j+1]=temp;
				}
			}
			}
		}
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				System.out.print(index[i][j]+" ");
			}
			
			
			System.out.println(" ");
		}
		
	}
}