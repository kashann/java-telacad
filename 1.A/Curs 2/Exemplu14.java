public class Exemplu14{
    public static void main(String [] args){
        int x = 50;
        transferPrinValoare(x);
        System.out.println(x);
        
        Punct p = new Punct (100,100);
        transferPrinReferinta(p);
        System.out.println(p.x + " " + p.y);
    }
    
    public static void transferPrinValoare(int x){
        x = 10;
    }
    
    public static void transferPrinReferinta(Punct p){
        p.x = 10;
    }
}