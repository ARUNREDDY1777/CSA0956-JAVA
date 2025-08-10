import java.util.Scanner;
public class palindrome {
    public static boolean palindrome(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum*10+dig;
            n=n/10;
        }
        return temp==sum;
       

    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number to check is Palindrome ");
        int num=s.nextInt();
        if(palindrome(num)){
            System.out.println(num+" is a palindrome number");
        }else{
            System.out.println(num+" is not a palindrome number");
        }
        
    }
    
}
