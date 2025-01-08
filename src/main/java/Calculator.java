import java.math.BigDecimal;
import java.util.logging.Logger;

public class Calculator {

    private static final Logger logger = Logger.getLogger(Calculator.class.getName());

    // Phép cộng
    public BigDecimal add(BigDecimal a, BigDecimal b) {
        logger.info("Performing addition: " + a + " + " + b);
        return a.add(b);
    }

    // Phép trừ
    public BigDecimal subtract(BigDecimal a, BigDecimal b) {
        logger.info("Performing subtraction: " + a + " - " + b);
        return a.subtract(b);
    }

    // Phép nhân
    public BigDecimal multiply(BigDecimal a, BigDecimal b) {
        logger.info("Performing multiplication: " + a + " * " + b);
        return a.multiply(b);
    }

    // Phép chia
    public BigDecimal divide(BigDecimal a, BigDecimal b) {
        if (b.compareTo(BigDecimal.ZERO) == 0) {
            logger.severe("Attempted to divide by zero: " + a + " / " + b);
            throw new ArithmeticException("Cannot divide by zero");
        }
        logger.info("Performing division: " + a + " / " + b);
        return a.divide(b, BigDecimal.ROUND_HALF_UP);
    }

    // Phép mũ
    public BigDecimal power(BigDecimal base, int exponent) {
        logger.info("Performing power calculation: " + base + " ^ " + exponent);
        return base.pow(exponent);
    }

    // Căn bậc hai
    public BigDecimal sqrt(BigDecimal value) {
        if (value.compareTo(BigDecimal.ZERO) < 0) {
            logger.severe("Attempted to calculate square root of a negative number: " + value);
            throw new ArithmeticException("Cannot calculate square root of a negative number");
        }
        logger.info("Performing square root calculation: √" + value);
        return BigDecimal.valueOf(Math.sqrt(value.doubleValue()));
    }
}
