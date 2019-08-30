public class Exemplu2{
    public static void main(String [] args){
        int [] x = new int[5];
        
        for(int i = 0; i < x.length; i++){
            x[i] = (i + 1) * 10;
        }
        
        for(int a:x){  // enhanced for
            System.out.println(a);
        }
    }
}