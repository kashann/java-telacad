import java.util.concurrent.*;
import java.util.stream.*;

public class Exemplu7{
    public static void main(String [] args){
        //ExecutorService service = Executors.newCachedThreadPool();
        //ExecutorService service = Executors.newSingleThreadExecutor();
        ExecutorService service = Executors.newFixedThreadPool(2);
        
        try{
            service.execute(() -> afisareNumere());
            System.out.println("END");
        }finally{
            service.shutdown();
        }
    }
    
    private static void afisareNumere(){
        Stream.iterate(1, i -> i+1).limit(10).forEach(System.out::println);
    }
}