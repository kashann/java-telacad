import java.nio.file.*;

public class Exemplu7{
    public static void main(String [] args){
        Path p1 = Paths.get("C:/ABC/OWER/RRR");
        //radacina nu este luata in considerare
        for(int i = 0; i < p1.getNameCount(); i++) {
            System.out.println(p1.getName(i));
        }
    }
}