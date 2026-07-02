import java.util.Scanner;
public class ditherMatrix
{
	public static void main (String args[])
	{
	 Scanner scanner =new Scanner(System.in);
	 int r1,c1;
	
	System.out.print("Enter the row,coloumn size of the dithermatrixmatrix  r0 : ");
	 int n =scanner.nextInt();
	 
	
	
	int dithermatrix[][] =new int[n][n];
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.println("enter value for dithermatrix"+i+" "+j);
			dithermatrix[i][j]=scanner.nextInt();
			
		}
		System.out.println(" ");
		
	}
	
	System.out.println("Inpit dithermatrix is ");
	
	for(int i=0;i<n;i++)
	{
		for(int j=0;j<n;j++)
		{
			System.out.print(dithermatrix[i][j]+" ");
			
		}
		System.out.println(" ");
		
	}

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
	
	int a,b;
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			 a=i%n;
			 b=j%n;
			
			if(matrix1[i][j]>dithermatrix[a][b])
			{
				matrix1[i][j]=1;
			}else
			{
				matrix1[i][j]=0;
			}
			
		}
	
	}
	System.out.println(" ");
	System.out.println("Orderd dithering is ");
	
	for(int i=0;i<r1;i++)
	{
		for(int j=0;j<c1;j++)
		{
			System.out.print(matrix1[i][j]+" ");
			
		}
		System.out.println(" ");
		
	}
	
	}
	
}