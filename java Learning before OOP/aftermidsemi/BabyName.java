import java.util.Scanner;

public class BabyName
{
	Scanner scanner=new Scanner(System.in);
	public String[] getName()
	{
		
		String namearray[] = new String[2];
		
		System.out.println("Enter father name for firstName1");
		namearray[0]=scanner.nextLine().toLowerCase();
		System.out.println("Enter mother name for firstName2");
		namearray[1]=scanner.nextLine().toLowerCase();
		
		return namearray;
	}
	
	public String[] getHalfName(String[] namearray2)
	{
		//Scanner scanner=new Scanner(System.in);
		String nameHalfarray[] = new String[2];
		nameHalfarray[0]=namearray2[0].substring(0,(namearray2[0].length()/2));
		nameHalfarray[1]=namearray2[1].substring(0,(namearray2[1].length()/2));
	
		return nameHalfarray;
	}

	
	public void babyName(String[] halfname)
	{
		
		System.out.println("Enter the baby gender B: for boy,G: for girl");
		String gender =scanner.nextLine().toLowerCase();
		String BabyName="";
		if(gender.equals("b"))
		{
			BabyName=(halfname[0]+halfname[1]);
		}
		else if (gender.equals("g"))
		{
			BabyName=(halfname[1]+halfname[0]);
		}else
		{
			System.out.println("gender input is wrong ");
		}
	
		System.out.println("Baby name is "+BabyName);
		
	}
	
	public static void main(String args[])
	{
		BabyName ob1 =new BabyName();
		String a[]=ob1.getName();
		
		System.out.println(" ");
		
		ob1.babyName(ob1.getHalfName(a));
	}

}