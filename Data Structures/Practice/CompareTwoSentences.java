class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedListADT {

    Node head;

    public SinglyLinkedListADT() {
        this.head = null;
    }

    // 1. Check whether the list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // 2. Get the size of the list
    public int getSize() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // 3. Insert at front
    public void insertAtFront(String data) {
        Node newNode = new Node(data);

        newNode.next = head;
        head = newNode;
    }

    // 4. Insert at end
    public void insertAtEnd(String data) {
        Node newNode = new Node(data);

        if (isEmpty()) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // 5. Insert at a specific index
    public void insertAtIndex(String data, int index) {

        if (index < 0 || index > getSize()) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            insertAtFront(data);
            return;
        }

        Node newNode = new Node(data);
        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    // 6. Delete from front
    public void deleteAtFront() {

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        head = head.next;
    }

    // 7. Delete from end
    public void deleteAtEnd() {

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        // Only one node
        if (head.next == null) {
            head = null;
            return;
        }

        Node current = head;

        while (current.next.next != null) {
            current = current.next;
        }

        current.next = null;
    }

    // 8. Delete at a specific index
    public void deleteAtIndex(int index) {

        if (index < 0 || index >= getSize()) {
            System.out.println("Invalid index");
            return;
        }

        if (index == 0) {
            deleteAtFront();
            return;
        }

        Node current = head;

        for (int i = 0; i < index - 1; i++) {
            current = current.next;
        }

        current.next = current.next.next;
    }

    // 9. Search for an element
    public int searchElement(String key) {

        Node current = head;
        int index = 0;

        while (current != null) {

            if (key.equalsIgnoreCase(current.data)) {
                return index;
            }

            current = current.next;
            index++;
        }

        return -1;
    }

    // 10. Update an element
    public void updateElement(int index, String newData) {

        if (index < 0 || index >= getSize()) {
            System.out.println("Invalid index");
            return;
        }

        Node current = head;

        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        current.data = newData;
    }

    // 11. Reverse the list
    public void reverse() {

        Node previous = null;
        Node current = head;
        Node next;

        while (current != null) {

            next = current.next;

            current.next = previous;

            previous = current;
            current = next;
        }

        head = previous;
    }

    // 12. Display / Traverse
    public void display() {

        if (isEmpty()) {
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        //System.out.println("null");
    }
}

public class CompareTwoSentences{
	
	public static boolean compareTwoSentences(SinglyLinkedListADT list1,SinglyLinkedListADT list2){
			if(list1.getSize()!= list2.getSize()){
				System.out.println("Sentence not match!");
				return false;
			}else{
				Node current1=list1.head;
				Node current2=list2.head;
				
				for(int i=0;i<list1.getSize();i++){
					if(!current1.data.equalsIgnoreCase(current2.data)){
						return false;
					}
					current1=current1.next;
					current2=current2.next;
				}
			}
			return true;			
			 
		}
    public static void main(String[] args) {
		
        SinglyLinkedListADT list1 = new SinglyLinkedListADT();

        list1.insertAtFront("I");
        list1.insertAtEnd("Love");
        list1.insertAtEnd("my");
        list1.insertAtEnd("Mom");
		list1.insertAtEnd("always");
		
		SinglyLinkedListADT list2 = new SinglyLinkedListADT();
		
		list2.insertAtFront("i");
        list2.insertAtEnd("Love");
        list2.insertAtEnd("My");
        list2.insertAtEnd("Mom");
		list2.insertAtEnd("alwayS");

        System.out.print("List1 : ");
        list1.display();
		
		System.out.println("");
		
		System.out.print("List2 : ");
        list2.display();
		
		System.out.println("");
		
		
		System.out.println("");
		
		if(compareTwoSentences(list1,list2)){
			System.out.println("Both sentence Match");
		}else{
			System.out.println("Both sentence not match");
		}
		
       
    }
}