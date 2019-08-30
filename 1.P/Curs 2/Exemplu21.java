import java.nio.file.*;

public class Exemplu21{
    public static void main(String [] args){
        try{
            Path p1 = Paths.get("AAA");
            Path p2 = Paths.get("BBB/CCC/DDD");
            
            Files.createDirectory(p1); //file.mkdir()            
            Files.createDirectories(p2); //file.mkdirs()
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}