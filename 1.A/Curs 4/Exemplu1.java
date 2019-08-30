public class Exemplu1{
    public static void main(String [] args){
        Punct p1 = new Punct(0,0);
        
        Cerc c1 = new Cerc();
        
        p1.x = 10;
        p1.y = 20;
        
        c1.x = 20;
        c1.y = 30;
        c1.raza = 30;
        
        System.out.println(c1.getArie());
    }
}