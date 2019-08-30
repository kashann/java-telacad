import java.util.Scanner;

public class Exemplu10{
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        System.out.print("Nume: ");
        String nume = s.nextLine();
        
        System.out.println("Salut, " + nume + "!");
    }
}