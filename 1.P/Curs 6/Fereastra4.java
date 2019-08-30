import javax.swing.*;
import java.awt.*;

public class Fereastra4 extends JFrame{
    private JButton b1, b2, b3, b4, b5;
    
    public Fereastra4(){
        b1 = new JButton("1 - NORTH");
        b2 = new JButton("2 - SOUTH");
        b3 = new JButton("3 - EAST");
        b4 = new JButton("4 - WEST");
        b5 = new JButton("5 - CENTER");
        
        add(b1, BorderLayout.NORTH);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.EAST);
        add(b4, BorderLayout.WEST);
        add(b5); //CENTER implicit
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args){
        new Fereastra4();
    }
}