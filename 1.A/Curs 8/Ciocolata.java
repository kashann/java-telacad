public class Ciocolata extends Produs{
    
    int kCal;
    
    public Ciocolata(String nume, double pret, double kCal){
        this.nume = nume;
        this.pret = pret;
        this.kCal = kCal;
    }
    
    @Override
    public String toString(){
        return "BERE: " + nume + " " + pret + " " + kCal;
    }
}