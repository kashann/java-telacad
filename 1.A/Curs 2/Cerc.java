public class Cerc{
    double raza;
    Punct centru;
    
    Cerc(double raza, Punct centru){
        this.raza = raza;
        this.centru = centru;
    }
    
    double getArie(){
        double a = 3.14 * this.raza * this.raza;
        
        return a;
    }
    
    
    double getLungime(){
        double l = 2 * 3.14 * this.raza;
        
        return l;
    }
    
    boolean isTangent(Cerc c){
        //double d = this.centru.getDistance(c.centru);
        Punct centruCerc1 = this.centru;
        Punct centruCerc2 = c.centru;
        double d = centruCerc1.getDistance(centruCerc2);
        if(d == this.raza + c.raza){
            return true;
        }
        return false;
    }
}