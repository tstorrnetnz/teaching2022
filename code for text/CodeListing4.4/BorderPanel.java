import java.awt.*; 
import javax.swing.*; 
/**    * BorderPanel.java with BorderLayout  */ 
public class BorderPanel extends JPanel{  
    public BorderPanel(){   
        JPanel panelOne = new JPanel();   
        JPanel panelTwo = new JPanel();   
        JPanel panelThree = new JPanel();   
        JPanel panelFour = new JPanel();   
        JPanel panelFive = new JPanel();     
        panelOne.setPreferredSize(new Dimension(250,25));   
        panelTwo.setPreferredSize(new Dimension(30,150));   
        panelFour.setPreferredSize(new Dimension(80,150));   
        panelFive.setPreferredSize(new Dimension(250,100));    
        panelOne.setBackground(Color.red);   
        panelTwo.setBackground(Color.yellow);   
        panelThree.setBackground(Color.green);   
        panelFour.setBackground(Color.pink);   
        panelFive.setBackground(Color.cyan);    
        setLayout(new BorderLayout ());    
        add(panelOne, BorderLayout.NORTH);   
        add(panelTwo, BorderLayout.WEST);   
        add(panelThree, BorderLayout.CENTER);   
        add(panelFour, BorderLayout.EAST);    
        add(panelFive, BorderLayout.SOUTH);           
//set up outer panel colour    
        setBackground(Color.blue);  
    } 
        public static void main(String[]args){
        JFrame window = new JFrame("Border Layout");
        window.getContentPane().add(new BorderPanel());
        window.setVisible(true);  
        window.pack(); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 