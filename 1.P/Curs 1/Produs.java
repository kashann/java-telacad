public class Produs {
    public String nume;
    public double pret;
    
    public Produs(String nume, double pret){
        this.nume = nume;
        this.pret = pret;
    }
    
    @Override
    public String toString(){
        return nume + " " + pret;
    }
}