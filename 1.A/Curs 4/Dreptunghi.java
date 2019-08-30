public class Dreptunghi extends Punct{
    double lungime;
    double latime;
        
    public Dreptunghi(){  //(double lungime, double latime){
        super(0,0);
        this.x = 10;
        this.y = 20;
    }
    
    public double getArie(){
        return this.lungime * this.latime;
    }
}