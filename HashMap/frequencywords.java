import java.util.*;
public class frequencywords {
   public static void main(String []args){
    String s="apple banana orange orange banana apple";
    HashMap<String,Integer> a=new HashMap<>();
    String[] b=s.split(" ");
     for(String i:b){
        if(a.containsKey(i))
        {
            a.put(i,a.get(i)+1);
        }else{
            a.put(i,1);
        }
     }
     System.out.println(a);
   } 
}
