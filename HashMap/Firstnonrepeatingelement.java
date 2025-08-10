import java.util.HashMap;
public class Firstnonrepeatingelement {
    public static void main(String[] arun){
        String name="arunreddy";
        HashMap<Character,Integer> map=new HashMap<>();
        
        for(char i:name.toCharArray()){
            
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        for(var i:map.entrySet()){
            if(i.getValue()==1){
                System.out.println(i);
                break;
            }
        }
    }
    
}
