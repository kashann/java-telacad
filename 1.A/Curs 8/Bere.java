public class Bere extends Produs{
    
    double pa;
    
    public Bere(String nume, double pret, double pa){
        this.nume = nume;
        this.pret = pret;
        this.pa = pa;
    }
    
    @Override
    public String toString(){
        return "BERE: " + nume + " " + pret + " " + pa;
    }
}