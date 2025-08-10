import java.util.Scanner;
public class Countoftarget {
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the Size of the array: ");
        int n=sc.nextInt();
        int c=0;
        System.out.println("Enter the target element: ");
        int t=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.println("enter the "+i+" element:");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
        for(int i=0;i<n;i++){
                if(arr[i]==t){
                    c++;
                }
        }
        System.out.println(t+" occures "+c+" times");
    }
    
}
