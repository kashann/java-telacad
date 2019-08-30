public class Exemplu5{
    
    public static void main(String [] args){
        
        try{
            m(-10);
        }catch(ExceptieB b){
            System.out.println(b.getMessage());
        }catch(ExceptieA a){
            System.out.println(a.getMessage());
        }catch(Exception e){
            System.out.println("Eroare");
        }finally{
            System.out.println("Finally");
        }
    }
    
    public static void m(int x) throws ExceptieA{
        if(x < 0) throw new ExceptieB();
        System.out.println(x);
    }
}