import java.util.HashSet;
import java.util.Scanner;
public class Reapitingandmissingvalues {
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        HashSet<Integer> seen=new HashSet<>();
        int miss=-1, rep=-1;
        for(int num:arr){
            if(!seen.add(num)){
                rep=num;
            }
            
        }
        for(int i=1;i<n;i++){
            if(!seen.contains(i)){
                miss=i;
                break;
            }

        }
        System.out.println("missing value is "+miss);
        System.out.println("repeating value is: "+rep);

    }
    
}
