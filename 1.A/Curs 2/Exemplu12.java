public class Exemplu12{
    public static void main(String [] args){
        Punct p1 = new Punct(1,0);
        Punct p2 = new Punct(0,1);
        
        double d1 = p1.getDistance(p2);
        d1 = p2.getDistance(p1);
        d1 = p1.getDistance(p1);
        
        d1 = new Punct(1,0).getDistance(p2);
        d1 = new Punct(1,0).getDistance(new Punct(0,1));
        System.out.println(d1);
    }
}