//Abstract class
abstract class Animal{
	//Abstract method (does not have a body)
	public abstract void animalSound();
	//regular method
	public void sleep(){
		System.out.println("Zzzz");
	}
}

//Subclass(inherit from Animal)
class Pig extends Animal{
	public void animalSound(){
		// The body animalSound() is provide here
		System.out.println("The pig says: wee wee");
	}
}

class Main{
	public static void main(String[] args){
		Pig myPig =new Pig();//create a Pig Object
		myPig.animalSound();
		myPig.sleep();
	}
}