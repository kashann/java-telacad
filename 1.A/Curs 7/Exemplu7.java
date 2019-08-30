import java.util.Random;

public class Exemplu7{
        
    public static void main(String [] args){
        Random r = new Random();
            
        int a = r.nextInt(); //orice nr int
        int b = r.nextInt(1000); //[0,999]
        double c = r.nextDouble(); //[0, 1)
        boolean d = r.nextBoolean(); //true/false
          
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}