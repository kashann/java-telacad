import java.util.*;

public class Exemplu7{
    public static void main(String [] args){
        List<Produs> produse = Arrays.asList(
            new Produs("ananas", 15),
            new Produs("apa", 5),
            new Produs("mere", 2),
            new Produs("bere", 4),
            new Produs("pere", 3),
            new Produs("arpagic", 10)
            );
            
        double sum = produse.stream()
            .filter(p -> p.nume.startsWith("a"))
            .mapToDouble(p -> p.pret)
            .sum();
            
        System.out.println(sum);
    }    
}