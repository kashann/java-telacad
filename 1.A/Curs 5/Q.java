public enum Q{
    A{
        public void m(){
            System.out.println("A");
        }
    }, B{
        public void m(){
            System.out.println("B");
        }
    }, C{
        public void m(){
            System.out.println("C");
        }
    };
    
    public abstract void m();
}