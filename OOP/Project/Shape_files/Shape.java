import java.util.*;

abstract class Shape{
	abstract double area();
	
	void displayArea()
	{
		System.out.println("Area: "+area());
	}
}
	
	class Circle extends Shape{
		private double radius;
		
		Circle(double radius)
		{
			this.radius=radius;
		}
		
		double area()
		{
			return Math.PI*radius*radius;
		}
}

	class Square extends Shape{
		private double side;
		
		Square(double side){
			this.side=side;
		}
		
		double area()
		{
			return side*side;
		}
	
}

interface Printable{
		void print();
	}
	
class Document implements Printable{
	private String content;
	
	Document(String content){
		this.content=content;
	}
	
	public void print(){
		System.out.println("Document Content: "+content);
	}
}

class Photo implements Printable{
	private String filename;
	
	Photo(String filename){
		this.filename=filename;	
	}
	
	public void print()
	{
		System.out.println("Printing Photo: "+filename);
	}
	
}


class BankAccount implements Printable{
	private String accountNumber;
	private double balance;
	
	BankAccount(String accNo,double balance){
		this.accountNumber=accNo;
		this.balance=balance;
	}
	void deposit(double amount){
		balance +=amount;
		System.out.println(amount +" deposited.Current Balance: "+balance);
	}
	
	void withdraw(double amount){
		if(amount<=balance)
		{
			balance -=amount;
			System.out.println(amount+"withdarwn. Current Balance: "+balance);
			
		}else
		{
			System.out.println("insufficient balance!");
		}
	}
	
	public void print(){
		System.out.println("Bank statement -> Account: "+accountNumber+",Balance: "+balance);
	}	
}


class Solution{
	public static void main(String arg[]){
		Shape circle =new Circle(5);
		Shape square =new Square(4);
		circle.displayArea();
		square.displayArea();
		System.out.println();
		
		Printable doc =new Document("Java oop Notes");
		Printable photo=new Photo("MYPIC.JPG");
		doc.print();
		photo.print(); 
		
		System.out.println();
		
		BankAccount account =new BankAccount("ACC1123",1000);
		account.deposit(500);
		account.withdraw(300);
		account.print();
		
	}
	
}