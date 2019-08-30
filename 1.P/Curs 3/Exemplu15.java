import java.util.*;

public class Exemplu15{
    public static void main(String [] args){
        Locale l1 = new Locale("fr");
        Locale l2 = new Locale("fr", "CA");
        Locale l3 = Locale.getDefault();
        
        Locale l4 = new Locale.Builder()
            .setLanguage("fr")
            .setRegion("CA")
            .build();
            
        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);
    }
}