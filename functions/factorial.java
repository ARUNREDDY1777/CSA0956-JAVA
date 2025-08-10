import java.util.Scanner;
public class factorial {
    public static int fact(int n){
        int i;
        int f=1;
        for(i=1;i<=n;i++){
            f=f*i;
           
        }
        return f;
        
        
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=s.nextInt();
        System.out.println("The Factorial of "+num+" is "+fact(num));
    }
    
}
