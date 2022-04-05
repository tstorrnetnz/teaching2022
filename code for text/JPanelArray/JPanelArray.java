import java.awt.*;
import javax.swing.*;

/**  
 * Year 13, Chapter 4 Java, after Task 4 JPanelArray.java 
 */
public class JPanelArray extends JPanel{
    public JPanelArray(){
        setLayout(new GridLayout(5,1));
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
        setPreferredSize(new Dimension(150,150));
    }
    public static void main(String[]args){
        JFrame window = new JFrame("JPanelArray");
        window.getContentPane().add(new JPanelArray());
        window.setVisible(true);  
        window.pack(); 
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}