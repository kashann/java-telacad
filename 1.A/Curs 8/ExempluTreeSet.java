import java.util.*;

public class ExempluTreeSet{
    public static void main(Strin [] args){
        TreeSet<Integer> set = new TreeSet<>();
        
        set.add(1256);
        set.add(333);
        set.add(21);
        set.add(123);
        set.add(1555);
        set.add(1);
        set.add(333);
        
        set.forEach(System.out::println);
    }
}