import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/** Uses JCheckboxes to change ImageIcons showing on JLabels */
public class FirstCheckBox extends JPanel{
    
    private JCheckBox eleBox;
    private JCheckBox crocBox;
    private JCheckBox horseBox;
    private JPanel checkBoxPanel;
    private JPanel panelW, panelE, panelC;
    private ImageIcon elephant = new ImageIcon("icons/elephantOn.gif");    
    private ImageIcon noelephant = new ImageIcon("icons/elephantOff.gif");
    private JLabel eleLabel = new JLabel(noelephant);
    
    private ImageIcon crocodile = new ImageIcon("icons/crocOn.gif");
    private ImageIcon nocrocodile = new ImageIcon("icons/crocOff.gif");
    private JLabel crocLabel = new JLabel(nocrocodile);
    
    private ImageIcon horse = new ImageIcon("icons/horseOn.gif");
    private ImageIcon nohorse = new ImageIcon("icons/horseOff.gif");
    private JLabel horseLabel = new JLabel(nohorse);
    
    
  /** constructor */  
    public FirstCheckBox(){
        EventListener listener = new EventListener();
        setLayout(new BorderLayout());
        
        checkBoxPanel = new JPanel();
        panelW = new JPanel();
        panelW.setPreferredSize(new Dimension(180,70));
        panelW.setBackground(Color.white);
        panelE = new JPanel();
        panelE.setPreferredSize(new Dimension(180,70));
        panelE.setBackground(Color.white);
        panelC = new JPanel();
        panelC.setBackground(Color.white);
        checkBoxPanel.setPreferredSize(new Dimension(500,50));
        
        
        eleBox = new JCheckBox("Elephant");
        eleBox.addItemListener(listener);
        horseBox = new JCheckBox("Horse");
        horseBox.addItemListener(listener);
        crocBox = new JCheckBox("Crocodile");
        crocBox.addItemListener(listener);
        eleBox.setSelected(true);
        horseBox.setSelected(true);
        
        panelW.add(eleLabel);
        panelC.add(crocLabel);
        panelE.add(horseLabel);
        checkBoxPanel.add(eleBox);
        checkBoxPanel.add(crocBox);   
        checkBoxPanel.add(horseBox);
        add(checkBoxPanel,BorderLayout.NORTH);
        add(panelC,BorderLayout.CENTER);
        add(panelW,BorderLayout.WEST);
        add(panelE,BorderLayout.EAST);
            
    }
    /** inner listener class */
    private class EventListener implements ItemListener{
        public void itemStateChanged(ItemEvent e){
            
            if (eleBox.isSelected()){
                eleLabel.setIcon(elephant);
            } else{
                eleLabel.setIcon(noelephant);
            } 
            if (crocBox.isSelected()){
                crocLabel.setVisible(true);
                crocLabel.setIcon(crocodile);
            }else{
                //crocLabel.setIcon(nocrocodile); 
                crocLabel.setVisible(false);
            }
            if (horseBox.isSelected()){
                horseLabel.setIcon(horse);
            }else{
                horseLabel.setIcon(nohorse);         
            }
        } 
    }
    
    public static void main(String[]args){
        JFrame window = new JFrame("First Check Box");
        window.getContentPane().add(new FirstCheckBox());
        window.setVisible(true);  
        window.pack();  
    }
}