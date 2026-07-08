import java.util.Scanner;
public class ArrayADT{
	private int[] arr;
	private int size;
	
	
	public ArrayADT(int capacity){
		arr=new int[capacity];
		size=0;
	}
	
	public void insertElement(int index,int element){
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
	
	public void setElement(int index,int element){
		if(index<0 || index>=size){
			throw new IndexOutOfBoundsException("Index is out of range");
		}
		arr[index]=element;
		
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
	
	public boolean searchElement(int element){
		for(int i=0;i<size;i++){
			if(arr[i]==element){
				return true;
			}	
		}
		return false;
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
	
	public int getElement(int index){
		if(index<0 || index >=size){
			throw new IllegalArgumentException("Index not found");
		}
		return arr[index];
		
	}
	
	//Write a program that finds the minimum value in an integer array.
	public int findMin(){
		int min=arr[0];
		for(int i=1;i<size;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}
		return min;
	}
	
	//Write a program that reverses the order of elements in an integer array.
	public int[] reverse(int a,int n){
		if(a>=n){
			return arr;
		}
		
		int temp=arr[a];
		arr[a]=arr[n];
		arr[n]=temp;
		
		return reverse(a+1,n-1);
	}
	
	//Write a program that counts the frequency of each element in an integer array and prints the results.
	public ArrayADT reverse(){
		reverse(0,size-1);
		return this;
	}
	
	public void count(){
		for(int i=0;i<size;i++){
			boolean counted=false;
			for(int j=0;j<i;j++){
				if(arr[i]==arr[j]){
					counted=true;
					break;
				}
			} 
			if(counted){
				continue;
			}
			
			int count=0;
			for(int k=i;k<size;k++){
				if(arr[i]==arr[k]){
					count++;
				}
			}
			System.out.println("element "+arr[i]+" count is : "+count);
		}
	}
	
	//Write a program that sorts the elements in an integer array in ascending order using bubble sorting algorithm.
	public ArrayADT bubbleSort(){
		if (size == 0) {
				throw new IllegalStateException("Array is Empty");
		}
		
		ArrayADT sorted=new ArrayADT(this.size);
		
		for(int i=0;i<size;i++){
			sorted.arr[i]=this.arr[i];
			sorted.size++;
		}
			
		for(int i=0;i<sorted.size;i++){
			boolean isSorted=true;
			for(int j=0;j<sorted.size-1-i;j++){
				if(sorted.arr[j]>sorted.arr[j+1]){
					int temp=sorted.arr[j];
					sorted.arr[j]=sorted.arr[j+1];
					sorted.arr[j+1]=temp;
				
					isSorted=false;
				}
				
			}
			if(isSorted){
				break;
			}
		}
		return sorted;
	}
	
	
	//Write a program that merges two sorted integer arrays into a single sorted array
	public ArrayADT mergeArray(ArrayADT other){
		 if (other == null) {
				throw new IllegalArgumentException("Other array cannot be null values");
			}

		if (this.size == 0 && other.size == 0) {
				throw new IllegalStateException("Both arrays are empty");
			}

		ArrayADT merged=new ArrayADT(this.size+other.size);
		
		int i=0;
		int j=0;
		int k=0;
		
		while(i<this.size && j<other.size){
			if(this.arr[i]<=other.arr[j]){
				merged.arr[k]=this.arr[i];
				i++;
			}else{
				merged.arr[k]=other.arr[j];
				j++;
			}
			k++;
			merged.size++;
		}
		
		while(i<this.size){
			merged.arr[k]=this.arr[i];
			i++;
			k++;
			merged.size++;
		}
		
		while(i<other.size){
			merged.arr[k]=other.arr[j];
			j++;
			k++;
			merged.size++;
		}
		return merged;
	
	}
	
	//Write a program that sorts the elements in an integer array in ascending order using selection sorting algorithm.
	public ArrayADT selectionSorting(){
		ArrayADT sorted=new ArrayADT(this.size);
		if (size == 0) {
				throw new IllegalStateException("Array is Empty");
		}
			
		for(int i=0;i<size;i++){
			sorted.arr[i]=this.arr[i];
			sorted.size++;
		}
		
		for(int i=0;i<sorted.size-1;i++){
			int minIndex=i;
			for(int j=i+1;j<size;j++){
				if(sorted.arr[minIndex]>sorted.arr[j]){
					minIndex=j;
				}
			}
			int temp=sorted.arr[i];
			sorted.arr[i]=sorted.arr[minIndex];
			sorted.arr[minIndex]=temp;
		}
		return sorted;
	}
	
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number for Array Size: ");
		int n=sc.nextInt();
		ArrayADT arr1= new ArrayADT(n);
		arr1.insertElement(0,10);
		arr1.insertElement(1,20);
		arr1.insertElement(2,30);
		arr1.delete(1);
		
		System.out.print("\nAfter deleting one Element,");
		arr1.traverse();
		
		arr1.insertElement(2,10);	
		System.out.print("\nAfter inserting,");
		arr1.traverse();
		
		System.out.print("\nAfter reverse, ");
		arr1.reverse().traverse();
		
		System.out.println("\nFind Min value in Arrray: "+arr1.findMin());
		
		System.out.println("\nArray element count details \n---------------------");
		arr1.count();
		
		System.out.print("\nAfter Bubble sorting, ");
		arr1.bubbleSort().traverse();
				
		ArrayADT arr2 = new ArrayADT(5);
		arr2.insertElement(0, 5);
		arr2.insertElement(1, 15);
		arr2.insertElement(2, 25);
		
		System.out.print("Merged sorted array: ");
		arr1.mergeArray(arr2).traverse();
		
		System.out.print("\nAfter selection sorting, ");
		arr1.selectionSorting().traverse();
		
		System.out.print("\nOriginal array: ");
		arr1.traverse();
	sc.close();
	}
}