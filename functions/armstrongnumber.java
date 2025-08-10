import java.util.Scanner;
public class armstrongnumber{
    public static String armstrong(int n){
        int sum=0;
        int temp=n;
        while(n>0){
            int dig=n%10;
            sum=sum+(dig*dig*dig);
            n=n/10;
        }
        if(temp==sum){ 
            return "armstrong";
        }else{
            return "not a armstrong";
        }
       
    }
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the nunber to check Armstrong number :");
        int num=s.nextInt();
        String res=armstrong(num);
            System.out.println(num+" is "+res);
        }
    


    
}
