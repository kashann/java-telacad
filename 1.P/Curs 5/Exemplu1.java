import java.util.concurrent.locks.*;

public class Exemplu1{
    private int x;
    private ReentrantReadWriteLock lock = new ReentrantReadWriteLock();
    
    public void increment(){
        try{
            lock.writeLock().lock();
            x++;
        }finally{
            lock.writeLock().unlock();
        }
    }
    
    public int getValue(){
        try{
            lock.readLock().lock();
            return x;
        }finally{
            lock.readLock().unlock();
        }
    }
}