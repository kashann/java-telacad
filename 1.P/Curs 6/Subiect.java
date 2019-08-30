import java.util.*;

public class Subiect{
    
    private List<MyListener> listeners = new ArrayList<>();
    
    public void subiectModificat(){
        //bla bla
        notifyAllListeners();
    }
    
    public void addMyListener(MyListener myListener){
        listeners.add(myListener);
    }
    
    public void removeMyListnere(MyListener myListener){
        listeners.remove(myListener);
    }
    
    private void notifyAllListeners(){
        listeners.forEach(a -> a.eventAppeared());
    }
}