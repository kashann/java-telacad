import java.nio.file.*;

public class Exemplu10{ //not working correctly 10-14
    public static void main(String [] args){
        Path p1 = Paths.get("AAA/BBB");
        Path p2 = Paths.get("C:/CCC/DDD");
        Path p3 = p1.resolve(p2);
        System.out.println(p3);
    }
}