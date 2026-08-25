class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class CircularQueueADT{
	Node head;
	
	CircularQueueADT(){
		head=null;
	}
	
	public boolean isEmpty(){
		return head == null;
	}
	
	public void enqueue(int data){
		
		Node newNode = new Node(data);
		
		if(isEmpty()){
			head=newNode;
			newNode.next=head;
			return;
		}
		
		Node current=head;
		while(current.next != head){
			current=current.next;
		}
		current.next=newNode;
		newNode.next=head;
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is Underflow");
			return -1;
		}
		
		int value=head.data;
		
		if(head.next==head){
			head=null;
			return value;
		}
		
		Node current=head;
		
		while(current.next!=head){
			current=current.next;
		}
		
		current.next=head.next;
		head=head.next;
		
		return value;
	} 
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
			return -1;
		}
		return head.data;
	}
	
	public void display(){
		
		if(isEmpty()){
			System.out.println("Queue is empty");
			return;
		}
		
		Node current=head;
		
		while(current.next!=head){
			System.out.print(current.data+" ");
			current=current.next;
		}
		
		System.out.println(current.data);
	}
	
	public void reverse(){
		CircularQueueADT newqueue=new CircularQueueADT();
		
		if(isEmpty()){
			return;
		}
		
		int value=dequeue();
		
		reverse();
		
		enqueue(value);
	}
	
	public boolean search(int value){
		if (isEmpty()){
			return false;
		}
		
		Node current=head;
		while(current.next!=head){
			if(current.data==value){
				return true;
			}
			current=current.next;
		}
		
		if(current.data == value){
			return true;
		}
	
		return false;
	}
	
}



public class circularQueue{
	public static void main(String args[]){
		CircularQueueADT queue =new CircularQueueADT();
		
		queue.enqueue(10);
		queue.enqueue(20);
		queue.enqueue(10);
		queue.enqueue(30);
		
		queue.display();
		
		System.out.println("Peek: " + queue.peek());
		 
		queue.display();
		
        System.out.println("Removed: " + queue.dequeue());

		
		System.out.print("Reverce: ");
		queue.reverse();
		queue.display();

		
		System.out.print("Again Reverce: ");
		queue.reverse();
		queue.display();
		
		System.out.println("Search 30 :"+queue.search(30));
		System.out.println("Search 40 :"+queue.search(40));

	}
}