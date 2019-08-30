import java.time.*;
import java.util.*;

public class Exemplu13{
    public static void main(String [] args){
        ZoneId z = ZoneId.of("Europe/London");
        ZonedDateTime zd = ZonedDateTime.now(z);
        System.out.println(zd);
        
        LocalDate ld1 = LocalDate.of(2017, 2, 2);
        LocalTime lt1 = LocalTime.of(15, 30);
        ZonedDateTime zdt1 = ZonedDateTime.of(ld1, lt1, z);
        System.out.println(zdt1);
        
        
        //ZonedDateTime zdt2 = ZonedDateTime.of(zdt1, z);
        
        //System.out.println(zdt2);
    }
}