import java.util.Scanner;

public class Removingduplicats {
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
        System.out.println();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    c++;
                }
            }
            if(c==0){
                System.out.println(arr[i]+" ");
            }

        }
        
            
                
            
        }
    }
    
