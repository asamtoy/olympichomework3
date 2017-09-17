package com.example.andrewsamtoy.olympicmedalhomework;

import java.util.ArrayList;


/**
 * Created by andrewsamtoy on 9/17/17.
 */

public class Event {
    private ArrayList<String> event;

    public Event(){
        event = new ArrayList<>();
    }

    public ArrayList<String> getCompetitors() {
        return new ArrayList<>(event);
    }

    public String getCompetitorByIndex(int index) {
        return this.event.get(index);
    }

    public void addCompetitors() {
        String[] competitorsToAdd = {
                "athleteUSA",
                "athleteRomania",
                "athleteMexico"
        };

        for(String competitor: competitorsToAdd) {
            event.add(competitor);
        }
    }

}




//    195 countries in the world; this should be the max size of the array

//What I want is a class that has an hashmap.  The hashmap takes in a competitor in any event, then compares it to
//    the other competitors in the event based on the "metric."


