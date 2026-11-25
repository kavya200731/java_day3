class TextEditor {
    String sentence = "I love Python Programming";

    void display() {
        System.out.println("Original sentence: " + sentence);
        System.out.println("After replacing Python: " + sentence.replace("Python", "Java"));
        System.out.println("After replacing o with 0: " + sentence.replace('o', '0'));
    }
}

public class Main14 {
    public static void main(String[] args) {
        TextEditor t = new TextEditor();
        t.display();
    }
}