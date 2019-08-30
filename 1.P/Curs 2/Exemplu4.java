import java.util.*;
import java.io.*;

public class Exemplu4{
    
    public static void main (String [] args){
        try(
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
        ){
            Scanner s = new Scanner(System.in);
            String cmd = null;
            
            while(true){
                 System.out.print("Comanda: ");
                 cmd = s.nextLine();
                 String [] v = cmd.split("\\s+");
            
                switch(v[0]){
                    case "exit":
                    System.out.println("Bye bye!");
                    return;
                    case "cf": { //create file
                        File file = new File(v[1]);
                        file.createNewFile();
                        System.out.println("A fost creat fisierul");
                    } break;
                    case "md": { //make directory
                        File file = new File(v[1]);
                        file.mkdir();
                        System.out.println("A fost creat folderul");
                    } break;
                    case "del": {
                        File file = new File(v[1]);
                        file.delete();
                        System.out.println("Fisierul a fost sters");
                    } break;
                    case "list": {
                        File file = new File(v[1]);
                        Arrays.asList(file.list()).forEach(System.out::println);
                    } break;
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}