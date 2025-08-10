public class reversearrayusingswaping {
    public static void main(String[] arun){
        int arr[]={10,20,30,40,50};
        int len=arr.length;
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
        for(int i=0;i<len;i++){
            
            System.out.print(arr[i]+" ");

        }
        
    }
    
}
