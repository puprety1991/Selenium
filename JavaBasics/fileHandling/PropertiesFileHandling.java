package com.syntax.JavaBasics.fileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileHandling {
    public static void main(String[] args) throws IOException {
       // String path = "/Users/puskaruprety/eclipse-workspace/SeleniumTest/src/com/syntax/util/ConfigData.properties";
        String baseAddress = System.getProperty("user.dir")+"/"+"src"+"/"+"com"+"/"+"syntax"+"/"+"util"+"/"+"ConfigData.properties";

        FileInputStream reader = new FileInputStream(baseAddress);
        Properties properties = new Properties();
        properties.load(reader);
        String username = properties.getProperty("Username");
        System.out.println(username);

        FileOutputStream write = new FileOutputStream(baseAddress);
        properties.setProperty("phoneNumber","12345");
        properties.store(write,"Adding phone number");



    }
}
