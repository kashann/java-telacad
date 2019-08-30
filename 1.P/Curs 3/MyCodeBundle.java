import java.util.*;

public class MyCodeBundle extends ListResourceBundle{
    public Object[][] getContents(){
        Object [][] trans = {
            {"txtHello", "Hello"}
        };
        
        return trans;
    }
}