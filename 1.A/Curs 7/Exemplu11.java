import java.util.Scanner;

public class Exemplu11{
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        try{
             System.out.print("NR: ");
             double x = Double.parseDouble(s.nextLine());
             System.out.println(Math.sqrt(x));
            }catch(NumberFormatException e){
                System.out.println("Introdu un numar!");
            }
    }
}