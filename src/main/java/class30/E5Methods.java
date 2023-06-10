package class30;

public class E5Methods {
    public static void main(String[] args) {
        E5Methods e4Methods = new E5Methods();

        e4Methods.printWord("Java", 5);
    }

    void printWord(String word, int N) {

        for (int i = 0; i < N; i++) {
            System.out.println(word);
        }
    }
}
