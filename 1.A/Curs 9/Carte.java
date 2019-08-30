public class Carte extends Articol{
    String autor;
    
    public Carte(String titlu, String autor){
        this.titlu = titlu;
        this.autor = autor;
    }
    
    @Override
    public String toString(){
        return "Carte: " + titlu + " de " + autor;
    }
}