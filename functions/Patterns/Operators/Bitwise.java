import java.util.Scanner;
public class Bitwise {
    public static void main(String[] arunreddy){
        int a=5;
        int b=23;
        int r1=a<<2;
        int r2=a>>1;
        int r=0;
        System.out.println("right_shift: "+r);
        System.out.println("left_shift: "+r2);
        r=a&b;
        System.out.println("AND: "+r);
        r=a|b;
        System.out.println("OR: "+r);
        r=a^b;
        System.out.println("NOR: "+r);
        r=~b;
        System.out.println("NOT: "+r); 
    }
    
}
