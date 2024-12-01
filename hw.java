import java.util.Scanner;

class hw {
    @Override
    public String toString() {
        return "Main []";
    }

    public static void main(final String[] args) {
         Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("enter two numbers:");
            final int x = scanner.nextInt();
            final int y = scanner.nextInt();

            final int z = x / y;
            System.out.println("Result = " + z);
        } catch (final ArithmeticException ex) {
            System.out.println("Exception: cannot divide a number by zero!");
        } catch (final ArrayIndexOutOfBoundsException ex) {
            System.out.println("Exception: please provide minimum 2 cmd args");
        } catch (final NumberFormatException ex) {
            System.out.println("Exception: please provide number without decimal point as args");
        }
        System.out.println("--- DONE ---");
    }
}
