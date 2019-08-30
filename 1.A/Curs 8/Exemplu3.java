public class Exemplu3{
    
    public static void main(String [] args){
        A<?, Integer> a1 = new A<Double, Integer>();
        A<? extends Number, ?> a2 = new A<Double, String>();
        
        A<Integer, Double> a3 = new A<>();
        
        A<A<Integer, String>, A<Long, A<String,String>>> x;
        
        A<String, Integer> a4 = new B<>();
    }
}