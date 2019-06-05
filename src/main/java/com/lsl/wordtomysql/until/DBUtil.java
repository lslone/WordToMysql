package com.lsl.wordtomysql.until;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * @ClassName DBUtil
 * @Description 数据库连接
 * @Author lsl
 * @Version 1.0
 **/
public class DBUtil {
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://192.168.0.202:3306/data?characterEncoding=utf-8";

    static final String USER = "root";
    static final String PASS = "MasterRoot01#";

    /**
     * @Author  lsl
     * @Description mysql具体连接
     * @Date 16:37 2019/6/5
     * @Param []
     * @return java.sql.Connection
     **/
    public static Connection connectDB() {
        Connection conn = null;
        try {
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //System.out.println("创建成功");
        return conn;
    }
}
