import java.util.*;
import java.util.stream.*;

public class Exemplu6{
    public static void main(String [] args){
        Thread t = new Thread(() -> afisareNumere());
        t.start();
    }
    
    private static void afisareNumere(){
        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }
    }
}