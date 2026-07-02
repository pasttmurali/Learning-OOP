import java.util.Scanner;
public class matrixMaxIncoloumneach
{
	public static void main (String args[])
	{
	 Scanner scanner =new Scanner(System.in);
	 int r1,c1;
	 System.out.print("Enter the row size of the matrix1  r1 : ");
	 r1 =scanner.nextInt();
	 System.out.print("Enter the coloumn size of the matrix1 c1	: ");
	 c1=scanner.nextInt();
	
	int matrix1[][] =new int[r1][c1];

	
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.println("enter value for"+i+" "+j);
			matrix1[i][j]=scanner.nextInt();
			
		}
		System.out.println(" ");
		
	}
	
	System.out.println("Inpit Matrix is ");
	
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print(matrix1[i][j]+" ");
			
		}
		System.out.println(" ");
		
	}
	
	System.out.println(" ");
	System.out.println("maximum element in each coloumn");
	
	for(int i=0;i<c1;i++)
	{
		int max=matrix1[0][i];
		for(int j=0;j<r1;j++)
		{
			if(max<matrix1[j][i])
			{
				max=matrix1[j][i];
				
			}
		}
		
		System.out.print(max+" ");
		
	}
	
	}
	
}