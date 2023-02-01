package com.talentLMS.UI.dataProviders;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
/**
 * @author Nursultan Musakunov
 */
public class ConfigReader {

    private static Properties properties;

    static {
        try {
            String path = "src/main/resources/configuration.properties";
            FileInputStream input = new FileInputStream(path);
            properties = new Properties();
            properties.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key).trim();
    }
}
