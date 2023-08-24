package interviewPrep;

public class Sum {
    public static void main(String[] args) {
       /* ArraySumToZero(1) ->{0}
        ArraySumToZero(2) ->{-1,1} {-2,2}, {3,-3}
        ArraySumToZero(4) ->{2,-2,3,-3}*/
        // ArraySumToZero(3) => 0
        // Create an array of size N in such a way that when all the elements from that array are added to together the result is 0
        arraySumToZero(4);

        String str = "1354fjkdfjdf33@##";
        int counter = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)){
                counter++;
            }
        }
        System.out.println(counter);


    }

    public static int[] arraySumToZero(int N) {


        if (N == 1) {
            int[] arr = {0};
            return arr;
        }
        int[] arr;
        if (N % 2 == 0) {
            arr = new int[N];
            int number = N;
            boolean cond = true;
            for (int i = 0; i < N; i++) {
                if (cond == true) {
                    arr[i] = number;
                    cond = false;
                } else {
                    arr[i] = -1 * number;
                    cond = true;
                    number--;
                }

            }
        } else {
            return null;
        }
        return arr;
    }

}
