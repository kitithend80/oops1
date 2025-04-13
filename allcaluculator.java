import java.util.Scanner;

public class allcalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter a number: ");
        double a = input.nextDouble();
        
        System.out.println("Enter b number: ");
        double b = input.nextDouble();
        
        Final calc = new Final(a, b);
        calc.displayResults();
        
        System.out.println("Samhitha");
        input.close();
    }
}
