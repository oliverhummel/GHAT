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

}
