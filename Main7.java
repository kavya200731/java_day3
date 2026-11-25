class TextConverter {
    String message = "Welcome to Java Programming";

    void display() {
        System.out.println("Original message: " + message);
        System.out.println("Uppercase message: " + message.toUpperCase());
        System.out.println("Lowercase message: " + message.toLowerCase());
    }
}

public class Main7 {
    public static void main(String[] args) {
        TextConverter t = new TextConverter();
        t.display();
    }
}