import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.math.BigDecimal;

public class CalculatorTest {

    Calculator calc = new Calculator(); // Khởi tạo đối tượng Calculator

    @Test
    void testAdd() {
        assertEquals(
                new BigDecimal("5"),
                calc.add(new BigDecimal("2"), new BigDecimal("3")),
                "Addition failed"
        );
    }

    @Test
    void testSubtract() {
        assertEquals(
                new BigDecimal("1"),
                calc.subtract(new BigDecimal("3"), new BigDecimal("2")),
                "Subtraction failed"
        );
    }

    @Test
    void testMultiply() {
        assertEquals(
                new BigDecimal("6"),
                calc.multiply(new BigDecimal("2"), new BigDecimal("3")),
                "Multiplication failed"
        );
    }

    @Test
    void testDivide() {
        assertEquals(
                new BigDecimal("2"),
                calc.divide(new BigDecimal("6"), new BigDecimal("3")),
                "Division failed"
        );
    }

    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> calc.divide(new BigDecimal("1"), BigDecimal.ZERO)
        );
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testPower() {
        assertEquals(
                new BigDecimal("8"),
                calc.power(new BigDecimal("2"), 3),
                "Power calculation failed"
        );
    }

    @Test
    void testSqrt() {
        assertEquals(
                new BigDecimal("3"),
                calc.sqrt(new BigDecimal("9")).setScale(0), // Làm tròn đến 0 chữ số sau dấu thập phân
                "Square root calculation failed"
        );
    }

    @Test
    void testSqrtNegative() {
        Exception exception = assertThrows(
                ArithmeticException.class,
                () -> calc.sqrt(new BigDecimal("-9"))
        );
        assertEquals("Cannot calculate square root of a negative number", exception.getMessage());
    }
}
