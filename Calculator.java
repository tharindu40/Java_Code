import java.util.Scanner;

public class AdditionCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, result;

        System.out.println("Addition Calculator");
        System.out.print("Enter the first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = input.nextDouble();

        result = num1 + num2;

        System.out.println("Result: " + result);

        input.close();
    }
}
