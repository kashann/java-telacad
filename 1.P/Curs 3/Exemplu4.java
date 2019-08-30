import java.util.*;

public class Exemplu4{
    public static void main(String [] args){
        Map<Integer, Integer> map = new HashMap<>();
        
        map.put(1, 3);
        map.put(3, 5);
        
        map.forEach( (k, v) -> System.out.println(k + " " + v) );
    }
}