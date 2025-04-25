import java.util.Scanner;
interface LoginSystem {
    void login();}
class UserLogin implements LoginSystem {
    String correctUsername = "amrita_student";
    String correctPassword = "amrita@123";

    public void login() {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Amrita Portal Username: ");
        String username = sc.nextLine();
        
        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Login successful! Welcome to Amrita University Portal, " + username + "!");
        } else {
            System.out.println(" Login failed! Incorrect Amrita credentials.");}
    }
}
public class Main {
    public static void main(String[] args) {
        LoginSystem user = new UserLogin();
        user.login(); }
}

