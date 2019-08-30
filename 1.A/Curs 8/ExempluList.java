import java.util.*;

public class ExempluList{
    
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(3,4,5,6,7,8);
        
        list.forEach(System.out::println);
    }
}