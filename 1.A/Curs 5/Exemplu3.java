public class Exemplu3{
    public static void main(String [] args){
        Persoana p1 = new Persoana();
        
        Burger b1 = new Burger();
        Hotdog h1 = new Hotdog();
        Cola c1 = new Cola();
        
        p1.mananca(b1);
        p1.mananca(h1);
        p1.mananca(c1);
    }
}