import java.nio.file.*;

public class Exemplu28{
    public static void main(String [] args){
        Path p1 = Paths.get("Exemplu1.java");
        try{
            Files.lines(p1).forEach(System.out::println);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}