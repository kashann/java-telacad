import java.util.*;

public class ExempluLinkedList{
    
    public static void main(String [] args){
        LinkedList<Integer> list = new LinkedList<>();
        
        list.addFirst(10);
        list.addFirst(65);
        list.addFirst(85);
        list.addLast(11);
        list.removeFirst();
        list.addLast(78);
        list.removeFirst();
        list.addFirst(99);
        list.addLast(78);
        list.addLast(45);
        list.removeLast();
        list.removeLast();
        list.addLast(9);
        
        list.forEach(System.out::println);
    }
}