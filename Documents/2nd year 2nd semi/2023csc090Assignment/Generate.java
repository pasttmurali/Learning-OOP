import java.util.Scanner;
public class Generate{
	
	public static void generate(char[] arr,String a,int index){
		System.out.println(a);
		for(int i=index;i<arr.length;i++){
			generate(arr,a+arr[i],i+1);
		}
		
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter characters using space");
		char[] arr={'a','b','c'};
		generate(arr,"",0);
		
	}
}