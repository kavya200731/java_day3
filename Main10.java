class EmailChecker {
    String email = "student@gmail.com";

    void check() {
        if (email.contains("@")) {
            System.out.println("Email contains @");
        } else {
            System.out.println("Email does not contain @");
        }

        if (email.contains("gmail")) {
            System.out.println("Email contains gmail");
        } else {
            System.out.println("Email does not contain gmail");
        }
    }
}

public class Main10 {
    public static void main(String[] args) {
        EmailChecker e = new EmailChecker();
        e.check();
    }
}