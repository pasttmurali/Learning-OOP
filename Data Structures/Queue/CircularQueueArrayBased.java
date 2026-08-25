class CircularQueueArrayBasedADT{
	int[] queue;
	int capacity;
	int front;
	int rear;
	
	
	public CircularQueueArrayBasedADT(int capacity){
		this.capacity=capacity+1;
		queue=new int[this.capacity];
		front=0;
		rear=0;
	}
	
	public void enqueue(int data){
		
		if(isFull()){
			System.out.println("Queue is full");
			return;
		}
		queue[rear]=data;
		System.out.println("inserted done");
		rear=(rear+1)%capacity;	
		//System.out.println(rear);		
	}
	
	public int dequeue(){
		if(isEmpty()){
			System.out.println("Queue is underflow!");
			return -1;
		}
		
		int data=queue[front];
		front=(front+1)%capacity;
		
		return data;
	}
	
	public int peek(){
		if(isEmpty()){
			System.out.println("Queue is Empty");
		}
		return queue[front];
	}
	
	public boolean isEmpty(){
		return front==rear;
	}
	
	public boolean isFull(){
		return  (rear+1)%capacity == front;
	}
	
	public void display(){
		if(isEmpty()){
			System.out.println("Queue is empty");
			return ;
		}
		
		System.out.print("Queue: ");
		
		int i=front;
		
		while(i!=rear){
			System.out.print(queue[i]+" ");
			i=(i+1)%capacity;
		}
		
		
		System.out.println(" ");
	}
	
	public int getSize(){
		return capacity-1;
	}
}


public class CircularQueueArrayBased{
	public static void main(String[] args){
		CircularQueueArrayBasedADT q =new CircularQueueArrayBasedADT(5);
		
		q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
		
		q.display();
		
		System.out.println("Removed: " + q.dequeue());
        System.out.println("Removed: " + q.dequeue());
		
		q.display();
		 
		q.enqueue(60);
        q.enqueue(70);

        q.display();
		
		//System.out.println("Front: " + q.peek());
		
		System.out.println("getSize: " + q.getSize());


	}
}
