public class C1{
    int x;
    
    public void m1(){
        final int a = 10;
        class C2{ // in ctx non static
            public void m3(){
                x = 10;
                System.out.println(a);
            }
        }
    }
    
    public static void m2(){
        class C3{ // in ctx static
            public void m4(){
                
            }
        }
    }
}