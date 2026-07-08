import java.util.Scanner;
class q3{

    public int [] getinput(){
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter your array size : ");
        int n1=scan.nextInt();
        int [] arr=new int [n1];
        for(int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
        }
            return arr;
    }

    public void printarr(int [] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
         System.out.println(" ");
    }

    public static int findindex(int [] list1,int[] list2){
       boolean stat=true;
       int id=0;
        for(int i=0;i<list2.length;i++){
            for(int j=0;j<list1.length;j++){
                if(list1[j]==list2[j+i]){
                    stat=true;
                }
                else{
                    stat=false;
                    break;
                }
            }
            if(stat==true){
                id=i+list1.length;
                break;
            }
        }
        if(stat==false){
            id=-1;
        }
        return id;
    }

    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        q3 ob1 =new q3();
        int [] id1=ob1.getinput();
        int [] id2=ob1.getinput();

        ob1.printarr(id1);
        ob1.printarr(id2);

        System.out.print("First array last element occur index is : "+findindex(id1,id2));
    }
}