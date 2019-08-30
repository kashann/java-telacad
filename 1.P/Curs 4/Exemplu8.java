import java.util.concurrent.*;
import java.time.*;

public class Exemplu8{
    public static void main(String [] args){
        ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
        
        try{
            //service.scheduleAtFixedRate(() -> afisareOra(), 0, 1, TimeUnit.SECONDS);
            service.scheduleWithFixedDelay(() -> afisareOra(), 0, 1, TimeUnit.SECONDS);
            Thread.sleep(5000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }finally{
            service.shutdown();
        }
    }
    
    private static void afisareOra(){
        System.out.println(LocalTime.now());
    }
}