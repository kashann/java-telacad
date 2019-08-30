import java.io.*;

public class Exemplu2{
    public static void main(String [] args){


        try(
            FileInputStream fis = new FileInputStream("Exemplu1.java");
            InputStreamReader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
        ){
            String line;
            
            while((line = br.readLine()) != null){
                System.out.println(line);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}