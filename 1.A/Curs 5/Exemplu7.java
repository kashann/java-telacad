public class Exemplu7{
    public static void main(String [] args){
        Masina masina = new Masina();
        Masina.motor motor = masina.new motor();
        
        motor.ruleaza();
        motor.ruleaza();
        motor.ruleaza();
        motor.ruleaza();
        motor.ruleaza();
        
        System.out.println(masina.x);
    }
}