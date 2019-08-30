import javax.swing.*;
import java.awt.*;

public class Fereastra2 extends JFrame{
    int x = 0;
    private JButton b;
    
    public Fereastra2(){
        setTitle("Kashi Window 2");
        setLayout(new FlowLayout());
        
        b = new JButton(x + "");
        add(b);
        b.addActionListener(ev -> increment());
        //mouse events la prof
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void increment(){
        x++;
        b.setText(x + "");
    }
}