public class Exemplu6{
    public static void main(String... args){
        m1();
        m1(2);
        
        int [] x = {3,4,5,6};
        m1(x);
        
        int [] y = {6,2,4};
        m2(x);
        
        int [][] w = {x,y};
        m2(w);
    }
    
    public static void m1(int... a){
        System.out.println(a.length);
        if(a.length > 0){
            System.out.println(a[0]);
        }
    }
    
    public static void m2(int[]... a){
    }
    
    public static void m3(String x, int y, int... w){
    }
    
}