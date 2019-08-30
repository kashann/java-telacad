import java.util.*;

public class Registry1{
    private static Map<String, Registry1> registry = new HashMap<>();
    
    private Registry1(){   
    }
    
    public static Registry1 getInstance(RegistryValues type){
        Registry1 obj =  registry.get(type);
        if(obj == null){
            synchronized(Registry1.class){
                if(obj == null){
                    obj = new Registry1();
                    registry.put(type, obj);
                }
            }
        }
        
        return obj;
    }
    
    public static enum RegistryValues{
        VAL1, VAL2, VAL3
    }
}