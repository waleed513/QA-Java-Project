import java.util.Scanner;
public class exehandle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            // Attempt to divide by zero to generate ArithmeticException//
            int result = 10 / num;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Scanner closed in finally block.");
        }

        
    }
}

