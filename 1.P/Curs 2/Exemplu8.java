import java.nio.file.*;

public class Exemplu8{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/ABC/DEF");
        Path p2 = Paths.get("ABC/DEF"); //daca este "/ABC/DEF" cu / in fata, atunci este cale absoluta
        
        System.out.println(p1.isAbsolute());
        System.out.println(p2.isAbsolute());
    }
}