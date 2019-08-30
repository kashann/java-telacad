import java.util.*;
import java.util.stream.*;

public class Exemplu3{
    public static void main(String [] args){
        List<String> list = Arrays.asList("a","b","c","d","e");
        
        ArrayList<Integer> result;
        
        result = list.stream()
            .map(s -> s.length())
            //.collect(Collectors.toCollection(() -> new ArrayList<>()));
            .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(result);
    }
}