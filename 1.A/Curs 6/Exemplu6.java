public class Exemplu6{
    
    public static void main(String [] args){
        Produs p1 = new Produs ("bere", 3);
        System.out.println(p1); //Produs@ffa234f -> returns hexi
        
        int [] a = new int[10];
        System.out.println(a);
        
        Produs p2 = new Produs("cioco", 3);
        
        boolean b = p1.equals(p2);
        System.out.println(b);
        
        String s1 = "x";
        String s2 = "x";
        
        if (s1.equals(s2)){
            
        }
    }
}