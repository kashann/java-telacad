public class Exemplu2{
    
    public static void main(String [] args){
        int x = m();
        System.out.println(x);
    }
    
    public static int m(){
        try{
            return 10/5;
        }finally{
            System.out.println("Finally");
            return 5;
        }
        
    }
}