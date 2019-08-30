import java.util.*;

public class Exemplu4{
    
    public static void main(String [] args){
        Comparator<Pisica> c1 = new Comparator<Pisica>(){
            @Override
            public int compare(Pisica p1, Pisica p2){
                return p1.nume.compareTo(p2.nume);
            }
        };
        
        TreeSet<Pisica> set = new TreeSet<>(
            (p1,p2) -> p1.nume.compareTo(p2.nume)
        );
        
        set.add(new Pisica("Tom", 3));
        set.add(new Pisica("Leo", 1));
        set.add(new Pisica("Mitzy", 2));
        set.add(new Pisica("Buffy", 4));
        
        set.forEach(p -> System.out.println(p.nume + " " + p.varsta));
    }
}