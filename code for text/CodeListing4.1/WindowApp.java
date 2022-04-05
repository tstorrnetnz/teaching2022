

import javax.swing.JFrame;


public class WindowApp{
    public static void main(String[]args){
        JFrame window = new JFrame("A window");
        window.getContentPane().add(new OuterPanel());
        window.setVisible(true);  
        window.pack();  
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}