public class Exemplu2{
    
    public static void main(String [] args){
        FactoryObject o1 = Factory1.getInstance(Factory1.FactoryType.TYPE1);
        
        FactoryObject o2 = Factory1.getInstance(Factory1.FactoryType.TYPE2);
        
        FactoryObject o3 = Factory1.getInstance(Factory1.FactoryType.TYPE3);
        
        o1.m1();
        o2.m1();
        o3.m1();
    }
}