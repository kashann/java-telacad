import java.util.*;
public class Biblioteca{
    private static Biblioteca SINGLETON;
    
    private ArrayList<Articol> articole = new ArrayList<>();
    
    private Biblioteca(){

    }
    
    public static Biblioteca getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Biblioteca();
        }
        return SINGLETON;
    }
    
    public void afisare(){
        articole.stream().forEach(System.out::println);
    }
    
    public void afisareCarti(){
        articole.stream().filter(a -> a instanceof Carte).forEach(System.out::println);
    }
    
    public void stergere(String titlu){
        for(int i = 0; i < articole.size(); i++){
            if(articole.get(i).titlu.equals(titlu)){
                articole.remove(i);
                i--;
            }
        }
    }
    
    public void adaugare(Articol a){
        articole.add(a);        
    }
}