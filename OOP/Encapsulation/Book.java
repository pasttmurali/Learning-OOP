public class Book{
	private int page,year;
	private double price;
	private String title;
	private String author;

	
	public Book(String title,String author,int page,int year,double price){
		this.title=title;
		this.author=author;
		this.year=year;
		this.page=page;
		this.price=price;
		
	}
	
	public double getPrice(){
		return price;
	}
	
	public int getPage(){
		return page;
	}
	
	public int getYear(){
		return year;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public String getTitle(){
		return title;
	}
	
	public String toString()
	{
		return ("Title: "+this.title+"\n"+"Author details: "+ this.author+"\n"+"price is "+this.price+"\n"+"pages are "+this.page+"\n"+"publication is "+this.year);
	}
	
}