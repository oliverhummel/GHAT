package de.hs_mannheim.informatik.se2.github_actions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

//    @Test
//    void test() {
//        fail("Not yet implemented");
//    }
    
    @Test
    void testAddition() {
        Calculator cal = new Calculator();
        
        assertEquals(5, cal.add(5));
        assertEquals(5, cal.add(3, 2));
        assertEquals(-1, cal.add(-5, 1, 1, 2));
        assertEquals(0, cal.add(0, 0, 1, -1));
    }
    
    @Test
    void testMultiplication() {
        Calculator cal = new Calculator();
        
        assertEquals(5, cal.mult(5));
        assertEquals(6, cal.mult(3, 2));
        assertEquals(-10, cal.mult(-5, 1, 1, 2));
        assertEquals(0, cal.mult(1232, 0, 1, -1));
    }
    
    @Test
    void testMaxFinder() {
        Calculator cal = new Calculator();
        
        assertEquals(5, cal.max(5));
        assertEquals(3, cal.max(3, 2));
        assertEquals(2, cal.max(-5, 1, 1, 2));
        assertEquals(1232, cal.max(1232, 0, 1, -1));
    }


}
