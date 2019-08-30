public class ComandaCompletaException extends RuntimeException{
    
    public ComandaCompletaException(){
        super("Comanda este deja completa!");
    }
}