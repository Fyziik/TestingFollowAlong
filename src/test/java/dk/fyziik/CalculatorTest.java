package dk.fyziik;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator c;

    @BeforeEach
    void setUp() {
        c = new Calculator();
    }

    @Test
    void add() {
        assertEquals(3, c.add(1, 2));
    }

    @Test
    void subtract() {
        assertEquals(5, c.subtract(10, 5));
    }

    @Test
    void divide() {
        assertEquals(10, c.divide(40, 4));
    }

    @Test
    void multiply() {
        assertEquals(50, c.multiply(5, 10));
    }

    @Test
    void modulus() {
        assertEquals(1, c.modulus(6, 5));
    }
}