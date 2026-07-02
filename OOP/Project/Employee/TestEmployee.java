public class TestEmployee{
	public static void main(String args[]){
		Department dept=new Department();
		dept.addEmployee(new FullTimeEmployee("Murali",1000,25));
		dept.addEmployee(new FullTimeEmployee("kowshi",100,250));
		dept.showEmployee();
	}
}