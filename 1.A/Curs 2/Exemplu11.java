public class Exemplu11{
    public static void main(String [] args){
        Pisica p1 = new Pisica("Tom", "negru", 3);
        System.out.println(p1.nume+" "+p1.culoare+" "+p1.varsta);
        
        p1.spuneMiau();
    }
}