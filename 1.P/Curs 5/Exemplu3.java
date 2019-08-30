import java.util.*;

public class Exemplu3{
    
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        list.parallelStream().forEachOrdered(System.out::println); //Ordered->sincronizare, altfel ies nr random
    }
}