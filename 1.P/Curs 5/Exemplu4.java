import java.util.*;

public class Exemplu4{
    
    public static void main(String [] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        
        long t1 = System.currentTimeMillis();
        list.parallelStream()
            .map(v-> twice(v))
            .forEachOrdered(System.out::println);
        long t2 = System.currentTimeMillis();
        System.out.println("TIME: " + (t2 - t1));
    }
    
    private static int twice(int v){
        try{
            Thread.sleep(500);
            return 2*v;
        }catch(Exception e){
            e.printStackTrace();
        }
        return 0;
    }
}