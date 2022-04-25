import java.util.Scanner;

public class newCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char calculatorOperation = 'C';
        double operand1;
        double operand2;
        char operation;
        double result = 0;

        do {
            if (calculatorOperation == 'C') {
                System.out.print("Ввести 1 значение: ");
                operand1 = sc.nextInt();
                System.out.print("Ввести операцию: ");
                operation = sc.next().charAt(0);
            }else{
                operand1 = result;
                operation = calculatorOperation;
            }

            System.out.print("Ввести 2 значение: ");
            operand2 = sc.nextInt();

            result = calculate(operand1, operation, operand2);

            System.out.print("Результат: ");
            System.out.println(operand1 + " " + operation + " " + operand2 + " = " + result);

            calculatorOperation = sc.next().charAt(0);

        }while (calculatorOperation != 's');
    }

    public static double calculate(double operand1, char operation, double operand2) {
        return switch (operation) {
            case '+' -> operand1 + operand2;
            case '-' -> operand1 - operand2;
            case '*' -> operand1 * operand2;
            case '/' -> operand1 / operand2;
            default -> {
                System.out.println("Error!");
                yield 0;
            }
        };

    }
}
