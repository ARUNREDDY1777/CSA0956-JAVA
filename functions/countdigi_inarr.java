
import java.util.Scanner;
public class countdigi_inarr {
    

    public static void main(String[] args) {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the of the array: ");
      int  n=s.nextInt();
      int[] a=new int[n];
      for(int i=0;i<a.length;i++){
          System.out.println("enter "+i+" element");
          a[i]=s.nextInt();
          
      }
      System.out.print("[");
      for(int i=0;i<a.length;i++){
          System.out.print(" "+a[i]+",");
      }
      System.out.print(" ]");
      int[] c=new int[n];
      for(int i=0;i<a.length;i++){
          if(a[i]==-1) continue;
          int count=1;
          for(int j=i+1;j<a.length;j++){
              if(a[i]==a[j]){
                  count++;
                  a[j]=-1;
              }
              
          }
           System.out.println(" "+a[i]+" "+count);
           
      }
     
    }
}

