import java.util.*;

public class ExempluHashMap{
    
    public static void main(String [] args){
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(3,4);
        map.put(6,2);
        map.put(8,9);
        map.put(101,4);
        map.put(45,8);
        map.put(3,80);
        
        //Set<Integer> keys = map.keySet();
        //for(Integer k : keys){
        //    System.out.println(k+" "+map.get(k));
        //}
        
        map.forEach( (k,v) -> System.out.println(k+" "+v));
    }
}