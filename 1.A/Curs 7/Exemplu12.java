import java.util.*;

public class Exemplu12{
    
    public static void main (String [] args){
        Scanner s = new Scanner(System.in);
        
        String cmd = null;
        
        while(true){
            System.out.print("Comanda: ");
            cmd = s.nextLine();
            
            String [] v = cmd.split("\\s+");
            
            switch(v[0]){
                case "exit":
                    System.out.println("Bye bye!");
                    return;
                case "suma":
                    int x = Integer.parseInt(v[1]);
                    int y = Integer.parseInt(v[2]);
                    System.out.println("Suma: " + (x + y));
            }
        }
    }
}