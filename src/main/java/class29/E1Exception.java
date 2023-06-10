package class29;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E1Exception {

    public static void main(String[] args) throws FileNotFoundException {

        method1();
    }

    static void method1() throws FileNotFoundException {
        method2();
    }

    static void method2() throws FileNotFoundException {
        method3();
    }

    static void method3() throws FileNotFoundException {
        File file = new File("Files/Emp1.xlsx");
        if (file.exists()) {
            FileInputStream fileInputStream = new FileInputStream(file);
        }
    }
}
