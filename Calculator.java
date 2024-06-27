import java.util.logging.Logger;

public class Calculator {
    private static Logger logger = Logger.getLogger(Calculator.class.getName());
    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double actionOperatoin(double a, double b) {
        if (operation == null) {
            throw new UnsupportedOperationException("Операция не задана.");
        }
        double result = operation.action(a, b);
        logger.info("Выполненная операция: " + operation.getClass().getName() + ", операнды: " + a + ", " + b + ", результат: " + result);
        return result;
    }   
}
