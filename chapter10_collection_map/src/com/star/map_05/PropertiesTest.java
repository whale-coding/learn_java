package com.star.map_05;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @Classname: PropertiesTest
 * @Date: 2024/3/21 23:14
 * @Author: 聂建强
 * @Description: Properties的测试
 */
public class PropertiesTest {
    @Test
    public void test1() throws IOException {
        File file = new File("info.properties");  // 创建文件
        // System.out.println(file.getAbsolutePath());
        FileInputStream fis = new FileInputStream(file);  // 创建文件流

        Properties pros = new Properties();
        pros.load(fis);  // 加载流中的文件中的数据
        // 读取数据
        String name = pros.getProperty("name");
        String password = pros.getProperty("password");

        System.out.println(name + ":" + password);
        // 关闭流
        fis.close();
    }

}
