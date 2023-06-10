package class30;

public class E4Methods {
    public static void main(String[] args) {
        E4Methods e4Methods=new E4Methods();
       // e4Methods.printHello();
        e4Methods.printWord("Java");
    }

    void printHello(){
        System.out.println("Hello World");
    }
    void printWord(String word){
        System.out.println(word);
        printHello();


    }
}
