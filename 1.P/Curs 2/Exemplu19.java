import java.nio.file.*;

public class Exemplu19{
    public static void main(String [] args){
        try{
            Path p1 = Paths.get("Exemplu1.java");
            Path p2 = Paths.get("Exemplu2.java");
            boolean isSame = Files.isSameFile(p1, p2);
            
            System.out.println(isSame);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}