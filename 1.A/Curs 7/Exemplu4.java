public class Exemplu4{
    
    public static void main(String [] args){
        try{
            int x = 10/10;
            System.out.println(x);
        }catch(NullPointerException | ArithmeticException e){
            System.out.println("Eroare 1");
        }
    }
}