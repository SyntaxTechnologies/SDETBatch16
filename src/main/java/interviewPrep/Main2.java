package interviewPrep;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main2 {
    public static void main(String[] args) {

        int[] arr = {12, 12, 7, 8, 8, 7, 7, 7, 7};

        System.out.println(distinctList(arr));
    }

    public static int distinctList(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int number : arr) {
            list.add(number);
        }
        Set<Integer> set = new HashSet<>(list);
        return list.size() - set.size();
    }

}
