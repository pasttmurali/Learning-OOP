
class BinaryTreeADT{
	int maxSize;
	int[] bt;
	int cs;
	
	BinaryTreeADT(int maxSize){
		this.maxSize=maxSize;
		bt=new int[maxSize];
		cs=0;
	}
	
	public void insert(int data){
		if(isFull()){
			System.out.println("Tree is Full");
		}else{
			bt[cs]=data;
			cs++;
		}
	}
	
	public void delete(){
		if(isEmpty()){
			System.out.println("Tree is Empty");
			return;
		}
		cs--;
	}
	
	public  boolean isEmpty(){
		return cs == 0;
	}
	
	public boolean isFull(){
		return maxSize==cs;
	}
	
	public void levelOfTraversal(){
		if(isEmpty()){
			System.out.println("Tree is Empty");
			return;
		}
		System.out.print("Level Of Traversal: ");
		for(int i=0;i<cs;i++){
			System.out.print(bt[i]+" ");
		}
		System.out.println();
	}
	
	public void inorderTraversal(int i){
		if(isEmpty()){
			System.out.println("tree is empty");
		}else{
			if(i<0 || i >= cs){
				//System.out.println("Wrong index");
				return;
			}else{
				inorderTraversal(2*i+1);
				System.out.print(bt[i]+" ");
				inorderTraversal(2*i+2);
			}
		}
		
		
	}
	
}

public class BinaryTree{
	public static void main(String[] args){
		BinaryTreeADT binaryTree=new BinaryTreeADT(7);
		binaryTree.insert(5);
		binaryTree.insert(3);
		binaryTree.insert(9);
		binaryTree.insert(2);
		binaryTree.insert(4);
		binaryTree.insert(7);
		binaryTree.insert(1);
		binaryTree.levelOfTraversal();
		binaryTree.inorderTraversal(0);
	}
}






