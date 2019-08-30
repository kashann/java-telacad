import java.nio.file.*;

public class Exemplu18{
    public static void main(String [] args){
        Path p1 = Paths.get("DIR1");
        boolean exists = Files.exists(p1);
        
        System.out.println(exists);
        
        boolean isDir = Files.isDirectory(p1);
        System.out.println(isDir);
        
        boolean isFile = Files.isRegularFile(p1);
        System.out.println(isFile);
    }
}