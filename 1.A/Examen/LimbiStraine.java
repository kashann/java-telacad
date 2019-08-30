public class LimbiStraine extends Curs{
    
    public LimbiStraine(){
        this.id = super.noCursuri + 1;
        super.noCursuri++;
    }
    
    public LimbiStraine(String denumire, int pret){
        this.denumire = denumire;
        this.pret = pret;
        this.id = super.noCursuri + 1;
        super.noCursuri++;
    }
    
    @Override
    public String toString(){
        return "Curs limbi straine: (" + id + ") " + denumire + " -> " + pret + " RON";
    }
}