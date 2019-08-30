import java.nio.file.*;

public class Exemplu29{
    public static void main(String [] args){
        Path p1 = Paths.get("./");
        try{
            Files.list(p1).forEach(System.out::println);
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}