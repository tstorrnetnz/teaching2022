import java.awt.*;
import javax.swing.*;

public class FieldPanel extends JPanel{
    public FieldPanel(){
        setLayout(new BorderLayout());
        JPanel goalW = new JPanel();
        JPanel goalE = new JPanel();
        JPanel midFieldC = new JPanel();
        JPanel sideN = new JPanel();
        JPanel sideS = new JPanel();
        //goal West (left)
        goalW.setPreferredSize(new Dimension(50,100));
        goalW.setBackground(Color.green);
        goalW.setLayout(new BorderLayout());
        
        JPanel leftGoalW = new JPanel();
        JPanel leftGoalN = new JPanel();
        JPanel leftGoalS = new JPanel();
        
        leftGoalW.setBackground(Color.black);
        leftGoalW.setPreferredSize(new Dimension(10,5));
        leftGoalN.setBackground(Color.green);
        leftGoalN.setPreferredSize(new Dimension(50,40));
        leftGoalS.setBackground(Color.green);
        leftGoalS.setPreferredSize(new Dimension(50,40));
        
        goalW.add(leftGoalW,BorderLayout.WEST); 
        goalW.add(leftGoalN,BorderLayout.NORTH);
        goalW.add(leftGoalS,BorderLayout.SOUTH);
        // goal East (right)
        goalE.setPreferredSize(new Dimension(50,100));
        goalE.setBackground(Color.green);
        // midfield
        midFieldC.setBackground(Color.cyan);
        // North side
        sideN.setPreferredSize(new Dimension(200,50));
        sideN.setBackground(Color.white);
        // South side
        sideS.setPreferredSize(new Dimension(200,50));
        sideS.setBackground(Color.white);
        
        add(sideN,BorderLayout.NORTH);
        add(goalW,BorderLayout.WEST); // west of OuterPanel layout
        add(midFieldC,BorderLayout.CENTER);
        add(goalE,BorderLayout.EAST);
        add(sideS,BorderLayout.SOUTH);
    }
    public static void main(String[]args){
        JFrame window = new JFrame("Playing Field"); 
        window.getContentPane().add(new FieldPanel());
        window.setVisible(true);
        window.pack();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
