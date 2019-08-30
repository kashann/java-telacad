public class Exemplu1{
    public static void main(String [] args){
        OddNumbersThread t = new OddNumbersThread();
        t.start();
        
        System.out.println("END");
    }
}