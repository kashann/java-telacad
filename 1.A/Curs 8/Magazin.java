import java.util.*;

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
        produse.add(p);
    }
    
    public void afisareProduse(){
        produse.forEach(System.out::println);
    }
    
    public void stergeProdus(String nume){
        for(int i = 0; i < produse.size(); i++){
            if(produse.get(i).nume.equals(nume)){
                produse.remove(produse.get(i));
            }
        }
    }
}