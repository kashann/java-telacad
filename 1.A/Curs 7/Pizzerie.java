// Aplicatia unui restaurant poate nota comenzi. O comanda poate avea mai multe produse adaugate. Pentru ca restaurantul nostru este o pizzerie, comercializeaza doar pizza.
// Pizza poate fi de 3 feluri: Funghi, Quattro Fromaggi si Diavola. Orice pizza are un pret. O comanda poate avea maxim 10 pizza.
// exit -> inchide aplicatia, afisare -> toate pizzele din comanda, ap tip pret, apq -> afisez doar quatrro fromagi din comanda.

import java.util.*;

public class Pizzerie{ // Exemplu13
    
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
                case "ap":
                    try{
                        switch(v[1]){    
                        case "q":
                            PizzaQuattroFromaggi pq = new PizzaQuattroFromaggi();
                            pq.pret = Double.parseDouble(v[2]);
                            Comanda.getInstance().adaugaPizza(pq);
                            break;
                        case "f":
                            PizzaFunghi pf = new PizzaFunghi();
                            pf.pret = Double.parseDouble(v[2]);
                            Comanda.getInstance().adaugaPizza(pf);
                            break;
                        case "d":
                            PizzaDiavola pd = new PizzaDiavola();
                            pd.pret = Double.parseDouble(v[2]);
                            Comanda.getInstance().adaugaPizza(pd);
                            break;
                    }
                }catch(ComandaCompletaException e){
                    System.out.println(e.getMessage());
                }
                break;
                
                case "afisare":
                    Comanda.getInstance().afisarePizza();
                    break;
                case "apq":
                    Comanda.getInstance().afisarePizzaQuattroFromaggi();
                    break;
                case "apf":
                    Comanda.getInstance().afisarePizzaFunghi();
                    break;
                case "aqd":
                    Comanda.getInstance().afisarePizzaDiavola();
                    break;
            }
        }
    }
}