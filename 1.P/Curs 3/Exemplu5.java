import java.util.function.*;

public class Exemplu5{
    public static void main(String [] args){
        BiConsumer<Integer, Integer> a1 = (x, y) -> System.out.println(x+y);
        
        BiFunction<Integer, Integer, String> a2 = (x, y) -> x + " " + y;
        BiFunction<Integer, Integer, Integer> a4 = (x, y) -> x + y; //a4 echivalent cu a5
        BinaryOperator<Integer> a5 = (x, y) -> x + y;
        
        Function<String, Integer> a3 = x -> x.length();
        
        Predicate<Integer> a6 = x -> x % 2 == 0;
        BiPredicate<Integer, String> a7 = (x, y) -> y.length() == x;
        
        Function<Integer, Integer> a8 = x -> x + 1;
        UnaryOperator<Integer> a9 = x -> x + 1;
        //etc
    }
}