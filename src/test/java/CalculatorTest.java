import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3), "Addition failed");
    }

    @Test
    void testSubtract() {
        Calculator calc = new Calculator();
        assertEquals(1, calc.subtract(3, 2), "Subtraction failed");
    }

    @Test
    void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6, calc.multiply(2, 3), "Multiplication failed");
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(2, calc.divide(6, 3), "Division failed");
    }

    @Test
    void testDivideByZero() {
        Calculator calc = new Calculator();
        Exception exception = assertThrows(ArithmeticException.class, () -> calc.divide(1, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
