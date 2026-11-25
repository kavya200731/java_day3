class UsernameValidator {
    String username = "Admin";
    String enteredUsername = "ADMIN";

    void check() {
        if (username.equalsIgnoreCase(enteredUsername)) {
            System.out.println("Valid Username");
        } else {
            System.out.println("Invalid Username");
        }
    }
}

public class Main9 {
    public static void main(String[] args) {
        UsernameValidator u = new UsernameValidator();
        u.check();
    }
}