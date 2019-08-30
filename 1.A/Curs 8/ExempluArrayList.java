import java.util.*;

public class ExempluArrayList{
    
    public static void main(String [] args){
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(18);
        list.add(60);
        list.add(50);
        list.add(5);
        list.add(10);
        list.add(80);
        
        //for(int i = 0; i < list.size(); i++){
        //    System.out.println(list.get(i));
        //}
        
        //for(Integer x : list){
        //    System.out.println(x);
        //}
        
        //list.forEach(e -> System.out.println(e));
        
        //list.remove(5);
        list.remove((Integer) 5);
        list.forEach(System.out::println);
    }
}