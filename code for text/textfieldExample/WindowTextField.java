import java.awt.*;
import javax.swing.*;
import java.util.Scanner;
import java.awt.event.*;

public class WindowTextField{
    public static void main(String[]args){
        JFrame window = new JFrame("Fields");
        window.getContentPane().add(new OuterPanel1());
        window.setVisible(true);  
        window.pack();  
    }
}
/**  
 * OuterPanel.java 
 */

class OuterPanel1 extends JPanel{
    public OuterPanel1(){
       setLayout(new BoxLayout(this,BoxLayout.Y_AXIS));
        setBackground(Color.red);
        setPreferredSize(new Dimension(200,200));
       JTextField tf1 = new JTextField("just right");
        JTextField tf2 = new JTextField(); 
        JTextField tf3 = new JTextField("just right",4); 

        JTextField tf4 = new JTextField(4);  
JButton b1 = new JButton("one");
JButton b2 = new JButton("two");
        
        //add(tf1);
       // add(tf2);
       // add(Box.createVerticalGlue());
        add(Box.createRigidArea(new Dimension(0,20))); //creates 20 px vertical 
        //add(tf3);
        add(b1);
        //add(tf4);
        add(b2);

        
    }
}