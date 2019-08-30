import java.util.*;
import java.util.stream.*;

public class Exemplu2{
    public static void main(String [] args){
        List<String> list = Arrays.asList("aaa", "abc", "a", "assd", "qqqq", "esda", "q");
        
        Map<Integer, List<String>> map =
        list.stream().collect(Collectors.groupingBy(s -> s.length()));
        
        System.out.println(map);
        map.forEach((k,v) -> System.out.println("LUNGIMEA: " + k + " " + v));
    }
}