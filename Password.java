import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        System.out.println("x: A.SAMHITHA,24011");
        Scanner input = new Scanner(System.in);
        
        System.out.print("First name: ");
        String fname = input.nextLine();
        
        System.out.print("Middle name: ");
        String mname = input.nextLine();
        
        System.out.print("Last name: ");
        String lname = input.nextLine();
        
        System.out.print("Age: ");
        int age = input.nextInt();
        
        String password = "" + fname.charAt(0) + mname.charAt(0) + lname.charAt(0) + age;
        System.out.println("Password: " + password);
        
        input.close();
    }
}
