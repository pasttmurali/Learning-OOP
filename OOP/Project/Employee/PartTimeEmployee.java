public class PartTimeEmployee extends Employee{
	
	private double salaryPerHour;
	private int workingHours;
	
	public PartTimeEmployee(String name,double salaryPerHour, int workingHours)
	{
		super(name);
		this.salaryPerHour=salaryPerHour;
		this.workingHours=workingHours;
	}
	
	public double calculateSalary(){
		return this.salaryPerHour*this.workingHours;
	}

}