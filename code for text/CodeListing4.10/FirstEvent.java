import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // step 1

/** a simple event driven GUI */
public class FirstEvent extends JPanel{
    
    private JButton redButton;
    private JButton greenButton;

    
    public FirstEvent(){
       EventListener listener = new EventListener(); // step 3
        
        redButton = new JButton("red");
        redButton.addActionListener(listener); // step 4
        greenButton = new JButton("green");
        greenButton.addActionListener(listener); // step 4
        
        add(redButton);
        add(greenButton);   
        
        //set up outer panel colour and size
        setPreferredSize(new Dimension(400,100));
        setBackground(Color.pink);          
    }
    // step 2 write an inner class
    private class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == redButton){
                setBackground(Color.red);
            } else if (e.getSource() == greenButton){
                setBackground(Color.green);
            }
        }
    }
    public static void main(String[]args){
        JFrame window = new JFrame("First Event");
        window.getContentPane().add(new FirstEvent());
        window.setVisible(true);  
        window.pack();  
    }
}