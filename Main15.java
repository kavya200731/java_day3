class InputCleaner {
    String username = " JavaDeveloper ";

    void display() {
        System.out.println("Original username: '" + username + "'");
        System.out.println("Original length: " + username.length());

        String cleaned = username.trim();

        System.out.println("Cleaned username: '" + cleaned + "'");
        System.out.println("Cleaned length: " + cleaned.length());
    }
}

public class Main15 {
    public static void main(String[] args) {
        InputCleaner i = new InputCleaner();
        i.display();
    }
}