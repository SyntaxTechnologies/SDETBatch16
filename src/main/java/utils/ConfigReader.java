package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    public static Properties getProperties(String path) {

        Properties properties = null;
        try( FileInputStream fileInputStream = new FileInputStream(path)) {

            properties = new Properties();
            properties.load(fileInputStream);

        } catch (IOException e) {
            System.out.println("Please check the file at the path if it is available " + path);
        }
        return properties;
    }

    public static String getProperty(String key)  {

        Properties properties = getProperties(Constants.CONFIG_READER_PATH);
        String value = properties.getProperty(key);
        return value;
    }
}
