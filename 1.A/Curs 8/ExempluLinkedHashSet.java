import java.util.*;

public class ExempluLinkedHashSet{
    public static void main(Strin [] args){
        HashSet<Integer> set = new HashSet<>();//mai era ceva aici
        
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