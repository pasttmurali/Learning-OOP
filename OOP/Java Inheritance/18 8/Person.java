public class Person{
	private String name;
	private String address;
	
	public Person(String name,String address)
	{
		this.name=name;
		this.address=address;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public String getAddress()
	{
		return this.address;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAddress(String address)
	{
		this.address=address;
	}
	
	public String toString()
	{
		return "Name is "+getName() +"\nAddress is"+getAddress();
	}
}
class Student extends Person{
	private int numCourse=0;
	private String[] courses=new String[30];
	private int[] grades=new int[30];
	
	public Student(String name,String address){
		super(name,address);
	}
	
	/*public int getNumcourse()
	{
		return this.numCourse;
	}*/
	
	
	
	public String toString()
	{
		return "Student :"+super.toString();
	}
	
	public void addCourseGrades(String course,int grade)
	{
		if(numCourse<30)
		{
			courses[numCourse]=course;
			grades[numCourse]=grade;
			numCourse++;
		}else {
            System.out.println("Maximum number of courses reached");
        }
	}
	
	public void printGrades()
	{
		for(int i=0;i<numCourse;i++)
		{
			System.out.println(courses[i]+" "+grades[i]);
		}
	}
	
	public double getAverageGrade()
	{
		if(numCourse==0) return 0.0;
		int sum=0;
		for(int i=0;i<numCourse;i++)
		{
			sum+=grades[i];
		}
		return (double)sum/numCourse;
	}
}

class Teacher extends Person{
	private int numCourse=0;
	private String[] courses=new String[5];
	
	public Teacher(String name,String address)
	{
		super(name,address);
	}
	
	public boolean addCourse(String course){
		 if (numCourse >= courses.length) {
            System.out.println("Maximum courses reached for teacher");
            return false;
        }
		for(int i=0;i<numCourse;i++)
		{
			if(courses[i].equals(course))
			{
				return false;
			}	
		}
		courses[numCourse]=course;
		numCourse++;
		return true;

	}
	
	public String[] getCoures(){
		return courses;
	}
	public boolean removeCourse(String course)
	{
		int courseIndex=-1;
		for(int i=0;i<numCourse;i++)
		{
			if(courses[i].equals(course))
			{
				courseIndex=i;
				break;
			}
	
		}
		
		if(courseIndex!=-1)
		{
			for(int i=courseIndex;i<numCourse-1;i++)
			{
				courses[i]=courses[i+1];
				
			}
			numCourse--;
			return true;
			
		}
		return false;
	}
	public String toString()
	{
		return "Teacher :"+super.toString();
	}
}

class Main{
	public static void main(String args[])
	{
		Student s1=new Student("Murali","abc");
		s1.addCourseGrades("csc101",90);
		s1.addCourseGrades("csc102",95);
		s1.addCourseGrades("csc103",90);
		System.out.println("Average :"+s1.getAverageGrade());
		System.out.println();
		System.out.println("cousre and grade details");
		s1.printGrades();
		System.out.println();
		s1.toString();
		
		System.out.println();
		Teacher t1=new Teacher("Senthuran","xyz");
		System.out.println(t1);
		
		t1.addCourse("csc101");
		t1.addCourse("csc102");
		t1.addCourse("csc103");
		t1.addCourse("csc104");
		t1.addCourse("csc105");
		
		t1.removeCourse("csc101");
		String[] A=t1.getCoures();
		for(String c:A)
		{
			System.out.println(c);
		}
		
		
		
		
	}
}