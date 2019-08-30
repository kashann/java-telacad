import java.util.*;
import java.util.stream.*;

public class Exemplu2{
    public static void main(String [] args){
        List<String> list = Arrays.asList("a","b","c","d","e");
        
        List<Integer> result;
        
        result = list.stream()
            .map(s -> s.length())
            .collect(Collectors.toList());
        System.out.println(result);
    }
}