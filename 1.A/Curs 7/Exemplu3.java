public class Exemplu3{
    
    public static void main(String [] args){
        try{
            int x = 10/0;
            System.out.println(x);
        }catch(NullPointerException e){
            System.out.println("Eroare 1");
        }catch(ArithmeticException e){
            System.out.println("Eroare 2");
        }
    }
}