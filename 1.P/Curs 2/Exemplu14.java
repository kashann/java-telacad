import java.nio.file.*;

public class Exemplu14{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/AAA/./././../BBB");
        Path p2 = Paths.get("C:/CCC/./././../././DDD");
        Path p3 = p1.resolve(p2);
        System.out.println(p3);
        
        Path normalP1 = p1.normalize();
        System.out.println(normalP1);
    }
}