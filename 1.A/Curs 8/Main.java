import java.util.*;

public class Main{
    
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        
        String cmd;
        
        while(true){
            System.out.print("Comanda: ");
            cmd = s.nextLine();
            String [] v = cmd.split("\\s+");
            
            switch(v[0]){
                case "exit":
                    System.out.println("Bye!");
                    return;
                case "ab":{
                    double pret = Double.parseDouble(v[2]);
                    double pa = Double.parseDouble(v[3]);
                    Bere b = new Bere(v[1], pret, pa);
                    Magazin.getInstance().adaugaProdus(b);
                    System.out.println("Am adaugat o bere!");
                }break;
                case "ac":{
                    double pret = Double.parseDouble(v[2]);
                    double kCal = Double.parseDouble(v[3]);
                    Ciocolata b = new Ciocolata(v[1], pret, kCal);
                    Magazin.getInstance().adaugaProdus(b);
                    System.out.println("Am adaugat o ciocolata!");
                }break;
                case "sterge":{
                    Magazin.getInstance().stergeProdus(v[1]);
                }break;
                case "afisare":{
                    Magazin.getInstance().afisareProduse();
                }break;
            }
        }
    }
}
                