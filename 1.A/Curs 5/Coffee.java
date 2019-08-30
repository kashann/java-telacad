public enum Coffee{
    SMALL, MEDIUM(450), VENTI(700);
    
    private int qty;
    
    Coffee(){
    }
    
    Coffee(int qty){
    }
    
    public void afisareCantitate(){
        System.out.println(this.qty);
    }
}