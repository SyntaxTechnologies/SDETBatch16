package class30;

import java.util.Scanner;

public class E9Methods {
    public static void main(String[] args) {

      //int result= E8Methods.add(20,30);
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Input a number");
        int num=scanner.nextInt();

        if(num>100){
            System.out.println("Greater value");
        }


    }

    static void test(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please Input a number");
        int num=scanner.nextInt();

        if(num>100){
            System.out.println("Greater value");
        }
    }
}
