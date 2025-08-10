import java.util.Scanner;
public class evenorodd {
    public static String evenodd(int n){
       if(n<0){
           return "negative please enter positive number"; 
        }
       else if(n%2==0){
            return "EVEN NUMBER";
        }else{
            return "ODD NUMBER";
        }
    }
   
    public static void main(String[] args){
         Scanner s=new Scanner(System.in);
        System.out.println("enter the number to check EVEN or ODD: ");
        int num=s.nextInt();
        String res=evenodd(num);
        System.out.println(num+" is "+res);
        
        
    }
    
}
