public class A1{
    private int x;
    static int y;
    
    class A2{ //clasa inner nonstatica
        
        public void m1(){
            A1.this.x = 10;
            y = 10;
        }
    }
    
    static class A3{ //clasa inner statica
        public void m2(){
            //x = 10; nu merge
            y = 10;
        }
    }
    
}