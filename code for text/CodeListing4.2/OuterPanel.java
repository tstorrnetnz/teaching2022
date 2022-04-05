import java.awt.*;
import javax.swing.*;

/**  
 * OuterPanel.java 
 */


public class OuterPanel extends JPanel{
    
    public OuterPanel(){
        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        
        
        panelOne.setBackground(Color.red);
        panelTwo.setBackground(Color.yellow);
        panelOne.setPreferredSize(new Dimension(110,250));
        panelTwo.setPreferredSize(new Dimension(200,250));

        add(panelOne);
        add(panelTwo);
        
        
        
        
        //set up panel colour and size
        setBackground(Color.blue);
        
    }
   
}