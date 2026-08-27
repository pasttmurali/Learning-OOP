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
	
	public int getMinAndDelete() {

		if (size == 0) {
			System.out.println("List is Empty");
		}

		int min = arr[0];
		int minIndex = 0;

		for (int i = 1; i < size; i++) {

			if (arr[i] < min) {
				min = arr[i];
				minIndex = i;
			}
		}

		delete(minIndex);

		return min;
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

public class SortArrayList{
	
	public static ArrayListADT sortArrayList(ArrayListADT list){
		int n=list.getSize();
		if(list.isEmpty()){
			System.out.println("list is Empty");
			return null;
		}
		
		ArrayListADT tempList=new ArrayListADT(n);
		ArrayListADT sortList=new ArrayListADT(n);
		
		for (int i = 0; i < n; i++) {
			tempList.insert(list.getElement(i));
		}
		
		
		for(int i=0;i<n;i++){
			sortList.insert(tempList.getMinAndDelete());
			//tempList.traverse();
		}
		
		return sortList;
	}
	public static void main(String[] args) {

        ArrayListADT list = new ArrayListADT(3);

        list.insert(60);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(20);

        System.out.print("Original List: ");
        list.traverse();

        ArrayListADT sortList = sortArrayList(list);

        System.out.print("Sorted List: ");
        sortList.traverse();
		
    }
}