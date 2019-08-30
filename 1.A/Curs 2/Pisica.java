public class Pisica{
    String nume;
    String culoare;
    int varsta;
    
    Pisica(){
        this("Leo", "alb", 2); //this cu () neaparat prima instructiune
    }
    
    Pisica(String nume, String culoare, int varsta){
        //System.out.println("A fost creeata o Pisica!");
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    
    void spuneMiau(){
        System.out.println("Miau! Numele meu este "+this.nume);
    }
}