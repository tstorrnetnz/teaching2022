import java.awt.*;
import javax.swing.*;

/**  
 * GridPanel.java 
 */


public class GridPanel extends JPanel{
    public GridPanel(){
        setLayout(new GridLayout (5,1));
        JPanel [] panels = new JPanel[5]; 
        for(int i = 0; i < panels.length; i++){    
            panels[i] = new JPanel();    
            if(i%2==0){   
                panels[i].setBackground(Color.yellow);    
            } else {   
                panels[i].setBackground(Color.red);    
            }   
            add(panels[i]);   
        } 
        
        
        
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