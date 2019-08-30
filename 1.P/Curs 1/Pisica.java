public class Pisica implements java.io.Serializable{
    public static final long serialVersionUID = 1L; //L -> long MUST
    //am adaugat rasa si nu va mai functiona deserializarea
    //prin adaugarea serialVersionUID, nu mai crapa, vede clasa ca si cum ar fi ca inainte de adaugarea rasei
    
    String nume;
    String culoare;
    transient String rasa;
    
    public Pisica(String nume, String culoare, String rasa){
        this.nume = nume;
        this.culoare = culoare;
        this.rasa = rasa;
    }
}