package class28;

public class E5Exceptions {
    public static void main(String[] args) {
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        try{
       // System.out.println(10 / 0);
            "".charAt(10);
           // int [] arr=new int[-5];
        }
        catch (ArithmeticException e){
            System.out.println("Some one is trying to divide by zero");
        }
        catch (NegativeArraySizeException e){
            System.out.println("someone is trying to create an array of negative size");
        }
        catch (Exception e){
            System.out.println("something went wrong executing Backup code");
        }
        System.out.println("4");
    }
}
