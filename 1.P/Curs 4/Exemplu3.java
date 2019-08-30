import java.util.*;
import java.util.stream.*;

public class Exemplu3{
    public static void main(String [] args){
        Produs p1 = new Produs("A", 10);
        Produs p2 = new Produs("B", 20);
        Produs p3 = new Produs("C", 30);
        Produs p4 = new Produs("D", 40);
        Produs p5 = new Produs("E", 50);
        
        List<Produs> produse = Arrays.asList(p1, p2, p3, p4, p5);
        Map<Double, List<Produs>> map =
            produse.stream().collect(Collectors.groupingBy(p -> p.pret));
            
        System.out.println(map);
        System.out.println(map.get(10.0));
    }
}