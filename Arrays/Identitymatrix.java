import java.util.Scanner;
public class Identitymatrix {
   
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
         System.out.println("Enter the number of columns: ");
        int c=sc.nextInt();
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
               if(i==j && mat[i][j]!=1){
                System.out.println("is a identity matrix");
                break;

         } else{
            System.out.println("not identity");
         }
            }
         }
         
         
        
    }

    
}