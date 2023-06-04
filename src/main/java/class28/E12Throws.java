package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E12Throws {
    public static void main(String[] args) throws FileNotFoundException {

        print();
    }

    static void print() throws FileNotFoundException {
        FileInputStream fileInputStream=new FileInputStream("sdsd");
    }
}
