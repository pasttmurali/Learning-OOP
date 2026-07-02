public class TestBook{
	public static void main(String arg[]){
		
		Author a1=new Author("James_Clear","abc.@gmail.com",'M');
		Author a2=new Author("kiyosaki","abcd.@gmail.com",'M');
		Book b1 =new Book("Atomic_Habits",a1.getEmail(),306,2018,4200);
		Book b2 =new Book("Atomic_Habits2",a1.toString(),400,2027,5000);
		Book b3 =new Book("Rich Dad And Poor Dad",a2.toString(),250,2015,3800);
		System.out.println(b1);
		
		System.out.println("");
		System.out.println(b2);
		
		System.out.println("");
		System.out.println(b3);
		
		System.out.println("");
		System.out.println("Example of author deatail :"+a2);
	
	}
	
}