import java.nio.file.*;

public class Exemplu6{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/ABC/OWE/OOO/AAA");
        
        System.out.println("ROOT " + p1.getRoot());
        System.out.println("PARENT " + p1.getParent());
        System.out.println("FILE NAME " + p1.getFileName());
    }
}