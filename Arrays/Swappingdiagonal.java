public class Swappingdiagonal {
    public static void main(String[] args){
        int arr[][]={{2,4,6,8},{3,6,9,12},{4,8,12,16},{5,10,15,20}};
        int len=arr.length;
        for(int i=0;i<len;i++){
            int temp=arr[i][i];
            arr[i][i]=arr[i][len-1-i];
            arr[i][len-1-i]=temp;
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        int sum=0;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(i==j){
                    sum=sum+arr[i][j];
                }
            }
            System.out.println(sum);
        }
    }
}
