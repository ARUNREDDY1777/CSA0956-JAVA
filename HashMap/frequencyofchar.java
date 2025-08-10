import java.util.HashMap;
public class frequencyofchar {
    public static void main(String[] arun){
        String name="arunreddykonkala";
        HashMap<Character,Integer> map=new HashMap<>();
        for(char i:name.toCharArray()){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }
            else{
                map.put(i,1);
            }
        }
        System.out.println(map);
    }
    
}
