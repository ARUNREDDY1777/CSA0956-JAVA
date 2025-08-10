import java.util.Scanner;
public class Decimalconvertions {
    public static void main(String[] arun){
        Scanner sc=new Scanner(System.in);
        String bin="";
        String oct="";
        String hex="";
        System.out.println("enter the decimal number for binary: ");
        int dec=sc.nextInt();
         System.out.println("enter the decimal number for octal: ");
        int dec1=sc.nextInt();
         System.out.println("enter the decimal number for Hexadecimal: ");
        int dec2=sc.nextInt();
        char hex1[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        while(dec>0){
            int rem=dec%2;
            bin=rem+bin;
            dec=dec/2;
        }
        System.out.println("Binary number: "+bin);
    while(dec1>0){
        int rem1=dec1%8;
        oct=rem1+oct;
        dec1=dec1/8;
    }
     System.out.println("Octal number: "+oct);
     while(dec2>0){
        int rem2=dec2%16;
        hex=hex1[rem2]+hex;
        dec2=dec2/16;

     }
     System.out.println("Hexa decimal number: "+hex);
}
    
}
