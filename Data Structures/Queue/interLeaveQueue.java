class Node{
	int data;
	Node next;
	
	Node(int data){
		this.data=data;
		this.next=null;
	}
}

class LinkedListQueueADT{
	Node rear;
	Node front;
	
	LinkedListQueueADT(){
		front=null;
		rear=null;
	
	}
	
	public void enqueue(int value){
		Node newNode=new Node(value);
		
		if(isEmpty()){
			front=newNode;
			rear=newNode;
		}else{
			rear.next=newNode;
			rear=newNode;
		}
	}
	
	public int getSize(){
		if(isEmpty()){
			return 0;
		}
		else{
			Node current=front;
			int count=1;
			while(current!=rear){
				count++;
				current=current.next;
			}
			return count;
		}
	}
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		
		int value=front.data;
		front=front.next;

		
		if(front==null){
			rear=null;
		}
		
		return value;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return -1;
		}
		
		return front.data;
	}
	
	public boolean isEmpty(){
		return front == null;
	}
	
	public void display(){
		Node current=front;
		
		while(current != null){
			System.out.print(current.data+" ");
			current=current.next;
		}
		
		System.out.println("");
	}
	
	public boolean contains(int value){
		Node current=front;
		
		while(current!=null){
			if(current.data == value){
				return true;
			}
			
			current=current.next;
		}
		return false;
	}
	
	// cut the previous node's connection.
	public void clear(){
		Node current=front;
		while(current!=null){
			Node temp=current;
			current=current.next;
			temp.next=null;
		}
		
		front = null;
		rear = null;
		
	}
	
	/*
	public void clear() {
		front = null;
		rear = null;
	
	}
		
	*/
	
	public void reversePrint(){

		Node previous = null;
		Node current = front;
		Node next = null;


		while(current != null){
			next = current.next;
			current.next = previous;

			previous = current;
			current = next;
		}


		current = previous;

		while(current != null){
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();

		
		current = previous;
		previous = null;

		while(current != null){
			next = current.next;
			current.next = previous;

			previous = current;
			current = next;
		}
	}
	
}
	
	
	


public class interLeaveQueue {
	
	public static void interLeave(LinkedListQueueADT q){
		if (q.getSize() % 2 != 0) {
            System.out.println("Queue size must be even");
            return;
        }
		
		int half = q.getSize() / 2;

        LinkedListQueueADT firstHalf = new LinkedListQueueADT();
		
		for (int i = 0; i < half; i++) {
            firstHalf.enqueue(q.dequeue());
        }
		
		for (int i = 0; i < half; i++) {

            q.enqueue(firstHalf.dequeue());

            q.enqueue(q.dequeue());
        }
	}

    public static void main(String[] args) {

        LinkedListQueueADT q = new LinkedListQueueADT();

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
		q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);

		q.display();
		
		interLeave(q);
		q.display();
		

		
    }
}