import java.io.*;

public class Exemplu1{
    public static void main(String [] args){
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
        ){
            String line = br.readLine();
            StringBuilder sb = new StringBuilder(line);
            sb.reverse();
            System.out.println(sb);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}