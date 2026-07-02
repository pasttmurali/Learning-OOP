public class Circle{
	private Point center;
	private double r;
	private final Point DEFAULT_CENTER=new Point(1,1);
	
	public Circle(double r){
		this.center=DEFAULT_CENTER;
		this.r=r;
	}
	
	public Circle(Point center,double r){
		this.center=center;
		this.r=r;
	}
	
	public Circle(int x,int y,double r)
	{
		this.center=new Point(x,y);
		this.r=r;
	}
	
	public double getRadious()
	{
		return this.r;
	}
	
	public int getCenterX()
	{
		return this.center.getX();
	}
	
	public int getCenterY()
	{
		return this.center.getY();
	}
	
	public void setCenterX(int x)
	{
		this.center.setX(x);
	}
	
	public void setCenterY(int y)
	{
		this.center.setX(y);
	}
	 
	 public String toString()
	 {
		 return "Circle center"+center.toString()+"\n radious="+getRadious();
	 }
}