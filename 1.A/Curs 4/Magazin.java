public class Magazin{
    private final String adresa;
    private final Produs[] produse;
    
    public Magazin(String adresa, Produs[] produse){
        this.adresa = adresa;
        this.produse = produse;
    }
    
    public String getAdresa(){
        return this.adresa;
    }
    
    public Produs[] getProdus(){
        return this.produse;
    }
    
    private static Produs[] copyProduseArray(Produs[] produse){
        Produs[] produseCopy = new Produs[produse.length];
        for(int i = 0; i < produse.length; i++){
            produseCopy[i] = produse[i];
        }
        return produseCopy;
    }
}