public class Exemplu5{
    public static void main(String [] args){
        Punct p1 = new Punct(0,0);
        Punct p2 = new Cerc();
        Punct p3 = new Cilindru(10, 10, 10, 10);
        Cerc c1 = new Cilindru(10, 10, 10, 10);         // POLIMORFISM
        Punct p4 = new Dreptunghi();
        
        p3.x = 10;
        p3.y = 20;
        //p3.raza = 30;
        
        System.out.println(c1.getArie());
        
        c1.w = 10;
        
        Cilindru cil1 = (Cilindru) c1;
        if(p2 instanceof Cerc) {
            Cerc c2 = (Cerc) p2;
        }
        //Cerc c3 = (Cerc) p4;    NU MERGE --> ClassCastException
        //Dreptunghi d1 = (Dreptunghi) c1;    ORIZONTALA NU MERGE
        
    }
}