import java.util.*;

public class Exemplu17{
    public static void main(String [] args){
        ResourceBundle bund = ResourceBundle.getBundle("MyCodeBundle", Locale.getDefault());
        
        System.out.println(bund.getString("txtHello"));        
    }
}