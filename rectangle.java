import java.util.Scanner; 
// Importing Scanner class

class Main {
    public static void main(String[] args) {
        // For calculating the area of a rectangle
        Scanner input = new Scanner(System.in); 
        // Creating Scanner object
        System.out.print("Enter the length of the rectangle: ");
        int length = input.nextInt(); 
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth = input.nextInt(); 
        int area = length * breadth; 
        // for calculating area
        System.out.println("Area of the rectangle is: " + area); 
        // Displaying the result
    }
}
