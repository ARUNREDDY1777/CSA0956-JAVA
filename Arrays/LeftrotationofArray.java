import java.util.Scanner;
import java.util.Arrays;
public class LeftrotationofArray {
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the "+i+" element: ");
            arr[i]=sc.nextInt();
        }
            System.out.println(Arrays.toString(arr));
            int first=arr[0];
            for(int i=0;i<n-1;i++){
                arr[i]=arr[i+1];
            }
            arr[n-1]=first;
            System.out.println("After left rotation of array");
            System.out.println(Arrays.toString(arr));
        
    }
    
}
