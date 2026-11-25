public class Main {
    public static void main(String[] args) {
        //string literal
        String name ="java";
        String age ="java";
        System.out.println(name==age);

        //new keyword
        String name1 = new String("java");
        String age1 = new String("java");
        System.out.println(name1 ==age1);
        System.out.println(name1.equals(age1));
    }
}