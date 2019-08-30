public class Exemplu7{
    
    public static void main(String [] args){
        //m1(10);
        m1(-10);
    }
    
    public static void m1(int x){
        
        if(x < 0){
            MyRuntimeException e = new MyRuntimeException();
            throw e;
        }
        
        System.out.println(x);
    }
    
    public static void m2(int x) throws MyCheckedException{  //throws propagam mai departe exceptiile
        
        if(x < 0){
            MyCheckedException e = new MyCheckedException();
            throw e; //throw semnalam semnalul de exceptii
        }
        
        System.out.println(x);
    }
}