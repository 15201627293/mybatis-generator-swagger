package com.zzg.mybatis.generator.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by Owen on 8/21/16.
 */
public class ConnectionManager {

    private static final String DB_URL = "jdbc:mysql://192.168.10.122:3306/bqxny?autoReconnect=true&useUnicode=true&characterEncoding=utf8&serverTimezone=Asia/Shanghai";

    public static Connection getConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection(DB_URL,"xinnengyuan","bq@xny2019");
        return conn;
    }
}
