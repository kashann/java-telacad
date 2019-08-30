public class Exemplu3{
    
    public static void main(String [] args){
        m(new CalculatorLogger(new CalculatorImpl()), 4, 5);
    }
    
    public static void m(Calculator c, int a, int b){
        System.out.println(c.suma(a,b));
    }
}