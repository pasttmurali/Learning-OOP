public class Main{
	public static void main(String args[])
	{
		Beverage b1=new Beverage("Cola",100,Size.MEDIUM,true);
		System.out.println(b1.prepNote());
		System.out.println(b1.price());
		
		Pastry p1=new Pastry ("egg",100,true,true);
		System.out.println(p1.prepNote());
		System.out.println(p1.price());
	}
}