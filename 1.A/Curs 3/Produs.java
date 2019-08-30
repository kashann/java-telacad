public class Produs{
    private String nume;
    private double pret;
    private boolean expirat;
    
    public void setNume(String nume){
        this.nume = nume;
    }
    
    public String getNume(){
        return this.nume;
    }
    
    public void setExpirat(boolean expirat){
        this.expirat = expirat;
    }
    
    public boolean isExpirat(){
        return this.expirat;
    }
    
    public void setPret(double pret){
        this.pret = pret;
    }
    
    public double getPret(){
        return this.pret;
    }
    
    
}