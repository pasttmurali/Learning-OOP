public class FullTimeEmployee extends Employee{
	
	private double salaryPerday;
	private int workingdays;
	
	public FullTimeEmployee(String name ,double salaryPerday, int workingdays)
	{
		super(name);
		this.salaryPerday=salaryPerday;
		this.workingdays=workingdays;
	}
	
	public double calculateSalary(){
		return this.salaryPerday*this.workingdays;
	}

	
}