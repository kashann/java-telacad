import java.io.*;

public class CitestePisica{
    
    public static void main(String [] args){
        try(
            FileInputStream fis = new FileInputStream("pisica.bin");
            ObjectInputStream in = new ObjectInputStream(fis);
        ){
            Pisica p = (Pisica) in.readObject();
            System.out.println(p.nume + " " + p.culoare);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}