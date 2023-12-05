package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeDecisionTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(4, tri.Triang(-1, -1, -1));
    }

}
/*if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
        triOut = 4;
        return (triOut);
        }*/