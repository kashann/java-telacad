import java.util.*;

public class Main{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        while (true){
            System.out.print("Comanda: ");
            String cmd = s.nextLine();
            
            String [] v = cmd.split("\\s+");
            
            switch(v[0]){
                case "exit":
                    System.out.println("Pa pa!");
                    return;
                    
                case "cd":{
                    CD c = new CD(v[1], v[2]);
                    Biblioteca.getInstance().adaugare(c);
                    System.out.println("A fost adaugat un CD!");
                }break;
                
                case "carte":{
                    Carte c = new Carte(v[1], v[2]);
                    Biblioteca.getInstance().adaugare(c);
                    System.out.println("A fost adaugata o carte!");
                }break;
                
                case "afisare":
                    Biblioteca.getInstance().stergere(v[1]);
                    System.out.println("A fost sters un articol!");
                    break;
            }
        }
    }
}