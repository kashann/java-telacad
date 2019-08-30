import java.io.*;

public class ScriePisica{
    public static void main(String [] args){
        try(
            FileOutputStream fos = new FileOutputStream("pisica.bin");
            ObjectOutputStream out = new ObjectOutputStream(fos);
        ){
            Pisica p = new Pisica("Tom", "negru");
            out.writeObject(p);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}