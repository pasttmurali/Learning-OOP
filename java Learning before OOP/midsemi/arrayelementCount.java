import java.util.Scanner;

public class Solution {
    public static boolean isAnagram(String a, String b)
    {
        
        
    
        int n=a.length();
        int n2=b.length();
        
        boolean count = n>=1 && n<=50 && n2>=1 && n2<=50;
        boolean countequal=(n==n2);
        
        if(count && countequal)
        {
            return false;
        }
        
        char[] index2=new char[n2];
        char[] index=new char[n];
        char temp;
        
        for(int i=0;i<n;i++)
            {
              index[i] =Character.toLowerCase(a.charAt(i));
             // index2[i]=b.charAt(i);
                
            }
        for(int j=n-1;j>0;j--)
        {    
             for(int i =0;i<n-1;i++)
                {
                      if(index[i]>index[i+1])
                             {
                               temp=index[i];
                                index[i]=index[i+1];
                               index[i+1]=temp;
                             }
                }
        
        }
        
       
        for(int i=0;i<n2;i++)
            {
              
              index2[i] =Character.toLowerCase(b.charAt(i));
                
            }
            
        for(int j=n2-1;j>0;j--)
        {    
             for(int i =0;i<n2-1;i++)
                {
                      if(index2[i]>index2[i+1])
                             {
                               temp=index2[i];
                                index2[i]=index2[i+1];
                               index2[i+1]=temp;
                             }
                }
        
        }
        boolean final1=true;
        for(int i=0;i<n;i++)
        {
            if(index[i]==index2[i])
            {
                final1= true;
            }else{
                final1=false;
            }
        }
        
        return final1;
        
    }    
        
    


  

    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}