import java.util.Scanner;
public class ArraySearch{
	public static int elementSearch(int[] numArray,int num){
		for(int i=0;i<numArray.length;i++){
			if(numArray[i]==num){
				return i;
			}
		}
		return -1;
	}
	
	public static int[] sortingArray(int[] numArray){
		int n=numArray.length;
		int temp;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(numArray[j]>numArray[j+1]){
					temp=numArray[j];
					numArray[j]=numArray[j+1];
					numArray[j+1]=temp;
				}
			}
		}
		return numArray;
	}
	
	public static void printArray(int[] numArray){
		for(int i=0;i<numArray.length;i++){
			System.out.print(numArray[i]+" ");
		}
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter value for Array Size");
		int n=sc.nextInt();
		int[] numArray=new int[n];
		for(int i=0;i<n;i++){
			System.out.println("Enter value for Array Element "+(i+1));
			numArray[i]=sc.nextInt();
		}
		
		System.out.print("unsorted Array:");
		printArray(numArray);
		
		System.out.println(" ");
		System.out.print("Enter number for Search:");
		int num=sc.nextInt();
		System.out.println("Number found at index "+elementSearch(numArray,num));
		

		System.out.print("Sorted Array:");
		int[] sortNumArray=sortingArray(numArray);
		printArray(sortNumArray);
		
		sc.close();
	}
}