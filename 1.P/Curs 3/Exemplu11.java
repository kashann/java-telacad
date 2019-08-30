import java.time.*;

public class Exemplu11{
    public static void main(String [] args){
        LocalDate d1 = LocalDate.of(2017, 2, 2);
        LocalTime t1 = LocalTime.of(14, 20);
        
        LocalDateTime ldt1 = LocalDateTime.of(d1, t1);
        
        System.out.println(ldt1); //2017-02-02T14:20
    }
}