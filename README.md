Đây là một ví dụ về bài tập kiểm thử đơn vị với Java.
### Tính năng:
- Cộng hai số nguyên.
- Trừ hai số nguyên.
- Nhân hai số nguyên.
- Chia hai số nguyên với xử lý lỗi chia cho 0.

### Yêu cầu trước khi sử dụng:
- Java Development Kit (JDK) 8 hoặc mới hơn.
- Công cụ build Maven.
- JUnit 5 để kiểm thử.

### Lớp Calculator

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}

### Lớp Kiểm thử

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

### Kết quả
![Screenshot (157)](https://github.com/user-attachments/assets/43645a78-546e-4fbb-b8c2-562a4df9075f)

### Tài liệu tham khảo: https://chatgpt.com/share/677b2a36-1820-8013-be04-e1376d262216
