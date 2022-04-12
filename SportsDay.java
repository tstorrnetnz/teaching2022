/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

import java.util.ArrayList;

/**
 *
 * @author trevor
 */



public class SportsDay {
 // instance variables - replace the example below with your own
private ArrayList<Event> sportsDayEvents = new ArrayList<Event>();
    public SportsDay()
    {
     
    }
    /**
     * @param args the command line arguments
     */
    
        /**
     * Puts an event into the arraylist of events.
     */
    public String getEventType(String eventName)
    {
        Event event = getEvent(eventName);// gets the event with the correct name
        String unit = event.getEventUnit();//get if the unit is "distance" or "time"
        return unit;
    }
    /**
     * Puts an event into the arraylist of events.
     */
    public void addResult(String eventName, String fName, String lName, Double result)
    {
        Event event = getEvent(eventName);
        System.out.println("Got event");
        event.addCompetitor(fName, lName, result);//Add a competitor object to the event.    
    }
    
    /**
     * Returns an event from the arraylist of events.
     */
    public void createNewEvent(String eventName, String eventUnit)
    {
        Event event = new Event(eventName, eventUnit);
        sportsDayEvents.add(event);
    }
    /**
     * Returns an event from the arraylist of events, given the eventName.
     */
    public Event getEvent(String name)
    {
        Event event = null;
        for (Event ev : sportsDayEvents){
            if (ev.getEventName().equals(name)){
                System.out.println("found object:" +ev.getEventName().toString() );
                event = ev;
            }
        }
        return event;
        
        
    }
            // Main method to get things started
    public static void main( String args[] )
    {
        // Create an instance of the gui application
        

                
    javax.swing.JFrame window = new javax.swing.JFrame("Sportsday");
    window.getContentPane().add(new SportsDayGUI());
    window.setVisible(true);  
    window.pack(); 
    window.setDefaultCloseOperation(javax.swing.JFrame.EXIT_ON_CLOSE);
    }
    
}


