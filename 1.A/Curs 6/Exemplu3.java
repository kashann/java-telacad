public class Exemplu3{
    
    public static void main(String [] args){
        //String s = "";
        StringBuilder s = new StringBuilder();
        
        for(int i = 0; i < 100;i++){
            //s += 1;
            s.append(i);
        }
        
        System.out.println(s);
    }
}