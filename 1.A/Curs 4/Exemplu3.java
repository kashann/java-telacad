public class Exemplu3{
    public static void main(String [] args){
        Cerc c = new Cerc();
        c.raza = 10;
        
        Cilindru cil = new Cilindru(10, 10, 10, 10);
        
        System.out.println(c.getArie());
        System.out.println(cil.getArie());
    }
}