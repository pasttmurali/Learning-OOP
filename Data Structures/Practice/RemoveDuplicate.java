import java.util.Scanner;
class StackArrayBasedADT{
	private int[] stack;
	private int top;
	private int max;
	
	StackArrayBasedADT(int size){
		max=size;
		stack =new int[max];
		top=-1;
	}
	
	boolean isEmpty(){
		return top == -1;
	}
	
	boolean isFull(){
		return top == max-1;
	}
	
	public void push(int item){
		if(isFull()){
			System.out.println("Stack overflow");
			return;
		}else{
			stack[++top]=item;
			//System.out.println("Push into System");
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack underflow");
			return -1;
		}
		int item=stack[top];
		top--;
		return item;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return -1;
		}
		
		return stack[top];
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return;
		}
		
		int temp=top;
		
		while(temp != -1){
			System.out.print(stack[temp]+" ");
			temp--;
		}
	}
	
	public int getSize(){
		return top + 1;
	}
	
	public void clear(){
		top = -1;
	}
	
	public boolean contains(int item){
		for(int i = 0; i <= top; i++){
			if(stack[i] == item){
				return true;
			}
		}
		return false;
	}

	
}

public class RemoveDuplicate{
	
	public static void removeDuplicate(StackArrayBasedADT stack){
		StackArrayBasedADT newStack=stack;
		StackArrayBasedADT unique=new StackArrayBasedADT(stack.getSize());
		
		while(!newStack.isEmpty()){
			int item=newStack.pop();
			if(!newStack.contains(item)){
				unique.push(item);
			}
		}
		unique.display();
	}
	
	public static void main(String args[]){
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter size for stack : ");
		int n =sc.nextInt();
		
		StackArrayBasedADT stack =new StackArrayBasedADT(n);
		
		for(int i=0;i<n;i++){
			System.out.print("Enter value for stack element "+(i+1)+" : ");
			int item=sc.nextInt();
			stack.push(item);
		}
		
		System.out.println("");
		
		System.out.print("Original Stack : ");
		stack.display();
		
		System.out.println("");
		
		System.out.print("Unique Stack : ");
		removeDuplicate(stack);
	}
}
		