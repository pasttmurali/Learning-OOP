public class Account
{
	private int id;
	private Customer customer;
	private double balance=0;
	
	public Account(int id,Customer customer,double balance)
	{
		this.id=id;
		this.customer=customer;
		this.balance=balance;
	}
	
	public Account(int id,Customer customer)
	{
		this.id=id;
		this.customer=customer;
	}
}