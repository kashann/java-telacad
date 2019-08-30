import java.util.*;
import java.io.*;

public class Magazin{
    private static Magazin SINGLETON;
    private List<Produs> produse = new ArrayList<>();
    private Magazin(){
    }
    
    public static Magazin getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Magazin();
        }
        
        return SINGLETON;
    }
    
    public void adaugaProdus(Produs p){
        this.produse.add(p);
    }
    
    public void afisareProduse(){
        //for(Produs p:produse){
        //    System.out.println(p);
        //}
        ////produse.forEach(p -> System.out.println(p));
        produse.forEach(System.out::println);
    }
    
    public void salvareProduse(String fis){
        try(PrintStream out = new PrintStream(fis)){
            produse.forEach(out::println);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
    
    public void citireProduse(String fisier){
        try(
            FileInputStream fis = new FileInputStream(fisier);
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
        ){
            String line;
            while((line = br.readLine()) != null){
                String [] v = line.split("\\s+");
                String nume = v[0];
                double pret = Double.parseDouble(v[1]);
                Produs p = new Produs(nume, pret);
                produse.add(p);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}