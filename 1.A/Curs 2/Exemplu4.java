public class Exemplu4{
    public static void main(String [] args){
        int i = 0;
        
        while(i <= 100){
            i++;
            if(i % 2 == 0) continue;
            System.out.println(i);
        }
    }
}