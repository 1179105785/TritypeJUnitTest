package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeTest {
 @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-1, -2, -7));
        assertEquals(3, tri.Triang(1, 1, 1));
        assertEquals(1, tri.Triang(3, 4, 5));
        assertEquals(4, tri.Triang(3, 4, 9));
        assertEquals(3, tri.Triang(3, 3, 3));
        assertEquals(2, tri.Triang(3, 3, 5));
        assertEquals(2, tri.Triang(3, 5, 3));
        assertEquals(2, tri.Triang(5, 3, 3));
        assertEquals(4, tri.Triang(3, 3, 7));
    }
}