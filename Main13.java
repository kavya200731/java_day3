class NameExtractor {
    String fullName = "Java Full Stack Developer";

    void display() {
        System.out.println("Original text: " + fullName);
        System.out.println("First word: " + fullName.substring(0, 4));
        System.out.println("Second word: " + fullName.substring(5, 9));
        System.out.println("Remaining text: " + fullName.substring(10));
    }
}

public class Main13 {
    public static void main(String[] args) {
        NameExtractor n = new NameExtractor();
        n.display();
    }
}