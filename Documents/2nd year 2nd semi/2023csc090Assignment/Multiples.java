import java.util.Scanner;
public class Multiples{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter how many multiples do you want:");
		int times=sc.nextInt();
		System.out.print("Enter a Number for do Multiples:");
		int n=sc.nextInt();
		
		System.out.println("Multiplication chart for "+n+"\n-----------------------\n");
		for(int i=1;i<=n;i++){
			System.out.println(i+" * "+n+" = "+i*n+);
		}
		
	}
}