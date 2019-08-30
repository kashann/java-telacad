import java.util.concurrent.*;

public class Exemplu5{
    public static void main(String [] args){
        ForkJoinPool pool = new ForkJoinPool();
        
        System.out.println(pool.invoke(new FibonacciTask(10)));
    }
}

//hw: folosind fork join sa se gaseasca nr maxim dintr o lista cu multe numere

//carti: the clean-coding  &  clean coder  -  ROBERT C MARTIN aka UNCLE BOB
// design patterns  -  the gang of four