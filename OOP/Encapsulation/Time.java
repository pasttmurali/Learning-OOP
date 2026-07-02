public class Time{
	private int hour,minute,second;
	
	public Time(int second ,int minute, int hour){
		this.hour=hour;
		this.minute=minute;
		this.second=second;
	}
	public Time(){
		this.hour=0;
		this.minute=0;
		this.second=0;
	}
	
	public int getHour(){
		return this.hour;
	}
	
	public int getSecond(){
		return this.second;
	}
	
	public int getMinute(){
		return this.minute;
	}
	
	public void setHour(int hour){
		this.hour=hour;
	}
	
	public void setMinute(int minute){
		this.minute=minute;
	}
	
	public void setSecond(int second){
		this.second=second;
	}
	
	public String toString(){
		return String.format("%02d:%2d:%02d",hour,minute,second);
	}
	
	public void setTime(int second,int minute, int hour){
		this.second=second;
		this.minute=minute;
		this.hour=hour;
	}
	
	public Time nextSecond(){
		++second;
		if(second>=60){
			second=0;
			++minute;
			if(minute >=60){
				minute=0;
				++hour;
				if(hour>=24){
					hour=0;
				}
			}
			
		}
		return this;
	}
}