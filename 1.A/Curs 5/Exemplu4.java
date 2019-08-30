public class Exemplu4{
    public static void main(String [] args){
        Anotimp a1 = Anotimp.VARA;
        
        switch(a1){
            case VARA:
                System.out.println("Este cald");
                break;
            case IARNA:
                System.out.println("Este frig");
                break;
            case TOAMNA:
            case PRIMAVARA:
                System.out.println("Ploua");
        }
        
        for(Anotimp x : Anotimp.values()){
            System.out.println(x + " " + x.ordinal());
        }
    }
}