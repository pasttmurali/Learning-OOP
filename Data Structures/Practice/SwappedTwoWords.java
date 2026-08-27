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

public class SwappedTwoWords{
	
	public static void swappedTwoWords(SinglyLinkedListADT list,String word1,String word2){
			 int n1=list.searchElement(word1);
			 int n2=list.searchElement(word2);
			 
			 if (n1 == -1 || n2 == -1) {
				System.out.println("Word not found, Can't swapped");
				return;
			}else{
				list.updateElement(n1,word2);
				list.updateElement(n2,word1);
			}
			
			
			//System.out.println("n1"+n1+" "+n2);
			list.display();
			 
		}
    public static void main(String[] args) {
		
        SinglyLinkedListADT list = new SinglyLinkedListADT();

        list.insertAtFront("I");
        list.insertAtEnd("Love");
        list.insertAtEnd("my");
        list.insertAtEnd("Mom");
		list.insertAtEnd("always");

        System.out.print("Original List: ");
        list.display();
		
		System.out.println("");
		System.out.print("After swapped : ");
		swappedTwoWords(list,"love","always");
		System.out.println("");
		System.out.print("After swapped : ");
		swappedTwoWords(list,"love","my");
		System.out.println("");
		System.out.print("After swapped : ");
		swappedTwoWords(list,"mom","my");
		
		System.out.println("");
		System.out.print("After swapped : ");
		swappedTwoWords(list,"mom","gf");
		
       
    }
}