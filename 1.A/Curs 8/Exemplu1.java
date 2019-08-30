public class Exemplu1{
    public static void main(String [] args){
        Punct<Integer> p1;
        p1 = new Punct<Integer>();
        Punct<Double> p2 = new Punct<Double>();
        //Punct<int[]> p3 = new Punct<int[]>();
        //Punct<String> p4 = new Punct<String>();
                
        p1.x = 10;
        p2.x = 10.5;
        
        Punct<Integer> p3 = new Punct<Integer>();
        
    }
}