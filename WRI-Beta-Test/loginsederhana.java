import java.util.Scanner;
public class loginsederhana {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        String username, password;

            System.out.print("Username: ");
            username = scanner.nextLine();
            System.out.print("Password: ");
            password = scanner.nextLine();

            if (username.equals("Hafizh") && password.equals("12345678")) {
                System.out.println("Selamat Datang Hafizh");
            } else {
                System.out.println("Username dan Password Salah");
            }
    }
}