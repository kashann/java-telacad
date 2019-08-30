public class Exemplu10{
    public static void main(String [] args){
        Consumator a1 = x -> System.out.println(x);
        Consumator a2 = (x) -> System.out.println(x);
        Consumator a3 = (int x) -> System.out.println(x);
        Consumator a4 = System.out::println;
        
        Producator b1 = () -> 10;
        
        Producator b2 = () -> {
            return 10;
        };
        
        Functie c1 = (x,y) -> x + y;
        Functie c2 = (int x, int y) -> x + y;
        Functie c3 = (x,y) -> {
            return x + y;
        };
        
        Functie c4 = Exemplu10::suma;
        Functie c5 = (x,y) -> Exemplu10.suma(x,y);
        
        apeleazaOFunctie(c4, 10, 20);
        apeleazaOFunctie(Exemplu10::suma, 10, 20);
    }
    
    public static int suma(int x, int y){
        return x + y;
    }
    
    public static void apeleazaOFunctie(Functie f, int x, int y){
        System.out.println(f.operatie(x,y));
    }
    
}