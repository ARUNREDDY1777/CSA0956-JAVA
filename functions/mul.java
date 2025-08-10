public class mul{
    public static String arms(int n){
        int temp=n;
        int sum=0;
        while(n>0){
            int dig=n%10;
            sum=sum*10+dig;
            n=n/10;
            
        }
        if(temp==sum){
            return "is armstrong";
        }else{
            return "is not armstrong";
        }


    }
    public static void main(String[] args){
        int num=121;
        String res=arms(num);
        System.out.println(num+" "+res);
    }
        
}