package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMCDCTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(2, tri.Triang(3, 3, 2));
        assertEquals(4, tri.Triang(7, 3, 3));
    }
}
/*if (triOut == 1 && Side1+Side2 > Side3)
            triOut = 2;*/