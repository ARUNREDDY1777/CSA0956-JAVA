
import java.util.Scanner;
public class targetelement {
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
         System.out.println("Enter the number of columns: ");
        int c=sc.nextInt();
        int t=6;
        int mat[][]=new int[r][c];
        System.out.println("Enter the Elements of first matrix: ");
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                mat[i][j]=sc.nextInt();
            }

         }
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println(mat[i][j]);
            }
         }
         for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(mat[i][j]==t){
                    System.out.println("the target element found at location "+i+" "+j);
                }
            }
         }
         
        
    }

    
}
