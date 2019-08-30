public class Cerc extends Punct{
    double raza;
    int w;
    
    public Cerc(){
        this(1,1);
    }
    
    public Cerc(int x, int y){
        super(x,y);
        this.x = 10;
        this.y = 20;
        this.raza = 30;
    }
    
    public double getArie(){
        return 3.14 * this.raza * this.raza;
    }
}