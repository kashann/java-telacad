import java.util.*;

public class Exemplu1{
    
    public static void main(String [] args){
        Builder1 b1 = new Builder1.Builder()
            .setA1(10)
            .setA3("HELLO")
            .setA4(true)
            .build();
            
        Locale loc = new Locale.Builder()
            .setLanguage("en")
            .setRegion("US")
            .build();
    }
}