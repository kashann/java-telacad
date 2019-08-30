import java.nio.file.*;
import java.io.*;

public class Exemplu26{
    public static void main(String [] args){
        Path p1 = Paths.get("./");
        try{
            Files.walk(p1)
            .map(p -> p.toString())
            .filter(s -> s.contains(".java"))
            .forEach(System.out::println);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}