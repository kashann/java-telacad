public class Exemplu2{
    
    public static void main(String [] args){
        Punct<Number>p1 = new Punct<Number>();
        
        Punct<?> p2 = new Punct<Number>();
        Punct<?> p3 = new Punct<Integer>();
        Punct<?> p4 = new Punct<Double>();
        
        Punct<? extends Number> p5 = new Punct<Number>();
        Punct<? extends Number> p6 = new Punct<Integer>();
        
        
        Punct<? extends Integer> p7 = new Punct<Integer>();
        Punct<? extends Integer> p8 = new Punct<Number>();
        //Punct<? super Integer> p9 = new Punct<Object>();
        
        Punct p10 = new Punct(){
            return null;
        }
        
    }
}