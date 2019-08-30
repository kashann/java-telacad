@FunctionalInterface
public /*abstract*/ interface Instrument{
    int x1 = 10;
    public int x2 = 10;
    static int x3 = 10;
    final int x4 = 10;
    public static final int x5 = 10;
    
    public void  /*abstract*/  play(); // public ca sa nu se creeze confuzii
    
    default void m1(){
        System.out.println(":)");
    }
    
    static void m2(){
        System.out.println(":|");
    }
}