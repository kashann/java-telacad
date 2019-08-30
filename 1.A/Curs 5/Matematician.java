public class Matematician{
    
    String nume;
    
    public Matematician(String nume){
        this.nume = nume;
    }
    
    public void calculeazaArie(Forma2D forma){
        System.out.println(forma.getArie());
    }
    
}