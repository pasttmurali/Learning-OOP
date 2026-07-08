import java.util.Scanner;
public class matrixMultification
{
	public static void main (String args[])
	{
	 Scanner scanner =new Scanner(System.in);
	 int r1,r2,c1,c2;
	 System.out.print("Enter the row size of the matrix1  r1 		: ");
	 r1 =scanner.nextInt();
	 System.out.print("Enter the coloumn size of the matrix1 c1		: ");
	 c1=scanner.nextInt();
	 System.out.print("Enter the row size of the matrix r2		: ");
	 r2=scanner.nextInt();
	 System.out.print("Enter the coloumn size of the matrix c2	: ");
	 c2=scanner.nextInt();
	
	int matrix1[][] =new int[r1][c1];
	int matrix2[][] =new int[r2][c2];
	
	if(c1==r2)
	{
	
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
	
	System.out.println("");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.println("enter value for"+i+" "+j);
			matrix2[i][j]=scanner.nextInt();
			
		}
		
		System.out.println(" ");
	}
	
	System.out.println("Inpit Matrix is ");
	for(int i=0;i<r2;i++)
	{
		for(int j=0;j<c2;j++)
		{
			System.out.print(matrix2[i][j]+" ");
			
		}
		System.out.println(" ");
		
	}
	int sum,a;
	
	
	int matrix3[][] =new int[r1][c2];
	
	
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				sum=0;
				
					for(int c=0;c<r2;c++)
					{
						
						
						 a=matrix1[i][c] * matrix2[c][j];
						sum=sum+a;
					}
					matrix3[i][j]=sum;
				
			}
			
		}
		
		System.out.println(" ");
		System.out.println("mulyification matrix is ");
		
		for(int i=0;i<r1;i++)
		{
			for(int j=0;j<c2;j++)
			{
				System.out.print(matrix3[i][j]+" ");
			
			}
			System.out.println("  ");
		}
	}else
	{
		System.out.println(" we cant multification matrix1 and matrix2 ");
	}
	
	}
}