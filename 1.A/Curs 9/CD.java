public class CD extends Articol{
    String artist;
    
    public CD(String titlu, String artist){
        this.titlu = titlu;
        this.artist = artist;
    }
    
    @Override
    public String toString(){
        return "CD: " + titlu + " - " + artist;
    }
}