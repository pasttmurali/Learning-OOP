import java.util.Scanner;
class ArrayADT{
	private char[] arr;
	private int size;
	
	
	public ArrayADT(int capacity){
		arr=new char[capacity];
		size=0;
	}
	

	public void insert(char value){
		if(size == arr.length){
			throw new IllegalStateException("Array is Full");
		}
		
		arr[size]=value;
		size++;
	}
	
	 public void traverse() {
        if (size == 0) {
            throw new IllegalStateException("Array is Empty");
        } 
        else {
            System.out.print("Array elements: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
	

	public int getSize(){
		return size;
	}
	
	
	public boolean isFull(){
		return size == arr.length;
	}
	
	
	public boolean isEmpty(){
		return size == 0;
	}
	
	public void insertElement(int index,char element){
		if(index<0 || index >size)
		{
			throw new IndexOutOfBoundsException("Index is out of range");
		}else if(size==arr.length){
			System.out.println("Array is full");
		}else{
			for(int i =size-1;i>=index;i--){
				arr[i+1]=arr[i];
			}
			arr[index]=element;
			size++;
		}
	}
	
	public void delete(int index){
		if(index<0 || index >=size){
			throw new IndexOutOfBoundsException("Index is out of range");
		}else if(size == 0){
			throw new IllegalStateException("Array is Empty");
		}else{
			for(int i=index;i<size-1;i++){
				arr[i]=arr[i+1];
			}
			arr[size-1]=0;
			size--;
		}
		
	}
	
	
	public char getElement(int index){
		if(index<0 || index >=size){
			throw new IllegalArgumentException("Index not found");
		}
		return arr[index];
		
	}
	
	
}

public class FindMissingElement{
	
	public static char FindMissingElement(ArrayADT arr){
		if(arr.isEmpty()){
			System.out.println("Empty Array");
			return '0';
		}
		
		for(int i=0;i<arr.getSize()-1;i++){
			
			char current=Character.toLowerCase(arr.getElement(i));
			char next=Character.toLowerCase(arr.getElement(i+1));
			
			/*if(arr.getElement(i)==arr.getElement(i+1)){
				System.out.println("Duplicate element at index "+(i+1));
				continue;
			}*/
			
			if(current==next){
				System.out.println("Duplicate element at index "+(i+1));
				continue;
			}
			
			if(next!=current+1){
				return (char)(current+1);
			}
		}
		
		System.out.println("No missing Element");
		return '0';
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number for Array Size: ");
		int n=sc.nextInt();
		
		ArrayADT arr= new ArrayADT(n);
		sc.nextLine();
		for(int i=0;i<n;i++){
			System.out.print("Enter character of a sequence "+(i+1)+" : ");
			arr.insert(sc.nextLine().charAt(0));
			
		}
		
		arr.traverse();
		
		System.out.print("Missing element : "+FindMissingElement(arr));
		
		
		sc.close();
	}
}