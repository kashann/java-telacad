import java.util.*;

public class ExempluArratDeque{
    
    public static void main(String [] args){
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        
        deque.push(10);
        deque.push(60);
        deque.offer(4);
        deque.push(45);
        deque.pop();
        deque.peek();
        deque.push(56);
        deque.offer(66);
        deque.peek();
        deque.pop();
        deque.offer(90);
        
        deque.forEach(System.out::println);
    }
}