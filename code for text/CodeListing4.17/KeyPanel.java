

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class KeyPanel extends JPanel{
    ImageIcon sausage = new ImageIcon("icons/sausage.gif");
    ImageIcon chips = new ImageIcon("icons/chips.gif");
    JLabel imageLabel = new JLabel(sausage);
    private ButtonListener listener = new ButtonListener();
    JButton chipsbutton = new JButton("chips");
    JButton sausagebutton = new JButton("sausage");
    
    
    public  KeyPanel(){
        sausagebutton.addActionListener(listener);
        chipsbutton.addActionListener(listener);
        add(chipsbutton);
        add(sausagebutton);
        add(imageLabel);
        setBackground(Color.yellow);
        setFocusable(true);
        requestFocus(); // in order to be able to listen for keypress
        addKeyListener(new KeyboardListener());  // keypress for any / all components
        setPreferredSize(new Dimension(200,120));
    } 
    
    
    /** event listener for buttons*/
    private class ButtonListener implements ActionListener{
        /** action listener for buttons*/
        public void actionPerformed (ActionEvent e){
            if(e.getSource()==chipsbutton){
                imageLabel.setIcon(chips);
            }
              if(e.getSource()==sausagebutton){
                imageLabel.setIcon(sausage);
            }  
            requestFocus(); // in order to be able to listen for keypress
        }
    }
    
    /** event listener for key press */
    private class KeyboardListener implements KeyListener{
        
        public void keyPressed(KeyEvent event){
            System.out.println("key");
            int key = event.getKeyCode();
            if (key == 's' || key == 83) { // s S
                imageLabel.setIcon(sausage);
            } else if (key == 67 || key == 99){ // c C
                imageLabel.setIcon(chips);
            }
        }
        public void keyReleased(KeyEvent event){}
        public void keyTyped(KeyEvent event){
        }
    }
        public static void main(String[]args){
        JFrame window = new JFrame("Key Panel");
        window.getContentPane().add(new KeyPanel());
        window.setVisible(true);  
        window.pack();  
    }
}//end class
