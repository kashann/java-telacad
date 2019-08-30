import java.nio.file.*;

public class Exemplu9{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/AAA/BBB/CCC/DDD");
        Path s1 = p1.subpath(0,2);
        System.out.println(s1);
    }
}