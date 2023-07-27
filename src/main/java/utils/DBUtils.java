package utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DBUtils {

    public static List<Map<String,String>> fetch(String query){

        String dbUrl = ConfigReader.getProperty("dbUrl");
        String dbUserName = ConfigReader.getProperty("dbUserName");
        String dbPassword = ConfigReader.getProperty("dbPassword");
        List<Map<String,String>> mapList= new ArrayList<>();
        try(Connection connection = DriverManager.getConnection(dbUrl, dbUserName, dbPassword);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query)
        ) {
            ResultSetMetaData metaData = resultSet.getMetaData();
            // gives us the no of columns in the resultSet
            int columnCount = metaData.getColumnCount();

            while (resultSet.next()){
                Map<String,String> rowMap=new HashMap<>();
                for (int i = 1; i <=columnCount ; i++) {
                    String key=metaData.getColumnLabel(i);
                    String value=resultSet.getString(i);
                    rowMap.put(key,value);
                }

                mapList.add(rowMap);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return mapList;
    }
}
