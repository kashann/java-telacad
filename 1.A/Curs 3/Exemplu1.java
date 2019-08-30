public class Exemplu1{
    public static void main(String [] args){
        Punct p1 = new Punct ();
        Punct p2 = new Punct ();
        
        p1.x = 10;
        p1.z = 10;
        
        p2.x = 20;
        p2.z = 20;
        
        System.out.println(p1.x + " " + p1.z);
        System.out.println(p2.x + " " + p2.z);
        System.out.println(Punct.z);
    }
}