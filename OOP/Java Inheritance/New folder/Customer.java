public class Customer{
	private int id;
	private String name;
	private char gender;
	
	public Customer(int id,String name,char gender)
	{
		this.id=id;
		this.name=name;
		this.gender=gender;
	}
	
	public int getId()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public char getGender()
	{
		return this.gender;
	}
	
	public String toString()
	{
		return getName()+"("+getId()+")";
	}
}

class Account extends Customer{
	private int aid;
	private double balance=0;
	
	public Account(int aid,int id,String name,char gender,double balance)
	{
		super(id,name,gender);
		this.aid=aid;
		this.balance=balance;
	}
	
	public Account(int aid,int id,String name,char gender)
	{
		super(id,name,gender);
		this.aid=aid;
		
	}
	
	public int getId()
	{
		return this.aid;
	}
	
	public double getBalance()
	{
		return this.balance;
	}
	
	public void setBalance(double balance)
	{
		this.balance=balance;
	}
	
	public String getCusomerName()
	{
		return super.toString();
	}
	
	public String toString()
	{
		return super.toString()+"balance=$"+getBalance();
	}
	
	public 	Account deposit(double amount)
	{
		balance=amount+balance;
		return this;	
	}
	
	public Account withdraw(double amount)
	{
		if(amount<this.balance)
			{
				balance=balance-amount;
			}else
			{
				System.out.println("amount withdarn exceeds the current balance") ;
			}
		return this;
	}
	
}
class Main{
	public static void main(String[] args){
		Account a1=new Account(11,22,"Murali",'M',1000);
		a1.withdraw(200);
		System.out.println(a1);
	}
}