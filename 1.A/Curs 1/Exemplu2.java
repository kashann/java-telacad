public class Exemplu2{
    public static void main(String [] args){
        int x = 10;
        int y = 50;
        
        boolean b1 = x == y; // F
        boolean b2 = x - 5 == y * 5; // F
        boolean b3 = x != y; // T
        boolean b4 = b1 == b2; // T
        boolean b5 = 4 >= x; // F
        boolean b6 = x < 5; // F
    }
}