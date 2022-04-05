import java.awt.*;
import javax.swing.*;

/**  
 * GridPanel.java 
 */


public class GridPanel extends JPanel{
    public GridPanel(){
        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JPanel panelThree = new JPanel();
        JPanel panelFour = new JPanel();
        JPanel panelFive = new JPanel();
        
        panelOne.setBackground(Color.red);
        panelTwo.setBackground(Color.yellow);
        panelThree.setBackground(Color.green);
        panelFour.setBackground(Color.orange);
        panelFive.setBackground(Color.cyan);
        
        setLayout(new GridLayout (5,1));
        add(panelOne);
        add(panelTwo);
        add(panelThree);
        add(panelFour); 
        add(panelFive);
        
        
        
        setPreferredSize(new Dimension(150,200));
        //set up panel colour and size
        setBackground(Color.blue);
        
    }
    public static void main(String[]args){
        JFrame window = new JFrame("Grid Panel");
        window.getContentPane().add(new GridPanel());
        window.setVisible(true);  
        window.pack();  
    }
}