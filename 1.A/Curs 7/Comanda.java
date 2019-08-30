public class Comanda{
    private static Comanda SINGLETON;
    
    private Pizza [] pizza = new Pizza[10];
    private int n;
    
    private Comanda(){
    }
    
    public static Comanda getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Comanda();
        }
        
        return SINGLETON;
    }
    
    public void adaugaPizza(Pizza p){
        if(n < pizza.length){
            pizza[n] = p;
            n++;
        } else {
            throw new ComandaCompletaException();
        }
    }
    
    public void afisarePizza(){
        for(int i = 0; i < n; i++){
            if(pizza[i] instanceof PizzaQuattroFromaggi){
                System.out.println(pizza[i]);
            }
        }
    }
}