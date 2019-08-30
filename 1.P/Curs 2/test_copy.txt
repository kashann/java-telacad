import java.io.*;

public class Exemplu1{
    public static void main(String [] args){
        try{
            File file = new File("TEST1");
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}