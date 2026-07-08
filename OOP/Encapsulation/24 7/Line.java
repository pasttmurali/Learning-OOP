public class Line{
	private Point begin;
	private Point end;
	
	public Line(int x1,int y1,int x2,int y2)
	{
		this.begin=new Point(x1,y1);
		this.end=new Point(x2,y2);
	}
	
	public Line(Point begin,Point end)
	{
		this.begin=begin;
		this.end=end;
	}
	
	public Point getBegin()
	{
		return this.begin;
	}

	
	public Point getEnd()
	{
		return this.end;
	}

	
	public void setEnd(Point end)
	{
		this.end=end;
	}

	
	public int getBeginX()
	{
		return this.begin.getX();
	}

	
	public void setBeginX(int x)
	{
		this.begin.setX(x);
	}
	
	public int getBeginY()
	{
		return this.begin.getY();
	}
	
	public void setBeginY(int y)
	{
		this.begin.setY(y);
	}
	
	public int getEndX()
	{
		return this.end.getX();
	}
	
	public void setEndX(int x)
	{
		this.end.setX(x);
	}
	
	public int getEndY()
	{
		return this.end.getY();
	}
	
	public void setEndY(int y)
	{
		this.end.setY(y);
	}
	
	public String toString()
	{
		return "Begin=("+this.getBeginX()+","+getBeginY()+")"+"\nEnd=("+this.getEndX()+","+getEndY()+")";
	}
	
	public double getLength()
	{
		return Math.sqrt (((this.getBeginX()-this.getEndX()) * (this.getBeginX()-this.getEndX())) + ((this.getBeginY() -this.getEndY())*(this.getBeginY()-this.getEndY())));
	}
	
	public int[] getBeginXY()
	{
		int[] indexBegin =new int[2];
		indexBegin[0]=begin.getX();
		indexBegin[1]=begin.getY();
		
		return indexBegin;
	}
	
	public int[] getEndXY()
	{
		int[] indexEnd =new int[2];
		indexEnd[0]=end.getX();
		indexEnd[1]=end.getY();
		
		return indexEnd;
	}
	
	public void setBeginXY(int x,int y)
	{	
		begin.setX(x);
		begin.setY(y);
	}
	
	public void setEndXY(int x,int y)
	{		
		end.setX(x);
		end.setY(y);
	}	
	 
}

	 