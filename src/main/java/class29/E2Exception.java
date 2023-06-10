package class29;

import java.io.FileNotFoundException;

public class E2Exception {

    public static void main(String[] args) throws FileNotFoundException {

        try {
            System.out.println(10/0);
        }catch (ArithmeticException e){
            System.out.println("Please don't divide any number by zero.");
        }


    }


}
