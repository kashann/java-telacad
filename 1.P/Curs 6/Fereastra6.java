import javax.swing.*;
import java.awt.*;
import java.util.function.*;

public class Fereastra6 extends JFrame{
    private JButton [] b = new JButton[12];
    
    public Fereastra6(){
        setLayout(new GridLayout(4, 3));
        
        for(int i = 0; i < b.length; i++){
            b[i] = new JButton(i + 1 + " ");
            add(b[i]);
            int j = i + 1;
            b[i].addActionListener(ev -> afisareDialog(x -> x % 2 == 0, j));
        }
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void afisareDialog(Predicate<Integer> p, int x){
        if(p.test(x)){
            JOptionPane.showMessageDialog(this, "PAR");
        }else{
            JOptionPane.showMessageDialog(this, "IMPAR");
        }
    }
    
    public static void main(String [] args){
        new Fereastra6();
    }
}