public class AmEx {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        try {
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed. Cleaning up resources if any.");
        }
        System.out.println("Program continues after try-catch-finally block.");
        System.out.println("A.SAMHITHA, CSE24011");
    }
}
