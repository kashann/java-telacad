import java.util.Random;

public class Exemplu8{ //LOTO 6 DIN 49
    
    public static void main(String [] args){
        Random r = new Random();
        int [] v = new int [6];
        int i = 0;
        
        while(i < 6){
            int x = r.nextInt(49) + 1;
            
            boolean exists = false;
            for(int j = 0; j < v.length; j++){
                if(v[j] == x){
                    exists = true;
                    break;
                }
            }
            
            if(!exists){
                v[i] = x;
                i++;
            }
        }
        
        for(int j = 0; j < v.length; j++){
            System.out.print(v[j] + " ");
        }
    }
}