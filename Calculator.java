public class Calculator {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first number: ");
    int firstNumber = scanner.nextInt();
    System.out.print("Enter the second number: ");
    int secondNumber = scanner.nextInt();
    int result = firstNumber / secondNumber;
    System.out.println("The result of dividing the first number by the second number is: " + result);
  }
}
