package class28;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class E6Exceptions {
    public static void main(String[] args)  {


        try {
            FileInputStream fileInputStream=new
                    FileInputStream("C:\\Users\\Syntax\\IdeaProjects\\SDETJavaBatch16\\Files\\Emp.xlsx");
        } catch (FileNotFoundException e) {
            System.out.println("bla bla bla");
        }


        System.out.println(10/0);

    }
}
