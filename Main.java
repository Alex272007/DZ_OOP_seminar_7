public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    calculator.setOperation(new Addition());
    System.out.println("Операция сложения: " + calculator.actionOperatoin(5, 3));

    calculator.setOperation(new Multiplication());
    System.out.println("Операция умножение: " + calculator.actionOperatoin(4, 8));

    calculator.setOperation(new Division());
    System.out.println("Операция деление: " + calculator.actionOperatoin(7, 4));

    }
  
}