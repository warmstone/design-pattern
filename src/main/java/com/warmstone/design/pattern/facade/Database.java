package com.warmstone.design.pattern.facade;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @author pengshun
 * @date 2022-11-10 20:10
 * @description
 */
public class Database {
    private Database() {}
    public static Properties getProperties(String dbname) {
        String filename = dbname + ".txt";
        Properties properties = new Properties();
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(filename);
            properties.load(fileReader);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return properties;
    }
}
