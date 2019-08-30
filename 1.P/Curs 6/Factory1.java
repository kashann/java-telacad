public final class Factory1{
    
    private Factory1(){}
    
    public static FactoryObject getInstance(FactoryType type){
        switch(type){
            case TYPE1:
                return null;
            case TYPE2:
                return null;
            case TYPE3:
                return null;
        }
        throw new RuntimeException();
    }
    
    private static class FactoryType1 implements FactoryObject{
        public void m1(){
            System.out.println("TYPE 1");
        }
    }
    
    private static class FactoryType2 implements FactoryObject{
        public void m1(){
            System.out.println("TYPE 2");
        }
    }
    
    private static class FactoryType3 implements FactoryObject{
        public void m1(){
            System.out.println("TYPE 3");
        }
    }
    
    public static enum FactoryType{
        TYPE1, TYPE2, TYPE3
    }
}