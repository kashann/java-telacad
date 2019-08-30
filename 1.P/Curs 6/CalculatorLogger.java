import java.time.*;

public class CalculatorLogger implements Calculator{
    private Calculator calculator;
    
    public CalculatorLogger(Calculator calculator){
        this.calculator = calculator;
    }
    
    public int suma(int a, int b){
        System.out.println("Timp apel: " + LocalDateTime.now());
        System.out.println("A fost apelata suma cu parametrii " + a + " & " + b);
        int rez = calculator.suma(a,b);
        System.out.println("Timp rezultat: " + LocalDateTime.now());
        System.out.println("Rezultat: " + rez);
        return rez;
    }
}