import javax.swing.*;
import java.awt.*;

public class Fereastra3 extends JFrame{
    private JButton b1, b2, b3, b4, b5;
    
    public Fereastra3(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        b1 = new JButton("BUTTON 1");
        b2 = new JButton("BUTTON 2");
        b3 = new JButton("BUTTON 3");
        b4 = new JButton("BUTTON 4");
        b5 = new JButton("BUTTON 5");
        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args){
        new Fereastra3();
    }
}