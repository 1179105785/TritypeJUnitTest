package com.example.tritypejunittest;

import static org.junit.Assert.*;

import org.junit.Test;

public class TritypeMutationTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        TritypMutantOne tri1 = new TritypMutantOne();
        TritypMutantTwo tri2 = new TritypMutantTwo();
        assertEquals(4, tri.Triang(3, 3, 6));
        assertEquals(2, tri1.Triang(3, 3, 6));
        assertEquals(2, tri2.Triang(3, 3, 6));
    }

}