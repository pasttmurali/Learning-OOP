import java.util.Scanner;
public class ArrayAndCollection{
	public static void main(String[] args){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a sentence");
		String sentence=sc.nextLine();
		String[] stringArray=sentence.split("\\s");
	
		for(String s:stringArray){
			String rev="";
			for(int i=s.length()-1;i>=0;i--){
				rev+=s.charAt(i);
			}
			System.out.print(rev+" ");
		}
		sc.close();
		
	}
}