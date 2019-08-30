public class Builder1{
    
    private int a1;
    private int a2;
    private String a3;
    private boolean a4;
    private int a5;
    private String a6;
    
    private Builder1(){
    }
    
    public static class Builder{
        private Builder1 instance = new Builder1();
        
        public Builder setA1(int a1){
            instance.a1 = a1;
            return this;
        }
        
        public Builder setA2(int a2){
            instance.a2 = a2;
            return this;
        }
        
        public Builder setA3(String a3){
            instance.a3 = a3;
            return this;
        }
        
        public Builder setA4(boolean a4){
            instance.a4 = a4;
            return this;
        }
        
        public Builder setA5(int a5){
            instance.a5 = a5;
            return this;
        }
        
        public Builder setA6(String a6){
            instance.a6 = a6;
            return this;
        }
        
        public Builder1 build(){
            return instance;
        }
    }
}