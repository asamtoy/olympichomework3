package com.example.andrewsamtoy.olympicmedalhomework;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;


/**
 * Created by andrewsamtoy on 9/17/17.
 */

public class EventsAsArrayTest {
    EventAsArray competitors;


    @Test
    public void canGetArray(){
        assertEquals(9, competitors.size());
    }

}
