public class Account{
	 private String id,name;
	 private int balance;
	
	public Account(String id, String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	
	public Account(String id,String name){
		this.id=id;
		this.name=name;
		this.balance=0;
	}
	
	public String getId(){
		return this.id;
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getBalance(){
		return 	this.balance;
	}
	
	public Account credit(int amount){
		 this.balance+=amount;
		 return this;
	}
	
	public Account debit(int amount){
		
		if(amount<=this.balance)
		{
			this.balance-=amount;
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return this;
	}
	
	public String toString(){
		return "Account[id="+this.id+",name="+this.name+"balance="+this.balance+"]";
	}
	
	public Account transferTo(Account another,int amount){
		if(amount<=this.balance)
		{
			this.balance-=amount;
			another.balance+= amount;
		}
		else
		{
			System.out.println("Amount exceeded balance");
		}
		return this;
	}
	
	
}