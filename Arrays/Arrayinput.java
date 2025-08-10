import java.util.Scanner;
public class Arrayinput {
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter "+i+" element of array");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
