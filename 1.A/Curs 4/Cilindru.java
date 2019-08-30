public class Cilindru extends Cerc{
    double h;
    String w;
    
    public Cilindru(int x, int y, double raza, double h){
        this.x = x;
        this.y = y;
        this.raza = raza;
        this.h = h;
    }
    
    @Override
    public double getArie(){
        double lungime = 2 * 3.14 * this.raza;
        double aria = super.getArie();
        return 2 * aria + lungime * h;
    }
}
