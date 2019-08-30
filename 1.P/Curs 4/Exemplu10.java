import java.util.concurrent.*;
import java.util.*;

public class Exemplu10{
    private static Semaphore sem = new Semaphore(1);
    
    public static void main(String [] args){ 
    }
    
    public static void afisare(){
        int x = new Random().nextInt(1000);
        try{
            if(x % 2 == 0) sem.acquire();
            for(int i = 0; i < 10; i++){
                System.out.println(i);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            if(x % 2 == 0) sem.release();
        }
    }
}