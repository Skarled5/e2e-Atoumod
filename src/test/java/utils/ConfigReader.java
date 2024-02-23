package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static  {
        String path = "configuration.properties";
        try {
            FileInputStream fileInputStream = new FileInputStream(path);
            properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load configuration properties.");
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}

// ConfigReader sınıfı, configuration.properties dosyasını okumak ve bu dosyadaki ayarları erişilebilir kılmak için kullanılır.
