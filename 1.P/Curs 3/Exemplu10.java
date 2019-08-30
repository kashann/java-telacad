import java.time.*;

public class Exemplu10{
    public static void main(String [] args){
        LocalTime t1 = LocalTime.now();
        
        LocalTime t2 = LocalTime.of(10,54);
        LocalTime t3 = LocalTime.of(10, 20, 30);
        LocalTime t4 = LocalTime.of(10, 54, 30, 50);
        
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);
    }
}