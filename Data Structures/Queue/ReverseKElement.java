import java.util.*;
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
		
		System.out.print("Stack : ");
		
		int temp=top;
		
		while(temp != -1){
			System.out.print(stack[temp]+" ");
			temp--;
		}
	}
	
	public int size(){
		return top + 1;
	}
	
	public void clear(){
		top = -1;
	}
	
	public void reverseDisplay(){
		if(isEmpty()){
			System.out.println("Stack is empty");
			return;
		}

		for(int i = 0; i <= top; i++){
			System.out.println(stack[i]);
		}
	}
}

class ArrayQueueADT{
	private int[] queue;
	private int rear;
	private int front;
	private int capacity;
	
	public ArrayQueueADT(int capacity){
		this.capacity=capacity;
		queue=new int[capacity];	
		front=0;
		rear=-1;
		
	}
	
	public void enqueue(int value){
		if(isFull()){
			System.out.println("Quevue is full");
			return;
		}
		
		rear++;
		queue[rear]=value;
		
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		
		int value=queue[front];
		for(int i=0;i<getSize()-1;i++){
			queue[i]=queue[i+1];
		}
		rear--;
		return value;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		return queue[front];
	}
	
	public boolean isEmpty(){
		return rear+1==front;
	}
	
	public boolean isFull(){
		return rear+1== capacity;
	}
	
	public int getSize(){
		return rear+1;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		
		System.out.print("Queue :");
		for(int i=0;i<=rear;i++){
			System.out.print(queue[i] + " ");
		}
		System.out.println();
	}
	
	
	public void clear() {
		for (int i = 0; i < queue.length; i++) {
			queue[i] = 0;
		}

		front = 0;
		rear = -1;
	}
}

public class ReverseKElement{
	
	public static void reverseKElement(ArrayQueueADT queue,int k){
		StackArrayBasedADT stack=new StackArrayBasedADT(queue.getSize());
		queue.display();
		
		for(int i=0;i<k;i++){
			stack.push(queue.dequeue());
			//stack.display();
		}
		
		
	
		for(int i=0;i<k;i++){
			queue.enqueue(stack.pop());
		}
		
		queue.display();
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("how many numbers you add :");
		int n=sc.nextInt();

		System.out.print("Enter a value for K :");
		int k=sc.nextInt();
		System.out.println("");
		
		
		ArrayQueueADT queue=new ArrayQueueADT(n);
		
		for(int i =0;i<n;i++){
			System.out.print("Enter a value for element "+(i+1)+" :");
			queue.enqueue(sc.nextInt());
		}
		
		System.out.println("");
		
		reverseKElement(queue,k);
		
		
	}
}