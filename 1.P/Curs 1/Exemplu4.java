import java.io.*;

public class Exemplu4{
    public static void main(String [] args){
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
        ){
            while(true){
                System.out.print("Comanda: ");
                String cmd = br.readLine();
                
                String[] v = cmd.split("\\s+");
                
                switch(v[0]){
                    case "exit": return;
                    case "ap":
                        String nume = v[1];
                        double pret = Double.parseDouble(v[2]);
                        Produs p = new Produs(nume, pret);
                        Magazin.getInstance().adaugaProdus(p);
                        System.out.println("A fost adaugat un produs!");
                        break;
                    case "afisare":
                        Magazin.getInstance().afisareProduse();
                        break;
                    case "save":
                        Magazin.getInstance().salvareProduse(v[1]);
                        System.out.println("Produsul a fost salvat!");
                        break;
                    case "open":
                        Magazin.getInstance().citireProduse(v[1]);
                        System.out.println("Produsele au fost citite!");
                        break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}