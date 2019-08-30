import java.util.*;
import java.util.stream.*;

public class Exemplu4{
    public static void main(String [] args){
       List<Integer> list = Arrays.asList(1,3,5,6,7,8,9,4);
        
       Map<Boolean, List<Integer>> map = 
            list.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0));
            
       System.out.println(map);
    }
}