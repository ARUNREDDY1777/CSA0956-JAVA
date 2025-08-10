import java.util.Scanner;
import java.util.Arrays;
public class Mergetwoarrays {
    //Two sorted arrays 
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the first array:" );
        int n1=sc.nextInt();
        System.out.println("Enter the Size of the Second array:" );
        int n2=sc.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        System.out.println("Enter the elements of the first array:" );
        for(int i=0;i<n1;i++){
            System.out.println("Enter the "+i+" element of array" );
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of the Second array:" );
        for(int i=0;i<n2;i++){
            System.out.println("Enter the "+i+" element of array" );
            b[i]=sc.nextInt();
        }
       System.out.println(" first array:" ); 
       for(int i=0;i<n1;i++){
        System.out.print(a[i]+" ");
       }
       System.out.println();
        System.out.println(" second array:" ); 
       for(int i=0;i<n2;i++){
        System.out.print(b[i]+" ");
       }
       int m[]=new int[a.length+b.length];
       for(int i=0;i<a.length;i++){
        m[i]=a[i];
       }
       for(int i=0;i<b.length;i++){
        m[a.length+i]=b[i];
       }
       System.out.println();
       System.out.println(" Merged array:" ); 
       for(int i=0;i<m.length;i++){
        System.out.print(m[i]+" ");
       }


    }
    
}
