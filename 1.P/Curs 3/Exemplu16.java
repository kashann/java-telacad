import java.util.*;

public class Exemplu16{
    public static void main(String [] args){
        Locale locFR = new Locale("fr", "FR");
        ResourceBundle myBundle1 = ResourceBundle.getBundle("mybundle", locFR);
        System.out.println(myBundle1.getString("txtHello"));
        
        ResourceBundle myBundle2 = ResourceBundle.getBundle("mybundle", Locale.GERMAN);
        System.out.println(myBundle2.getString("txtHello"));
    }
}