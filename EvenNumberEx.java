public class EvenNumberEx {
    static class EvenNumberException extends Exception {
        public EvenNumberException(String message) {
            super(message);
        }
    }

    public static void checkOddNumber(int number) throws EvenNumberException {
        System.out.println("A.SAMHITHA, CSE24011");
        if (number % 2 == 0) {
            throw new EvenNumberException("Error: The number " + number + " is even.");
        } else {
            System.out.println("The number " + number + " is odd.");
        }
    }

    public static void main(String[] args) {
        int[] numbers = {3, 8, 7, 4};
        for (int number : numbers) {
            try {
                checkOddNumber(number);
            } catch (EvenNumberException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
