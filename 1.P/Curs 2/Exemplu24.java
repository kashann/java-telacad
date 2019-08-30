import java.util.stream.*;
import java.util.*;

public class Exemplu24{
    public static void main(String [] args){
        Stream
        .generate(() -> new Random().nextInt(1000))
        .limit(10)
        .forEach(e -> System.out.println(e)); //.forEach(System.out::println);
    }
}