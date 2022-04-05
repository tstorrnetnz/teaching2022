import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

/**  
 * SherlockPanel.java 
 */


public class SherlockPanel extends JPanel{  
    
    JTextField number; 
    JTextField street; 
    JTextField suburb; 
    JTextField town; 
    JTextField firstName; 
    JTextField secondName;
    JButton buttonOne;
    JButton buttonTwo;
    ImageIcon sherlock = new ImageIcon("icons/sherlock.gif");
    JLabel imageLabel = new JLabel(sherlock);
    
    public SherlockPanel(){
        JPanel panelOne = new JPanel();
        JPanel panelTwo = new JPanel();
        JLabel headerB = new JLabel("BUTTONS"); 
        JLabel headerT = new JLabel("TENANT LISTING"); 
        number = new JTextField("221B",5); 
        street = new JTextField("Baker St",10); 
        suburb = new JTextField("Marylebone",10); 
        town = new JTextField("London",10); 
        firstName = new JTextField("Sherlock",10); 
        secondName = new JTextField("Holmes",10); 
        buttonOne = new JButton("first");
        buttonTwo = new JButton("second");
        
        panelOne.setPreferredSize(new Dimension(110,250)); 
        panelTwo.setPreferredSize(new Dimension(200,250));
        
        panelOne.setBackground(Color.red);
        panelTwo.setBackground(Color.yellow);
        
        panelOne.add(headerB);
        panelOne.add(buttonOne);
        panelOne.add(buttonTwo);
        panelTwo.add(headerT);
        panelTwo.add(firstName);
        panelTwo.add(secondName);
        panelTwo.add(number);
        panelTwo.add(street);
        panelTwo.add(suburb);
        panelTwo.add(town);
        panelTwo.add(imageLabel);
        
        add(panelOne);
        add(panelTwo);
        
        //set up outer panel colour 
        setBackground(Color.blue); 
        driver();
    }
    /** sequence of tasks for this program*/
    public void driver(){
        showData();
        changeTenant();
        showData(); 
    }
     /** change the text on the name fields and the icon on the label */
    public void changeTenant(){
        ImageIcon john = new ImageIcon("icons/regInsignia.gif");
        firstName.setText("John");
        secondName.setText("Watson");
        imageLabel.setIcon(john);
    }
    /** text display of information held by GUI components */
    public void showData(){
        System.out.print(number.getText() + " ");
        System.out.println(street.getText());
        System.out.println(suburb.getText());
        System.out.println( town.getText());
        System.out.print(firstName.getText() + " ");
        System.out.println( secondName.getText());
        System.out.println("*******************");
    }
    
    
    
    
    public static void main(String[]args){
        JFrame window = new JFrame("Baker St");
        window.getContentPane().add(new SherlockPanel());
        window.setVisible(true);  
        window.pack();  
    }
}