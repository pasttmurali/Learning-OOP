class ArrayListADT {

    private int[] arr;
    private int size;

    public ArrayListADT(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    
    private void resize() {

        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

   
    public void insert(int value) {

        if (size == arr.length) {
            resize();
        }

        arr[size] = value;
        size++;
    }

    public void traverse() {

        if (size == 0) {
            System.out.println("List is Empty");
            return;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }

 
    public int getSize() {
        return size;
    }

    
    public boolean isEmpty() {
        return size == 0;
    }

    
    public int getElement(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return arr[index];
    }

 
    public boolean searchElement(int element) {

        for (int i = 0; i < size; i++) {

            if (arr[i] == element) {
                return true;
            }
        }

        return false;
    }

 
    public void delete(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

}

public class ExtractAPortion{
	
	public static ArrayListADT extractAPortion(ArrayListADT list,int start,int end){
		if(start<0 || end>list.getSize() || start>end){
			System.out.println("Invalid range");
			return null;
		}
		
		ArrayListADT subList=new ArrayListADT(end-start);
		
		for(int i=start;i<end;i++){
			subList.insert(list.getElement(i));
		}
		
		return subList;
	}
	public static void main(String[] args) {

        ArrayListADT list = new ArrayListADT(3);

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.print("Original List: ");
        list.traverse();

        ArrayListADT sub = extractAPortion(list,1,4);

        System.out.print("Sub List: ");
        sub.traverse();
    }
}