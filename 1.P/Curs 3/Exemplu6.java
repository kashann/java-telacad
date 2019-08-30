import java.util.*;

public class Exemplu6{
    public static void main(String [] args) {
        List<Integer> list = Arrays.asList(4,5,6,7,2,3,5,7);
        
        boolean x1 = list.stream().allMatch(x -> x < 10);
        boolean x2 = list.stream().allMatch(x -> x % 2 == 0);
        boolean x3 = list.stream().anyMatch(x -> x % 2 == 0);
        boolean x4 = list.stream().anyMatch(x -> x > 10);
        
        
        System.out.println(x1+" "+x2+" "+x3+" "+x4); // true false true false
    }
}