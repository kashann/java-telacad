public class Produs{
    String nume;
    double pret;
    
    public Produs(String nume, double pret){
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString(){
        return "Produs: " + this.nume + " " + this.pret;
    }
}