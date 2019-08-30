public class Exemplu6{
    public static void main(String [] args){
        Forma2D f;
        f = new Cerc2D();
        
        Forma2D [] forme = new Forma2D[5];
        forme[0] = new Cerc2D();
        forme[1] = new Dreptunghi2D();
        
        forme[0].getArie();
        forme[1].getArie();
    }
}