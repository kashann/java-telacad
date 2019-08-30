import java.time.*;

public class Exemplu9{
    public static void main(String [] args){
        LocalDate d1 = LocalDate.now();
        
        LocalDate d2 = LocalDate.of(2017, 2, 10);
        LocalDate d3 = LocalDate.of(2017, 2, 20);
        
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
    }
}