public class Exemplu7{
    public static void main(String [] args){
        Produs p1 = new Produs();
        
        p1.nume("bere");
        p1.pret(4);
        
        System.out.println(p1.getPret()+" "+p1.getNume());
    }
}