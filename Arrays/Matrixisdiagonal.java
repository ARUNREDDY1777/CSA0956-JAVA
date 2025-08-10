public class Matrixisdiagonal {
    public static void main(String[] arun){
        int arr[][]={{5,0,0},{0,8,0},{0,0,3}};
        boolean dia=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                if((i!=j && arr[i][j]!=0)){
                    dia=false;
                    break;
                }
            }
            if(!dia){
                break;
            }
            
        }
        if(dia){
                 System.out.println("Array is diagonal");
                
            
            }else{
                System.out.println("Array is not diagonal");
            
            }
    }
    
}
