import javax.swing.*;
import java.awt.*;

public class Fereastra1 extends JFrame{
    
    private JButton btnHello;
    
    public Fereastra1(){
        setTitle("Kashi Window");
        setLayout(new FlowLayout());
        
        btnHello = new JButton("Hello");
        add(btnHello);
        btnHello.addActionListener(ev -> schimbareTextButon());
        
        setSize(500,500);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    private void schimbareTextButon(){
        if(btnHello.getText().equals("Hello")){
            btnHello.setText("World");
        }else{
            btnHello.setText("Hello");
        }
    }
}