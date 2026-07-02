import java.util.List;
import java.util.ArrayList;
public class Department{
	private List<Employee> employees=new ArrayList<>();
	
	public Department(){
		
	}
	
	public void addEmployee(Employee employee){
		employees.add(employee);
	}
	
	public void showEmployee(){
		for(Employee e:employees){
			System.out.println(e.getName()+" "+ e.calculateSalary());
		}
	}
}