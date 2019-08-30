import java.nio.file.*;

public class Exemplu27{
    public static void main(String [] args){
        try{
            Path p1 = Paths.get("Exemplu1.java");
            List<String> lines = Files.readAllLines(p1);
            lines.forEach(System.out::println);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}