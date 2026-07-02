public class TestAccount{
	public static void main(String args[]){
		Account a1=new Account("11","murali",2000);
		Account a2=new Account("22","gowshi");
		
		
		//System.out.println(a1.credit(10000));
		System.out.println(a1.transferTo(a2,15000));
		System.out.println(a2);
		
	}
}