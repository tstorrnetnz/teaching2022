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
//        JLabel headerB = new JLabel("BUTTONS");   
//        JLabel headerT = new JLabel("TEXT FIELDS");  
//        panelOne.add(headerB);  
//        panelTwo.add(headerT); 
//        JButton buttonOne = new JButton("first"); 
//        JButton buttonTwo = new JButton("second"); 
        //panelOne.add(buttonOne); 
        //panelOne.add(buttonTwo); 
//        JButton [] buttonArray = new JButton[5]; 
//        for(int i=0; i < buttonArray.length; i++){  
//            buttonArray[i] = new JButton(Integer.toString(i));  
//            panelOne.add (buttonArray[i]);  
//        } 
//        JButton [] buttonArray =  {new JButton("one"), 
//            new JButton("two"),   new JButton("three"), 
//            new JButton("four"), new JButton("five")};
//        for(JButton eachButton:buttonArray){
//            panelOne.add(eachButton);
//        }
        add(panelOne);
        add(panelTwo);
        
        
        
        
        //set up panel colour and size
        setBackground(Color.blue);
        
    }
    public static void main(String[]args){
        JFrame window = new JFrame("A window");
        window.getContentPane().add(new OuterPanel());
        window.setVisible(true);  
        window.pack();  
        
    }
}