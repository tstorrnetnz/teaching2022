import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

/** Demonstrates the use of a JSlider to change a panel size*/
public class SliderPanel extends JPanel{
    
    private JSlider slider = new JSlider(JSlider.HORIZONTAL,20,100,50);
    private JLabel showSlider = new JLabel("50");
    private JPanel innerPanel = new JPanel();
    
    
    public SliderPanel(){
        JPanel upperPanel = new JPanel();
        upperPanel.setPreferredSize(new Dimension(230,50));
        upperPanel.setBackground(Color.green);
        // this FlowLayout justifies to the left (leading edge)
        // stops the components changing position when 100 is reached
        upperPanel.setLayout(new FlowLayout(FlowLayout.LEADING));

        SliderListener listener = new SliderListener();
        slider.setMajorTickSpacing(20);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        slider.addChangeListener(listener);
        setPreferredSize(new Dimension(230,220));
        
        upperPanel.add(slider);
        upperPanel.add(showSlider);
        innerPanel.setPreferredSize(new Dimension(50,50));
        innerPanel.setBackground(Color.red);
        add(upperPanel);
        add(innerPanel);
    }
    
    private class SliderListener implements ChangeListener{
        public void stateChanged(ChangeEvent e){
            int x = slider.getValue();
            showSlider.setText(Integer.toString(slider.getValue()));
            innerPanel.setPreferredSize(new Dimension(x,x));
        }
    }
    
    public static void main(String[]args){
        JFrame frame = new JFrame("Slider");
        frame.getContentPane().add(new SliderPanel());
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
