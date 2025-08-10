public class Findingtarget {
    public static void main(String[] arun){
        int t=21;
        int a[]={1,7,21,8,10,15,21,30};
        int low=0;
        int high=a.length-1;
        

    while(low<=high){
        int mid=(low+high)/2;
        
        if(a[mid]==t){
            System.out.println("yes found "+a[mid]+" At "+mid);
            break;
        }else if(a[mid]<t){
           low=mid+1;
        }else{
            high=mid-1;
           
        }
    }

    }
    
}
 