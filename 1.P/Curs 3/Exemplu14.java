import java.time.*;

public class Exemplu14{
    public static void main(String [] args){
        Period p1 = Period.of(1, 0, 2);
        System.out.println(p1);
        
        Duration d1 = Duration.ofHours(10);
        System.out.println(d1);
    }
}