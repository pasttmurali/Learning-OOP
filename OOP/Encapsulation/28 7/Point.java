public class Point{
	private int x;
	private int y; 
	
	public Point()
	{
		x=0;
		y=0;
	}
	
	public Point(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public int getX()
	{
		return this.x;
	}
	
	public int getY()
	{
		return this.y;
	}
	
	public void setX(int x)
	{
		this.x=x;
	}
	
	public void setY(int y)
	{
		this.y=y;
	}
	
	public String toString()
	{
		return "Point=("+this.x+","+this.y+")";
	}
	
	public int[] getXY()
	{
		int[] index =new int[2];
		index[0]=this.x;
		index[1]=this.y;
		return index;
	}
	
	public void setXY(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	public double distance(int x,int y)
	{
		return 	Math.sqrt((this.x-x)*(this.x-x) +(this.y-y)*(this.y-y));
	}
	
	public double distance(Point another)
	{
		return 	Math.sqrt((this.x-another.x)*(this.x-another.x) +(this.y-another.y)*(this.y-another.y));
	}
	
	public double distance()
	{
		return Math.sqrt((this.x*this.x)+(this.y*this.y));
	}
	
}