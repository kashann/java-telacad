import java.util.*;
import java.util.stream.*;

public class Exemplu5{
    public static void main(String [] args){
        List<Integer> list1 = Arrays.asList(2,3,5,6,7,8,9);
        List<Integer> list2 = Arrays.asList(6,5,8,6,2,1,3);
        List<Integer> list3 = Arrays.asList(5,6,9,2);
        
        List<List<Integer>> list = Arrays.asList(list1, list2, list3);
        System.out.println(list);
        
        list.stream()
            .flatMap(x -> x.stream())
            .filter(a -> a % 2 == 0)
            .distinct()
            .forEach(System.out::println);        
    }
}