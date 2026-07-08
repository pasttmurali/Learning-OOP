import java.util.Scanner;
public class MissingNumber1
{
	public int[] getArray()
	{
		Scanner scanner =new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=scanner.nextInt();
		
		int[] innarray=new int[n];
		
		
		for(int i=0;i<innarray.length;i++)
		{
			System.out.print("enter the value in range 0 to "+n+" for index "+i+" :");
			int x =scanner.nextInt();
			while(true)
			{
				
					if(x>=0 && x<=n)
					{
							boolean isDuplicate = false;

							for (int j = 0; j < i; j++)
							{
								if (innarray[j] == x)
								{
									isDuplicate = true;
									break;
								}
							}

							if (!isDuplicate)
							{
								innarray[i] = x;
								break;
							}
							else
							{
								System.out.print("Your input is same as a previous value. Please enter a different value in range 0 to " + n + " for index " + i + " : ");
								x = scanner.nextInt();
							}
					}
					else
					{
						System.out.print("your input is wrong . please enter the value in range 0 to "+n+" for index "+i+" :");				
						 x =scanner.nextInt();
					}
			}
		}
	
		return innarray;
	}
	
	public void findMissing(int[] array)
	{
		int missnum=0;
		boolean check=false;
		for(int i=0;i<=array.length;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				if(i==array[j])
				{
					check=true;
					break;
				}
				else
				{
					check=false;
				}
			}
			
			if(!check)
			{
				missnum=i;
				System.out.println("");
				System.out.println("missing number is "+missnum);
				break;
			}
			
		}
				
		
	}
		
	public static void main(String[] args)
	{
		MissingNumber1 ob1=new MissingNumber1();
		int a[]=ob1.getArray();
		System.out.println("");
		System.out.println("inputarray is ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		ob1.findMissing(a);
	}
}