import java.util.*;
import java.util.stream.*;

public class Exemplu1{
    public static void main(String [] args){
        List<String> list = Arrays.asList("a", "bbb", "cc", "dddd", "e", "fff");
        
        String rezultat =
        list.stream()
            .sorted((s1, s2) -> s1.length() - s2.length())
            .reduce("", (s1, s2) -> s1 + "," + s2);
            
        System.out.println(rezultat);
        
        
        rezultat =
        list.stream()
            .sorted((s1, s2) -> s1.length() - s2.length())
            .collect(Collectors.joining(","));
            
        System.out.println(rezultat);
    }
}