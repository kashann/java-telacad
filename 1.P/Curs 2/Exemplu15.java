import java.nio.file.*;

public class Exemplu15{
    public static void main(String [] args){
        Path p1 = Paths.get("AAA/BBB/CCC/DDD");
        Path p2 = Paths.get("AAA/QQQ/EEE");
        
        // ../../../QQQ/EEE
        Path p3 = p1.relativize(p2);
        Path p4 = p2.relativize(p1);
        
        System.out.println(p3);
        System.out.println(p4);
    }
}