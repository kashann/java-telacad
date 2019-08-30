import java.util.concurrent.*;
import java.util.*;

public class Exemplu9{
    public static void main(String [] args){
        ExecutorService service = Executors.newSingleThreadExecutor();
        
        try{
            Callable<Integer> c = () -> new Random().nextInt(1000);
            Future<Integer> f = service.submit(c);
            
            //possibly other instructions
            
            Integer result = f.get();
            System.out.println(result);
        }catch(InterruptedException | ExecutionException e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }
    }
}