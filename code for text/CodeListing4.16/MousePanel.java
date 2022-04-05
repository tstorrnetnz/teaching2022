import java.awt.*;
import java.awt.event.*; //note this needed for mouse events !!!!!!
import javax.swing.*;

public class MousePanel extends JPanel{
    
    private JLabel label = new JLabel("Mouse over here"); 
    
    public MousePanel(){
        MouseAware mouse = new MouseAware();
        label.addMouseListener( mouse);
        add(label);
        setPreferredSize(new Dimension(400,100));
        setBackground(Color.pink);    
    }
    
    private class MouseAware implements MouseListener{
        public void mouseExited(MouseEvent event){
            setBackground(Color.red);
        }
        public void mouseEntered(MouseEvent event){
            setBackground(Color.yellow);
        }
        public void mousePressed(MouseEvent event){ }
        public void mouseClicked(MouseEvent event){}
        public void mouseReleased(MouseEvent event){} //press & release = click
        
    }
    
    public static void main(String[]args){
        JFrame window = new JFrame("Mouse Panel");
        window.getContentPane().add(new MousePanel());
        window.setVisible(true);  
        window.pack();  
    }
}