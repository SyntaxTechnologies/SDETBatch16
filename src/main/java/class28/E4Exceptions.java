package class28;

public class E4Exceptions {
    public static void main(String[] args) {

        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");

        System.out.println("line 5");
        try {
            //"name".charAt(10);
            //System.out.println(10/0);
            String name=null;
            name.length();
            //int [] arr=new int[-5];
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Plan b");
        }catch (NegativeArraySizeException e){
            System.out.println("Plan c");
        }catch (ArithmeticException e){
            System.out.println("Plan d");
        }catch (Exception e){
            System.out.println("Plan f");
        }

        System.out.println("line 6");

        //break till 11:55
    }
}
