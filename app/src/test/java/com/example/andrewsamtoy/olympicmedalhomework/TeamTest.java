package com.example.andrewsamtoy.olympicmedalhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by andrewsamtoy on 9/17/17.
 */

public class TeamTest {
    Team australiaSwimming;

    @Before
    public void before(){
        australiaSwimming = new Team("Australia", 50.04);
    }

    @Test
    public void canGetCountry(){
        assertEquals("Australia", australiaSwimming.getCountry());
    }

   @Test
    public void canGetMetric(){
        assertEquals(50.04, australiaSwimming.getMetric());
    }
}
