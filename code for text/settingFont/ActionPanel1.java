import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;


public class ActionPanel1 extends JPanel{
    public static void main (String[]args){
        JFrame frame = new JFrame("Action!");
        frame.getContentPane().add(new ActionPanel1());
        frame.pack();
        frame.setVisible(true);
    }
    public ActionPanel1(){
        setBackground(Color.pink);
        setPreferredSize(new Dimension(200,400));
        JTextField tf = new JTextField("Kermit");
        tf.setFont(new Font("Helvetica",Font.PLAIN,73));
        
        tf.setForeground(Color.green);
        add(tf);
        JLabel label = new JLabel("show me");
        label.setForeground(Color.red);
        label.setFont(new Font("Serif",Font.ITALIC|Font.BOLD,24));
        add(label);
        JButton button = new JButton("press me");
        button.setForeground(Color.cyan);
        button.setFont(new Font("Helvetica",Font.BOLD|Font.ITALIC,16));
        add(button);
    }
    
}
