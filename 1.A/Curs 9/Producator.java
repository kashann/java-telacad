import java.util.*;

public class Producator extends Thread{
    private Random r = new Random();
    
    public Producator(String nume){
        super(nume);
    }
    
    @Override
    public void run(){
        try{
            while(true){
                synchronized(Exemplu3.list){
                    if(Exemplu3.list.size() < 100){
                        int x = r.nextInt(1000);
                        Exemplu3.list.add(x);
                        Exemplu3.list.notifyAll();
                        System.out.println("A fost adaugata valoarea " + x);
                    } else {
                        Exemplu3.list.wait();
                    }
                }
            }
        } catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}