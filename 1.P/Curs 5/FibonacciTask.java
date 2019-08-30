import java.util.concurrent.*;

public class FibonacciTask extends RecursiveTask<Integer>{
    private Integer n;
    
    public FibonacciTask(Integer n){
        this.n = n;
    }
    
    @Override
    public Integer compute(){
        if(n <= 1){
            return n;
        }
        
        FibonacciTask f1 = new FibonacciTask(n - 1);
        FibonacciTask f2 = new FibonacciTask(n - 2);
        
        f1.fork();
        
        System.out.println("f1 " + (n - 1) + " f2 " + (n - 2));
        return f2.compute() + f1.join();
    }
}