import java.time.*;
import java.util.*;

public class Exemplu12{
    public static void main(String [] args){
        Set<String> ids = ZoneId.getAvailableZoneIds();
        ids.stream()
            .filter(s -> s.startsWith("Europe"))
            .forEach(System.out::println);
    }
}