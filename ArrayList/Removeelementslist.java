import java.util.ArrayList;
public class Removeelementslist {
    public static void main(String[] args){
        ArrayList list=new ArrayList();
        list.add(23);
        list.add("arun");
        list.add("sadwik");
        list.add(234);
        list.add(45);
        System.out.println("List before removing elements: "+list);
        list.remove(4);
        System.out.println("List after removing elements: "+list);
    }
}
