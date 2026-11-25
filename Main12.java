class WordAnalyzer {
    String word = "banana";

    void display() {
        System.out.println("Word: " + word);

        System.out.println("First occurrence of a: " + word.indexOf('a'));
        System.out.println("Last occurrence of a: " + word.lastIndexOf('a'));

        System.out.println("First occurrence of n: " + word.indexOf('n'));
        System.out.println("Last occurrence of n: " + word.lastIndexOf('n'));
    }
}

public class Main12 {
    public static void main(String[] args) {
        WordAnalyzer w = new WordAnalyzer();
        w.display();
    }
}