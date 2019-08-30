public class Exemplu10{
    public static void main(String [] args){
        Pisica p1; //declarare
        p1 = new Pisica(); //new pisica () --> instantiere // nu merge fiinca ii trebuie parametrii
        
        Pisica p2 = new Pisica(); //initializare
        
        p1.nume = "Tom";
        p2.nume = "Leo";
        
        System.out.println(p1.nume+" "+p2.nume);
    }
}