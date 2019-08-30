import java.util.*;

public class Exemplu1{
    public static void main(String [] args){
        List<String> list = Arrays.asList("a","b","c","d","e");
        list.stream()
            .filter(s -> s.length() % 2 == 0)
            .sorted((s1,s2) -> s2.compareTo(s1))
            .forEach(System.out::println);
    }
}