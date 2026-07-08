public class TestTime{
	public static void main(String args[]){
		Time t1=new Time(50,50,10);
		System.out.println(t1.toString());
		
		
		Time t2 =new Time();
		System.out.println(t2.toString());
		
		t1.setHour(4);
		t1.setMinute(5);
		t1.setSecond(6);
		System.out.println(t1.toString());
		
		t1.setTime(58, 59, 23);
		System.out.println(t1);
		
		
		
		
		System.out.println(t1.nextSecond());
	}
}