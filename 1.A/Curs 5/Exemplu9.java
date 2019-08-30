public class Exemplu9{
    public static void main(String [] args){
        Instrument i = new Instrument(){
            public void play(){
                System.out.println("LALALA");
                altaMetoda();
            }
            
            public void altaMetoda(){
            }
        };
        
        Personaj p = new Personaj(){
        };
        
        Instrument i2 = new Instrument(){
            public void play(){
                metodaCareImplementeaza();
            }
        };
        
        Instrument i3 = () -> metodaCareImplementeaza();
        
    }
    
    public static void metodaCareImplementeaza(){
    }
}