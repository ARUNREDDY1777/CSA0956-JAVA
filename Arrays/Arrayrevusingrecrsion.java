import java.util.Scanner;
public class Arrayrevusingrecrsion {
public static void arrrev(int arr[],int start,int end){
    if(start>=end){
        return;

    }
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
    arrrev(arr,start+1,end-1);

}

    public static void main(String[] arun){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        arrrev(arr,0,arr.length-1);
        for(int i=0;i<n;i++){
        System.out.print(arr[i]+" ");
    }

    }
    
    
    
}
