import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** Uses JRadioButton selection to change font colour, font face, style and size  */
public class FirstRadio extends JPanel{
    
    private JRadioButton bigButton;
    private JRadioButton medButton;
    private JRadioButton smallButton;
    private JLabel importantString;
    private JPanel buttonPanel;
    private JPanel spacer;
    
    public FirstRadio(){
        ChangeListener listener = new ChangeListener();
        setLayout(new BorderLayout());
        ButtonGroup sizeGroup = new ButtonGroup();
        buttonPanel = new JPanel();
        spacer = new JPanel();
        spacer.setPreferredSize(new Dimension(50,50));
        spacer.setBackground(Color.white);
        buttonPanel.setPreferredSize(new Dimension(500,50));
        importantString = new JLabel("Very Important Text");
        
        bigButton = new JRadioButton("big");
        bigButton.addActionListener(listener);
        smallButton = new JRadioButton("small");
        smallButton.addActionListener(listener);
        medButton = new JRadioButton("medium");
        medButton.addActionListener(listener);
        smallButton.setSelected(true);
        sizeGroup.add(bigButton);
        sizeGroup.add(medButton);
        sizeGroup.add(smallButton);
        buttonPanel.add(bigButton);
        buttonPanel.add(medButton);   
        buttonPanel.add(smallButton);
        add(buttonPanel,BorderLayout.NORTH);
        add(spacer,BorderLayout.WEST);
        add(importantString,BorderLayout.CENTER);
        setBackground(Color.white);          
    }
    
    private class ChangeListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Font lfont; 
            if (bigButton.isSelected()){
                lfont = new Font("Serif",Font.ITALIC|Font.BOLD,50);
                importantString.setFont(lfont);
                importantString.setForeground(Color.red);
            } else if (medButton.isSelected()){
                lfont = new Font("Sansserif",Font.BOLD,24);
                importantString.setFont(lfont); 
                importantString.setForeground(Color.blue);
            }else if (smallButton.isSelected()){
                lfont = new Font("Monospaced",Font.PLAIN,8);
                importantString.setFont(lfont);
                importantString.setForeground(Color.black);
            }
        }
    }
    public static void main(String[]args){
        JFrame window = new JFrame("First JRadioButton");
        window.getContentPane().add(new FirstRadio());
        window.setVisible(true);  
        window.pack();  
    }
}