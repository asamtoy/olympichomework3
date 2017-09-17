package com.example.andrewsamtoy.olympicmedalhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/17/17.
 */

public class AthleteTest {

    Athlete athlete;


    @Before
    public void before(){
        athlete = new Athlete("Andrew", 8.0);

    }

    @Test
    public void canGetName(){
        assertEquals("Andrew", athlete.getName());
    }

    @Test
    public void canGetCountry(){
        assertEquals("USA", athlete.getCountry());
    }

    @Test
    public void canGetMetric(){assertEquals(8.0, athlete.getMetric()); }

}
