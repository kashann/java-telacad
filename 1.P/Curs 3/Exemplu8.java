import java.util.*;

public class Exemplu8{
    public static void main(String [] args){
        Optional<Integer> o1 = Optional.empty();
        System.out.println(o1.isPresent());
        
        Optional<Integer> o2 = Optional.of(5);
        System.out.println(o2.isPresent());
        System.out.println(o2.get());
        
        Optional<Integer> o3 = Optional.ofNullable(5);
        System.out.println(o3.isPresent());
        System.out.println(o3.get());
        
        o3.ifPresent(System.out::println);
        
        Integer x1 = o3.orElse(10);
        Integer x2 = o3.orElseGet(() -> new Random().nextInt(100));
        Integer x3 = o3.orElseThrow(RuntimeException::new);
    }
}