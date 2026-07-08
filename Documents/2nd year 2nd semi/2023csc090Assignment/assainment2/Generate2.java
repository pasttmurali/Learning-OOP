import java.util.Scanner;
public class Generate2{
	
	public static void printPattern(String word,int n){
		System.out.println(word.substring(0, n));
		if (n == 1) {
            return;
        }
		printPattern(word, n - 1);
		System.out.println(word.substring(0, n));
	}
	
	public static void printPattern(String word){
		printPattern(word,word.length());
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a word for pattern: ");
		String word=sc.nextLine();
		System.out.println("");
		System.out.println("\n  pattern\n-----------\n");
		printPattern(word);	
	}
}
