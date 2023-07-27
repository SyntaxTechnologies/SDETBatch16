package sqlClass1;

import utils.DBUtils;

import java.util.List;
import java.util.Map;

public class E4SQL {
    public static void main(String[] args) {

        String query = "select emp_firstname,emp_lastname,emp_birthday from hs_hr_employees;";
        List<Map<String, String>> data = DBUtils.fetch(query);
        Map<String,String> firstRow=data.get(1);
        firstRow.forEach((k,v)-> System.out.println(k+" "+ v));
    }
}
