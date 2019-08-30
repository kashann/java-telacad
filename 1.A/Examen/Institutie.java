import java.util.*;

public class Institutie{
    private static Institutie SINGLETON;
    private ArrayList <Curs> cursuri = new ArrayList <>(30);
    
    private Institutie(){}
    
    public static Institutie getInstance(){
        if(SINGLETON == null){
            SINGLETON = new Institutie();
        } 
        return SINGLETON;
    }
    
    public void adaugaCurs(Curs c){
        cursuri.add(c);
    }
    
    public void afiseazaCursuri(){
        cursuri.stream().forEach(System.out::println);
    }
    
    public void afiseazaCursuriProgramare(){
        cursuri.stream().filter(c -> c instanceof Programare).forEach(System.out::println);
    }
    
    public void afiseazaCursuriLimbiStraine(){
        cursuri.stream().filter(c -> c instanceof LimbiStraine).forEach(System.out::println);
    }
   
    public void stergeCurs(int id){
        for(int i = 0; i < cursuri.size(); i++){
            if(cursuri.get(i).id == id){
                cursuri.remove(i);
                i--;
                Curs.noCursuri--;
            }
        }
    }
    
}