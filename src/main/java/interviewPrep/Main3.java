package interviewPrep;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main3 {
    public static void main(String[] args) {

            ArrayList<String> words = new ArrayList<>();
            words.add("apple");
            words.add("banana");
            words.add("cherry");
            words.add("apple");
            words.add("banana");
            words.add("apple");


            Map<String, Integer> wordCounts = new HashMap<>();


            for (String word : words) {
                if (wordCounts.containsKey(word)) {
                    int count = wordCounts.get(word);
                    wordCounts.put(word, count + 1);
                } else {
                    wordCounts.put(word, 1);
                }
            }



            for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
                String word = entry.getKey();
                int count = entry.getValue();
                System.out.println(word + ": " + count);
            }
        }
    }

