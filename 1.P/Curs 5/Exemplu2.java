import java.util.concurrent.atomic.*;

public class Exemplu2{
    public static void main(String [] args){
        AtomicInteger i1 = new AtomicInteger(10);
        int x = i1.incrementAndGet();
        
        System.out.println(x);
    }
}