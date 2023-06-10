package class30;

public class E1Methods {

    /*
    write code to print hello world 3 times
    Hello java 3 times
    Hello Batch16 3 times
     */
    public static void main(String[] args) {
        printWord("Hello World");
        printWord("Hello Java");
        printWord("Hello Batch16");
    }

    static void printWord(String word){
        for (int i = 0; i < 3; i++) {
            System.out.println(word);
        }
    }
}
