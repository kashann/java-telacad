import javax.swing.*;
import java.awt.*;

public class Fereastra5 extends JFrame{
    
    private JPanel southPanel;
    private JPanel mainPanel;
    private JButton b1, b2, b3;
    
    public Fereastra5(){
        southPanel = new JPanel();
        mainPanel = new JPanel();
        
        b1 = new JButton("RED");
        b2 = new JButton("GREEN");
        b3 = new JButton("BLUE");
        
        add(mainPanel);
        add(southPanel, BorderLayout.SOUTH);
        southPanel.add(b1);
        southPanel.add(b2);
        southPanel.add(b3);
        
        b1.addActionListener(ev -> mainPanel.setBackground(Color.RED));
        b2.addActionListener(ev -> mainPanel.setBackground(Color.GREEN));
        b3.addActionListener(ev -> mainPanel.setBackground(Color.BLUE));
        
        setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String [] args){
        new Fereastra5();
    }
}