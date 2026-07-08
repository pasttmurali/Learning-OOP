import java.util.Scanner;
public class Fibonacci{
	public static int fib(int n,int a,int b){
		if(n<0){
			throw new IllegalArgumentException("Please enter a non-negative number.");
		} 
		if(n==0){
			return a;
		}else{
			return fib(n-1,a+b,a);
		}
	}
	
	public static int fib(int n){
		return fib(n,0,1);
	}
	
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a number for find corresponding Fibonacci number: ");
		int n=sc.nextInt();
		System.out.println("Fib("+n+"):"+fib(n));
		sc.close();
	}
	
}
