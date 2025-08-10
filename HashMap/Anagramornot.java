import java.util.HashMap;
public class Anagramornot {
    public static void main(String[] arun){
        String s1="arun";
        String s2="nrua";
        int count=0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:s1.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(char i:s2.toCharArray()){
            if(map.containsKey(i)){
                continue;
            }else{
               count=1;
            }
            if(count==0){
                System.out.println("Anagram");
            }else{
                System.out.println("not anagram");
            }
        }
    }
    
}
