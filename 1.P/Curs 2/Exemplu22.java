import java.util.*;

public class Exemplu22{
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,3,5,7,8);
        
        list.stream()
        .limit(2)
        .filter(e -> e % 2 == 1)
        .forEach(System.out::println);
    }
}