package day_4;
import java.util.Scanner;

public class CalculatorWithMenu implements CalculatorMenu {

    private Scanner scanner;
    private CalculatorOperations calculator = new Calculator();

    // constructor de calculadora
    public CalculatorWithMenu() {
        this.scanner = new Scanner(System.in);
    }

    // Métodos accesores
    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public CalculatorOperations getCalculator() {
        return calculator;
    }

    public void setCalculator(CalculatorOperations calculator) {
        this.calculator = calculator;
    }

    // Sobrescritura de los métodos implementados
    @Override
    public void displayMenu() {
        System.out.println(generateMenu());
    }

    @Override
    public void executeOperation() {
        boolean exitApp = false;
        while (!exitApp) {
            displayMenu();
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    performAddition();
                    break;
                case 2:
                    performSubtraction();
                    break;
                case 3:
                    performMultiplication();
                    break;
                case 4:
                    performDivision();
                    break;
                case 0:
                    exitApp = true;
                    System.out.println("Exiting the calculator. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }

        scanner.close();
    }

    // métodos privados de la clase para ejeccutar los métodos de la interfaz.
    // 1** método para desplegar menú.
    private String generateMenu () {
        return """
                \n********* Calculator menu:
                Press 1 - To make a sum,
                Press 2 - To make a substraction,
                Press 3 - To make a division,
                Press 4 - To make a multiplication,
                Press 0 - To exit the application.
                
                Insert the option:::
                """;
    }

    // 2** métodos para ejecutar la operación seleccionada
    private void performAddition() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = calculator.add(num1, num2);
        System.out.println("Result: " + result);
    }

    private void performSubtraction() {
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int result = calculator.subtract(num1, num2);
        System.out.println("Result: " + result);
    }

    private void performDivision() {
        System.out.print("Enter dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter divisor: ");
        double divisor = scanner.nextDouble();
        if (divisor == 0) {
            System.out.println("Error: Cannot divide by zero.");
        } else {
            double result = calculator.divide(dividend, divisor);
            System.out.println("Result: " + result);
        }
    }

    private void performMultiplication() {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double result = calculator.multiply(num1, num2);
        System.out.println("Result: " + result);
    }

}
