package com.lsl.wordtomysql.until;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @ClassName PropertiesUntil
 * @Description TODO
 * @Author lsl
 * @Date 2019/6/5 17:55
 * @Version 1.0
 **/
public class PropertiesUntil {
    public Properties getProperties() throws IOException {
        Properties properties = new Properties();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\yjkCode\\wordtomysql\\src\\main\\resources\\url.properties"));
        properties.load(bufferedReader);
        return properties;
    }
}
