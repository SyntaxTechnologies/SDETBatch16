package class30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class E11Maps {
    public static void main(String[] args) {
        Map<String,String> info=new HashMap<>();
        info.put("Moncef","Morocco");

        Map<String , List<String>> moreInfo=new HashMap<>();

        List<String> moncefCities=new ArrayList<>();
        moncefCities.add("Rabat");
        moncefCities.add("Chefchaoun");
        moncefCities.add("AL Hoceima");
        moncefCities.add("MARRAkech");

        List<String> halimaCities=new ArrayList<>();
        halimaCities.add("Framkfurt");
        halimaCities.add("Dubai");
        halimaCities.add("Makkah");

        moreInfo.put("Halima",halimaCities);
        moreInfo.put("Moncef",moncefCities);
        System.out.println(moreInfo);
        // break till 1:56

    }
}
