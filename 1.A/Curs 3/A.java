public class A{
    final int X = 10;
    final int Y;
    final int Z;
    final static int W = 10;
    
    {
        Z = 20;
    }
    
    A(int y){
        this.Y = y;
    }
    
    static{
       
    }
    
    void m1(final int g){
        final int k;
        k = 10;
    }
}