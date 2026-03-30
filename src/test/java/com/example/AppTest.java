package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testAddition() {
        assertEquals(5, App.add(2, 3));
        
    }

    @Test
    void testSubtraction() {
        assertEquals(1, App.subtract(5, 4));
    }

    @Test
    void testMultiplication() {
        assertEquals(10, App.multiply(2, 5));
    }

    @Test
    void testDivision() {
        assertEquals(2, App.divide(10, 5));
    }
}
