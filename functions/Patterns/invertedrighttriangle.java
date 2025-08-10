import java.util.Scanner;
public class invertedrighttriangle {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of lines: ");
        int n=s.nextInt();
        for(int i=0;i<=n;i++){
            for(int j=i+1;j<=n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
