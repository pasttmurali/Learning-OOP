import java.io.File;
import java.io.IOException;

public class CreateFile{
	public static void main(String[] args){
		try{
			File myobj =new File("C:\\Users\\ADMIN\\Documents\\csc\\2nd semi\\program\\OOP\\file handling\\filename.txt");
			if(myobj.createNewFile()){
				System.out.println("File created: "+myobj.getAbsolutePath());
			}else{
				System.out.println("File already exists.");
			}
		
		
		File myobj2 =new File("C:\\Users\\ADMIN\\Documents\\csc\\2nd semi\\program\\OOP\\file handling\\filename2.txt");
			if(myobj2.createNewFile()){
				System.out.println("File created: "+myobj2.getAbsolutePath());
			}else{
				System.out.println("File already exists.");
			}
			
		}catch(IOException e){
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}