public class Exemplu2{
    public static void main(String [] args){
        EvenNumbersRunnable r = new EvenNumbersRunnable();
        Thread t = new Thread(r);
        t.start();
        
        System.out.println("END");;
    }
}