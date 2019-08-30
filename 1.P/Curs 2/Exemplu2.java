import java.io.*;

public class Exemplu2{
    public static void main(String [] args){
        try{
            File file = new File("DIR1");
            file.mkdir();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}