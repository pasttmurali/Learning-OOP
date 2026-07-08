import java.util.Scanner;
public class StringCount
{
	public static char[] wordArray(String word)
	{
		char[] letterarray=new char[word.length()];
		for(int i=0;i<letterarray.length;i++)
		{
			letterarray[i]=word.charAt(i);
		}
		return letterarray;
	}
	
	public static char[] sortletterArray(char[] getarray)
	{
		char temp;
		for(int j=0;j<getarray.length-1;j++)
		{
			for(int i=0;i<getarray.length-1;i++)
			{
				if(getarray[i]>getarray[i+1])
				{
					temp=getarray[i+1];
					getarray[i+1]=getarray[i];
					getarray[i]=temp;
				}
			}
		}
		return getarray;
	}
	
	public static void minArray(char[] array)
	{
		char[] minarray=new char[array.length];
		
		minarray[0]=array[0];
		int j =1;
			for(int i=0;i<array.length-1;i++)
			{
				if(array[i]!=array[i+1])
				{
					minarray[j]=array[i+1];
					j++;
				}
			}
			
		char[] minarray1=new char[j];
		for(int i=0;i<j;i++)
		{
			minarray1[i]=minarray[i];
		}
		
		
		
		int[] countarray =new int[array.length];
		int f=0;
		int count=1;
		for(int i=1;i<array.length;i++)
		{
			if(array[i-1]==array[i])
			{
				count++;
				countarray[f]=count;
			}else
			{
				f++;
				count=1;
				countarray[f]=count;
				
				
			}
		}
		
		
		int[] countarray1=new int[f+1];
		for(int i=0;i<=f;i++)
		{
			countarray1[i]=countarray[i];
		}
		
		int max=countarray1[0];
		int a=0;
		for(int i=0;i<=f;i++)
		{
			if(max<countarray1[i])
			{
				max=countarray1[i];
				a=i;
			}
		}
		
		System.out.println("maximum letter is "+minarray1[a]+" .its count is "+countarray1[a]);
		
	}
	
/*	public static int[] FindMax(char[] getarray1)
	{
		int[] countarray =new int[getarray1.length];
		int f=0;
		int count=1;
		for(int i=1;i<getarray1.length;i++)
		{
			if(getarray1[i-1]==getarray1[i])
			{
				count++;
				countarray[f]=count;
			}else
			{
				f++;
				count=1;
				countarray[f]=count;
				
				
			}
		}
		
		
		int[] countarray1=new int[f+1];
		for(int i=0;i<=f;i++)
		{
			countarray1[i]=countarray[i];
		}
		
		return countarray1;
		
	}*/
	
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a word for String");
		String word1 =scanner.nextLine();
		
		char[] a=wordArray(word1);
		char[] sortarray=sortletterArray(a);
		//char[] minarray=minArray(sortarray);
		/*int[] findmaxletter=FindMax(sortarray);
		for(int i=0;i<findmaxletter.length;i++)
		{
			System.out.print(findmaxletter[i]+" ");
		}*/
		
	
		minArray(sortarray);
	}
}