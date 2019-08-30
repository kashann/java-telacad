public class Exemplu8{
    public static void main(String [] args){
        
        Angajat a1 = new Angajat(1000, 7);
        Angajat a2 = new Angajat(1000, 3);
        Angajat gigel = new Angajat(1000, 1);{
            
            @Override
            public double getSalariu(){
                return 5000;
            }
            
        };
        
        System.out.println(a1.getSalariu());
        System.out.println(a2.getSalariu());
        System.out.println(gigel.getSalariu());
    }
}