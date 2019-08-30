import java.util.concurrent.*;

public class Exemplu11{
    private static CyclicBarrier barrier = new CyclicBarrier(3);
    public static void main(String [] args){
        ExecutorService service = Executors.newFixedThreadPool(3); //daca e 2 aici => dead lock
        
        service.execute(() -> afisare(1));
        service.execute(() -> afisare(2));
        service.execute(() -> afisare(3));
        
        service.shutdown();
    }
    
    public static void afisare(int i){
        try{
            
            System.out.println("PASSED " + i);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}