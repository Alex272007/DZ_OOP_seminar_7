public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

    calculator.setOperation(new Addition());
    System.out.println("Сумма: " + calculator.actionOperatoin(5, 3));

    calculator.setOperation(new Multiplication());
    System.out.println("Умножение: " + calculator.actionOperatoin(4, 8));

    calculator.setOperation(new Division());
    System.out.println("Деление: " + calculator.actionOperatoin(7, 4));

    }
  
}