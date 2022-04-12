/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sportsday;

import java.util.ArrayList;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/**
 *
 * 
 * @author Trevor Storr 
 * @version 1
 * @PARAM String eventName - the name of the event
 * @PARAM String eventUnit - wil be either "time" or "distance"
 * Holds the event information and a private inner class of the competitors and their results.  The data for each event is held as an array of
 * competitors (person objects).  Each competitor has their data held within the person instance.  This means that the data for the evnt is encapsulated within the event and 
 * person objects.  This is much more secure than a general array of results.
 * Rounding mode is used to correct double rounding errors.
 */
public class Event
{
    // instance variables - replace the example below with your own
    private String eventName;
    private String eventUnit;
    private Person person;
    private ArrayList<Person> competitors = new ArrayList<Person>();

    /**
     * Constructor for objects of class Event
     * @PARAM String eventName - the name of the event
     * @PARAM String eventUnit - wil be either "time" or "distance" 
     */
    public Event(String eventName, String eventUnit)
    {
        // initialise instance variables
        this.eventName = eventName;
        this.eventUnit = eventUnit;
    }
    
    /**
     * getEventName
     * @RETURN String eventName
     * 
     * Return the instances eventName
     * 
     */
     public String getEventName()
     {
         return eventName;
         
     }  
     
     /**
     * getEventUnit
     * 
     * @RETURN String eventUnit
     * 
     * Return the instances eventUnit - either "time" or "distance"
     */
     public String getEventUnit()
     {
         return eventUnit;
         
     } 
     
     
     /**
     * getResults
     * 
     */
     public String getResults()
     {
        int size = competitors.size();
        System.out.println(size);
        String eventResults = "Results for: "+ getEventName() + "\n";
        String eventType = getEventUnit();
        Person person = null;
        if(eventType.equals("distance")){//.equals checks for value equality whereas == checks for is equal to - object.
            for (Person p : competitors){
            String result = "\n" + p.getPersonName() + ":  " + Double.toString(p.getPersonResult()) + " metres\n";
            System.out.println(result);
            int size1 = competitors.size();
            eventResults = eventResults + result;
        }
        }
        if(eventType.equals("time")){//.equals checks for value equality whereas == checks for is equal to - object.
            DecimalFormat df = new DecimalFormat("#.###");
            df.setRoundingMode(RoundingMode.CEILING);
            for (Person p : competitors){
            String result = "\n" + p.getPersonName();
            Double res = p.getPersonResult();
            int wholeSecs = p.getPersonResult().intValue();//the whole number of seconds
            int minutes = wholeSecs /60;
            Double secs = p.getPersonResult() - (minutes * 60);
            //secs = df.format(secs);
            String m = Integer.toString(minutes);
            String s = df.format(secs);
            //String s = Double.toString(secs);
            result = result + ":  " + m + "m" + s + "s" + "\n";
            eventResults = eventResults + result;
            
            System.out.println(result);
            System.out.println(eventResults);
            
           }
        }
        
         return eventResults;
        } 
     
        
    
    
    
     /**
      * Add competitor to the ArrayList of competitors
      */
     public void addCompetitor(String fName, String lName, Double result){
         competitors.add(new Person (fName, lName, result));
         System.out.println("Added competitor");
        }
     
     /** inner class Person */
    private class Person{
        
        private String fName;
        private String lName;
        private Double result;
        
        public Person(String fName, String lName, Double result){
        
            this.fName = fName;
            this.lName = lName;
            this.result = result;
            
            
        }
        
        public String getPersonName(){
           String name = lName + ", " + fName;
           return name;
        }
        
        public Double getPersonResult(){
            return result;
        }
            
        }
        
    }


