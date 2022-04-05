import java.awt.*;
import javax.swing.*;
import java.awt.event.*; // step 1

/** code listing 4.11 */ 
public class QuizEventP extends JPanel{
    
    private JTextField answerField; 
    private JButton submitButton;
    private JButton clearButton;
    private JLabel question;
    private String correctAnswer = "nile";
    JLabel correctLabel = new JLabel("");
    
    public QuizEventP(){
        EventListener listener = new EventListener(); // step 3
        
        answerField = new JTextField("",13); 
        question = new JLabel("This river is an anagram of \"line\""); 
        submitButton = new JButton("submit");
        submitButton.addActionListener(listener); // step 4
        clearButton = new JButton("clear");
        clearButton.addActionListener(listener); // step 4
        
        add(question); 
        add(answerField);
        add(submitButton);
        add(clearButton);
        add(correctLabel);
        
        //set up outer panel colour and size
        setPreferredSize(new Dimension(400,100));
        setBackground(Color.pink);          
    }
    // step 2 write an inner class
    private class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            if (e.getSource() == submitButton){
                if(answerField.getText().toLowerCase().equals(correctAnswer)){
                    correctLabel.setText("W E L L   D O N E - your answer is correct!");
                } else{
                    correctLabel.setText("  T R Y   A G A I N  - your answer is not correct");
                }
            } else if (e.getSource() == clearButton){
                answerField.setText("");
                correctLabel.setText("");
            }
        }
    }
    public static void main(String[]args){
        JFrame window = new JFrame("Quiz Event");
        window.getContentPane().add(new QuizEventP());
        window.setVisible(true);  
        window.pack();  
    }
}