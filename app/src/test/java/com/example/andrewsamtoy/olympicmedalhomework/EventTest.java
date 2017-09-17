package com.example.andrewsamtoy.olympicmedalhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * Created by andrewsamtoy on 9/17/17.
 */



public class EventTest {
    Athlete athleteUSA;
    Athlete athleteRomania;
    Event basketball;

    @Before
    public void before(){
        athleteUSA = new Athlete("TeamAmerica", 104.0);
        athleteRomania = new Athlete("TeamRomania", 59.0);
        basketball = new Event();

    }

    @Test
    public void canGetCompetitors(){
        assertNotNull(basketball.getCompetitors());
    }

    @Test
    public void canAddCompetitor(){
        basketball.addCompetitors();
        assertEquals("athleteUSA", basketball.getCompetitorByIndex(0));
    }

    @Test
    public void canAddSecondCompetitor(){
        basketball.addCompetitors();;
        assertEquals("athleteRomania", basketball.getCompetitorByIndex(1));
    }


}
