import java.util.*;

public class Exemplu25{
    public static void main(String [] args){
        List<String> list = Arrays.asList("A", "AA", "BCD", "QW", "KKKK");
        //afisati lungimile pare ale sirurilor
        list.stream()
            .map(s -> s.length()) //transforma ceva in altceva, streamul in lungimea lui
            .filter(e -> e % 2 == 0)
            .forEach(System.out::println);
            
        double rez = list.stream()
            .map(s -> s.length()) //transforma ceva in altceva, streamul in lungimea lui
            .filter(e -> e % 2 == 0)
            .reduce(1, (i, j) -> i*j);
        System.out.println(rez);
    }
}