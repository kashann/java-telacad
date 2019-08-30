public class A{
    int x = 10;
    String y;
    
    //mai intai se executa atribuirile, dupa care blocurile anonime in ordinea in care sunt scrise, dupa constructorii
    
    {
        System.out.println("B "+ x + " " + y);
    }
    
    public A(){        
        System.out.println("A "+ x + " " + y);
    }
    
    {
        x = 50;
        y = "HELLO";
        System.out.println("C");
    }
    
    {
        System.out.println("D "+ x + " " + y);
    }
}