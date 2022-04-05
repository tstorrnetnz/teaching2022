import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class SliderExamplesPanel extends JPanel{

    private JSlider slider1;
    private JSlider slider2;

    public SliderExamplesPanel(){
        SliderListener listener = new SliderListener();
        slider1 = new JSlider(JSlider.HORIZONTAL,30,50,40);
        slider1.setMajorTickSpacing(5);
        slider1.setPaintTicks(true);
        slider1.setPaintLabels(true);
        slider1.addChangeListener(listener);
        
        slider2 = new JSlider(JSlider.VERTICAL,0,100,0);
        slider2.setMajorTickSpacing(10);
        slider2.setMinorTickSpacing(5);
        slider2.setPaintTicks(true);
        slider2.setPaintLabels(true);
        slider2.addChangeListener(listener);
        
        add(slider1);
        add(slider2);

        setPreferredSize(new Dimension(280,210));
    }
    
    private class SliderListener implements ChangeListener{
        public void stateChanged(ChangeEvent e){   
        }
    }
    
    public static void main(String[]args){
        JFrame frame = new JFrame("SliderExamplesPanel");
        frame.getContentPane().add(new SliderExamplesPanel());
        frame.setVisible(true);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
