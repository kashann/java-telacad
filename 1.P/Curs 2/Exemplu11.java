import java.nio.file.*;

public class Exemplu11{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/AAA/BBB");
        Path p2 = Paths.get("CCC/DDD");
        Path p3 = p2.resolve(p1);
        System.out.println(p3);
    }
}