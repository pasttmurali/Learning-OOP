public class ArrayListADT {

    private int[] arr;
    private int size;

    public ArrayListADT(int capacity) {
        arr = new int[capacity];
        size = 0;
    }

    // Increase array capacity automatically
    private void resize() {

        int[] newArr = new int[arr.length * 2];

        for (int i = 0; i < size; i++) {
            newArr[i] = arr[i];
        }

        arr = newArr;
    }

    // Add element
    public void insert(int value) {

        if (size == arr.length) {
            resize();
        }

        arr[size] = value;
        size++;
    }

    // Display
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

    // Get size
    public int getSize() {
        return size;
    }

    // Check empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get element
    public int getElement(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        return arr[index];
    }

    // Update element
    public void setElement(int index, int value) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        arr[index] = value;
    }

    // Insert at specific index
    public void insertElement(int index, int element) {

        if (index < 0 || index > size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (size == arr.length) {
            resize();
        }

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];
        }

        arr[index] = element;
        size++;
    }

    // Search element
    public boolean searchElement(int element) {

        for (int i = 0; i < size; i++) {

            if (arr[i] == element) {
                return true;
            }
        }

        return false;
    }

    // Delete element
    public void delete(int index) {

        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    // Extract Sub List
    public ArrayListADT subList(int start, int end) {

        if (start < 0 || end > size || start > end) {
            throw new IndexOutOfBoundsException("Invalid range");
        }

        ArrayListADT sub = new ArrayListADT(end - start);

        for (int i = start; i < end; i++) {
            sub.insert(arr[i]);
        }

        return sub;
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

        ArrayListADT sub = list.subList(1, 4);

        System.out.print("Sub List: ");
        sub.traverse();
    }
}