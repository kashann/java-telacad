import java.nio.file.*;

public class Exemplu20{
    public static void main(String [] args){
        try{
            Path p1 = Paths.get("Exemplu1.java");
            Path p2 = Paths.get("test_copy.txt");
            
            Files.copy(p1, p2); //metoda ce copiaza binar, deci putem copia orice fisier
            //Files.move(p1, p2); //cut - paste
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}