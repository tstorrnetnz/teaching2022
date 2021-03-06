/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author trevor
 */
public class SportsDayGUI extends javax.swing.JPanel {

    /**
     * Creates new form SportsDayGUI
     */
    public SportsDayGUI() {
        initComponents();
        EventListener listener = new EventListener();
        EventListener listenera = new EventListener();
        EventListener listenerb = new EventListener();
        saveEventButton.addActionListener(listener);
        selectResultsEvent.addActionListener(listenerb);
        viewResultsButton.addActionListener(listenerb);
        selectEvent.addActionListener(listenera);
        saveResultButton.addActionListener(listenera); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        viewResultsButton = new javax.swing.JButton();
        selectResultsEvent = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        ages = new javax.swing.JComboBox<>();
        gender = new javax.swing.JComboBox<>();
        unit = new javax.swing.JComboBox<>();
        saveEventButton = new javax.swing.JButton();
        eventTitle = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        competitorLastName = new javax.swing.JTextField();
        competitorFirstName = new javax.swing.JTextField();
        selectEvent = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        metresLabel = new javax.swing.JLabel();
        minsLabel = new javax.swing.JLabel();
        cmLabel = new javax.swing.JLabel();
        secsLabel = new javax.swing.JLabel();
        mmLabel = new javax.swing.JLabel();
        msecsLabel = new javax.swing.JLabel();
        resultField1 = new SpinnerNumberModel(spinnerValue,spinnerMin,spinnerMax,spinnerInterval);
        spinner1 = new javax.swing.JSpinner(resultField1);
        resultField2 = new SpinnerNumberModel(spinnerValue,spinnerMin,spinnerMax,spinnerInterval);
        spinner2 = new javax.swing.JSpinner(resultField2);
        resultField3 = new SpinnerNumberModel(spinnerValue,spinnerMin,spinnerMax,spinnerInterval);
        spinner3 = new javax.swing.JSpinner(resultField3);
        saveResultButton = new javax.swing.JButton();

        jLabel1.setText("Choose event to display results");

        viewResultsButton.setText("View Results");

        selectResultsEvent.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setPreferredSize(new java.awt.Dimension(600, 800));

        textArea.setColumns(20);
        textArea.setRows(5);
        textArea.setPreferredSize(new java.awt.Dimension(164, 800));
        jScrollPane1.setViewportView(textArea);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 503, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(selectResultsEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                        .addComponent(viewResultsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(185, 185, 185))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(viewResultsButton))
                .addGap(29, 29, 29)
                .addComponent(selectResultsEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Home - View Results", jPanel1);

        jLabel2.setText("Age: (e.g. U15 - Under 15 years old)");

        jLabel3.setText("Gender");

        jLabel4.setText("Event Title:  (e.g. Long Jump) and unit (i.e. Time mm:ss:s or Distance M:cm");

        ages.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "U11", "U12", "U13", "U14", "U15", "U16", "U17", "U18", "U19" }));

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boys", "Girls" }));

        unit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Time", "Distance" }));

        saveEventButton.setText("Save Event");

        eventTitle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventTitleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(saveEventButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                        .addComponent(unit, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ages, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(eventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(350, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(ages, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel4)
                .addGap(14, 14, 14)
                .addComponent(eventTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(saveEventButton)
                .addContainerGap(135, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add New Event", jPanel2);

        jLabel5.setText("Event");

        jLabel6.setText("First Name");

        jLabel7.setText("Last Name");

        jLabel8.setText("Result");

        metresLabel.setText("Metres");

        minsLabel.setText("Minutes");

        cmLabel.setText("cm");

        secsLabel.setText("Seconds");

        mmLabel.setText("mm");

        msecsLabel.setText("Milliseconds");

        saveResultButton.setText("Save Result");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(msecsLabel)
                    .addComponent(mmLabel)
                    .addComponent(secsLabel)
                    .addComponent(cmLabel)
                    .addComponent(minsLabel)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(metresLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(selectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(competitorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(competitorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(saveResultButton, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(competitorLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(competitorFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectEvent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(metresLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(cmLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(secsLabel)
                .addGap(18, 18, 18)
                .addComponent(spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(mmLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(msecsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(saveResultButton)
                .addContainerGap(119, Short.MAX_VALUE))
        );

        metresLabel.setVisible(false);
        cmLabel.setVisible(false);
        mmLabel.setVisible(false);

        jTabbedPane1.addTab("Add Event Results", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 11, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>                        

    private void eventTitleActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JComboBox<String> ages;
    private javax.swing.JLabel cmLabel;
    private javax.swing.JTextField competitorFirstName;
    private javax.swing.JTextField competitorLastName;
    private javax.swing.JTextField eventTitle;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel metresLabel;
    private javax.swing.JLabel minsLabel;
    private javax.swing.JLabel mmLabel;
    private javax.swing.JLabel msecsLabel;
    private javax.swing.JButton saveEventButton;
    private javax.swing.JButton saveResultButton;
    private javax.swing.JLabel secsLabel;
    private javax.swing.JComboBox<String> selectEvent;
    private javax.swing.JComboBox<String> selectResultsEvent;
    private javax.swing.JSpinner spinner1;
    private javax.swing.JSpinner spinner2;
    private javax.swing.JSpinner spinner3;
    private javax.swing.JTextArea textArea;
    private javax.swing.JComboBox<String> unit;
    private javax.swing.JButton viewResultsButton;
    // End of variables declaration                   
//My variables
    private     Integer     spinnerMax;
    private     Integer     spinnerMin = 0;
    private     Integer     spinnerInterval = 1;
    private     Integer     spinnerValue = 0;
    private     SpinnerNumberModel  resultField1;
    private     SpinnerNumberModel  resultField2;
    private     SpinnerNumberModel  resultField3;
    private     SportsDay   sportsDay = new SportsDay();
     
    /**
     * Method to validate length of a string to see if it fits between the min and max lengths.
     * @PARAM String inputString        The actual string that is being tested.
     * @PARAM Integer minLength         The minimum length of the string that will pass the test.
     * @PARAM Integer maxLength         The maximum length of the string that will pass the test.
     * @RETURN Boolean                  True if the input string is greater than or equal to minLength and less than or equal to maxLength, otherwise, false.
     * 
     * This method checks a strings length and returns boolean true or false if it passes the min/max length test.  It is used for validating name and event string
     * length.
     */
    public  Boolean checkStringLength( String inputString, Integer minLength, Integer maxLength  )
    {
        
        int stringLength = inputString.length();
        
        if (stringLength >= minLength && stringLength <= maxLength){
            System.out.println("pass");
            return true;           
        }
        else{
            System.out.println("fail");
            return false;
        } 
        } 
    
    /**
     * inner event listener class - private.  This class handles GUI Events
     * 
     * ===Save Event Button===
     *  When the save event button is fired:
     *  -the eventTitle string is passed to checkStringLength wi a min length of 3 and a max length of 20.  If the string fails this test, an error box
     *      is shown and the event title must be re-entered.
     *  -otherwise, the eventName is constructed from the event title, age and gender.
     *  -a new instance of Event is created within the instance of SportsDay, with the parameters eventName and eventUnit (which is either distance or time only).
     *  -the instance of Event is added to the arrayList of Events in SportsDay
     *  - the eventName is added to the select event combo boxes on the results tab and the add results tab.
     *  
     *  The event name is constructed in a way that produces a consistent naming format that does not need validating, apart from the string of event type -e.g. long jump.
     * 
     * ===Save Result Button===
     * When the save result button is fired:
     * -the fName and lName strings are passed to checkStringLength wi a min length of 1 and a max length of 20.  If the string fails this test, an error box
     *      is shown and the event title must be re-entered.
     * -otherwise get the eventType String (time or distance)
     * if the eventType is distance:
     *      -get the values as type Number from the resultsFields 1,2 and 3 and convert the distance to Double metres e.g. 1.245 
     *      -add the result to the event as follows: sportsDay.addResult(eventName, fName, lName, totalDist).  This call the addResult method and creates a new competitor, with result
     *      in the arraylist of competitors for that particular instance of event
     *      This means that each event object has the results data stored within the instance of the event and so mixing up of results is very difficult.
     * if the eventType is time:
     *      -get the values as type Number from the resultsFields 1,2 and 3 and convert the distance to Double time in seconds e.g. 36.245 
     *      -add the result to the event as follows: sportsDay.addResult(eventName, fName, lName, totalTime).  This call the addResult method and creates a new competitor, with result
     *      in the arraylist of competitors for that particular instance of event
     *      This means that each event object has the results data stored within the instance of the event and so mixing up of results is very difficult.
     * 
     * ===selectEvent (from combo box on enter results tab)===
     * -get the eventName
     * -get the eventType
     * -if the eventType is distance, set the label visibilty so that mins, sec's, thous are invisble and M, cm and mm are visible.  Set the spinnerNumberModel params appropriately.
     * -if the eventType is time, set the label visibilty so that mins, sec's, thous are visble and M, cm and mm are invisible.  Set the spinnerNumberModel params appropriately.
     * This means that labels are set correctly.  An alternative would have been to have different alternative spinners for distance and time.  This may have involved more code.
     * Essentially all results are a Double - either metres or seconds.  This means that ordering results can be relatively simple.
     * 
     * ===viewResultsButton===
     * -get the eventName
     * -get the eventType
     * -get the event instance by name
     * - call the getResults() method of the event instance
     * - display the results in the textArea
     * 
     */
    
        private class EventListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
           
        if(e.getSource() == saveEventButton){
        //Manipulate strings so that event objects can be named correctly
        //Events are named as follows:  u13girlshighjump; u15boys100m.  All lower case, no spaces.
        System.out.println("saveEventButton fired");
        
        String title = eventTitle.getText();
        Boolean test = checkStringLength(title,3,20);
        if (test == false){
           System.out.println("false part");
           JOptionPane.showMessageDialog(new JFrame(),
           "Error - event name needs to be between 3 and 20 characters in length",
           "Event Name Error",
           JOptionPane.ERROR_MESSAGE);

           eventTitle.setText("");}
        
        else{
        
        String eventName = ages.getSelectedItem().toString().toLowerCase();
        eventName = eventName + gender.getSelectedItem().toString().toLowerCase();
        eventName = eventName + eventTitle.getText().toLowerCase();
        //System.out.println(eventName);
        String eventUnit = unit.getSelectedItem().toString().toLowerCase();
        //System.out.println(eventUnit);
        sportsDay.createNewEvent(eventName, eventUnit);//Create a new event in the sportsDay object.
        selectEvent.addItem(eventName);
        selectResultsEvent.addItem(eventName);
    }
    }
    if(e.getSource() == saveResultButton){
        System.out.println("selectEvent combofired");
        String eventName = selectEvent.getSelectedItem().toString();
        String fName = competitorFirstName.getText();
        String lName = competitorLastName.getText();        
        Boolean testfName = checkStringLength(fName,1,30);
        Boolean testlName = checkStringLength(lName,1,30);
        
        if (testfName == false || testlName == false){
           System.out.println("false part");
           JOptionPane.showMessageDialog(new JFrame(),
           "Error - first and lastname needs to be between 1 and 30 characters in length each",
           "First Name Error",
           JOptionPane.ERROR_MESSAGE);

           eventTitle.setText("");}
        else{
        //String lName = competitorLastName.getText();
        Double totalDist;
        Double totalTime;
        String eventType = sportsDay.getEventType(eventName);
        System.out.println(eventType);
        if(eventType.equals("distance")){
            
            //input verification here?
            //String distance_M = resultField1.getText();
            Number distance_M = resultField1.getNumber();
            //Double distanceM = Double.parseDouble(distance_M);
            Double distanceM = distance_M.doubleValue();//double from spinnernumber
            //String distance_cm = resultField2.getText();
            Number distance_cm = resultField2.getNumber();
            //Double distancecm = Double.parseDouble(distance_cm);
            Double distancecm = distance_cm.doubleValue();//double from spinnernumber
            distancecm = distancecm * 0.01;
            
            Number distance_mm = resultField3.getNumber();
            //String distance_mm = resultField3.getText();
            //Double distancemm = Double.parseDouble(distance_mm);
            Double distancemm = distance_mm.doubleValue();//double from spinnernumber
            
            distancemm = distancemm * 0.001;
            totalDist = distanceM + distancecm + distancemm;//calculate the distance in metres
            System.out.println(totalDist);
            sportsDay.addResult(eventName, fName, lName, totalDist);
            System.out.println(eventName);//TESTING
            Event event = sportsDay.getEvent(eventName);//TESTING - get the event object
            event.getResults();//TESTING Print the results for that object to the console
    }
    if(eventType.equals("time")){
            //String time_M = resultField1.getText();
            Number time_M = resultField1.getNumber();
            //Double timeM = Double.parseDouble(time_M);
            Double timeM = time_M.doubleValue();
            timeM = timeM * 60;//convert mins to seconds
            //String time_sec = resultField2.getText();
            Number time_sec = resultField2.getNumber();
            //Double timesec = Double.parseDouble(time_sec);
            Double timesec = time_sec.doubleValue();
            //String time_millisec = resultField3.getText();
            Number time_millisec = resultField3.getNumber();
            Double timemillisec = time_millisec.doubleValue();
            
            //Double timemillisec = Double.parseDouble(time_millisec);
            timemillisec = timemillisec * 0.001;
            totalTime = timeM + timesec + timemillisec;// calculate time in seconds
            System.out.println(totalTime);
            sportsDay.addResult(eventName, fName, lName, totalTime);
    }
    }
    }
    if(e.getSource() == selectEvent){
        System.out.println("selectEvent combofired");
        String eventName = selectEvent.getSelectedItem().toString();
        String eventType = sportsDay.getEventType(eventName);
        System.out.println(eventType);
        if(eventType.equals("distance")){//.equals checks for value equality whereas == checks for is equal to - object.
            System.out.println("Distance selected, changing label visibility");
            minsLabel.setVisible(false);
            secsLabel.setVisible(false);
            msecsLabel.setVisible(false);
            metresLabel.setVisible(true);
            cmLabel.setVisible(true);
            mmLabel.setVisible(true);
            spinnerMax = 50;
            resultField1.setMaximum(spinnerMax);
            resultField1.setValue(0);
            spinnerMax = 99;
            resultField2.setMaximum(spinnerMax);
            resultField2.setValue(0);
            spinnerMax = 9;
            resultField3.setMaximum(spinnerMax);
            resultField3.setValue(0);
           }
        else if(eventType.equals("time")){
            System.out.println("Time selected, changing label visibility");
            minsLabel.setVisible(true);
            secsLabel.setVisible(true);
            msecsLabel.setVisible(true);
            metresLabel.setVisible(false);
            cmLabel.setVisible(false);
            mmLabel.setVisible(false);
            spinnerMax = 59;
            resultField1.setMaximum(spinnerMax);
            resultField1.setValue(0);
            resultField2.setMaximum(spinnerMax);
            resultField2.setValue(0);
            spinnerMax = 999;
            resultField3.setMaximum(spinnerMax);
            resultField3.setValue(0);
           }    
          }
    if(e.getSource() == viewResultsButton){
        System.out.println("viewResultsButton combofired");
        String eventName = selectResultsEvent.getSelectedItem().toString();
        String eventType = sportsDay.getEventType(eventName);
        Event event = sportsDay.getEvent(eventName);
        String results = event.getResults();
        
        System.out.println(results);
        textArea.setText(results);
        }
    }
        }

}

SportsDayGUI.java
Displaying SportsDayGUI.java.
