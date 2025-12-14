import java.util.Scanner;
public class LoginApp {
    private static final String VALID_USERNAME = "admin";
    private static final String VALID_PASSWORD = "password123";
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        if (VALID_USERNAME.equals(username) && VALID_PASSWORD.equals(password)) {
            System.out.println("Login Successful!");
        } else {
            System.out.println("Access Denied!");
        }
        scanner.close();
    }
}