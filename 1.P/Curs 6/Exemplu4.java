public class Exemplu4{
    
    public static void main(String [] args){
        Subiect s = new Subiect();
        s.addMyListener(() -> System.out.println("A"));
        s.addMyListener(() -> System.out.println("B"));
        s.addMyListener(() -> System.out.println("C"));
        
        s.subiectModificat();
    }
}