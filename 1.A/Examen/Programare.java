public class Programare extends Curs{
    public Programare(){
                this.id = super.noCursuri + 1;
        super.noCursuri++;
    }
    
    public Programare(String denumire, int pret){
        this.denumire = denumire;
        this.pret = pret;
        this.id = super.noCursuri + 1;
        super.noCursuri++;
    }
    
    @Override
    public String toString(){
        return "Curs programare: (" + id + ") " + denumire + " -> " + pret + " RON";
    }
}