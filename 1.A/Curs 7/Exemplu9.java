import java.util.stream.*;
import java.util.Random;

public class Exemplu9{
    
    public static void main(String [] args){
        System.out.print(
        Stream.generate(()->new Random().nextInt(49)+1)
            .distinct()
            .limit(6)
            .map(String::valueOf)
            .collect(Collectors.joining(" ")));
    }
}