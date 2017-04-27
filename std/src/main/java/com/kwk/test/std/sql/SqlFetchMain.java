/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * jvm 参数: -Xms16m -Xmx18m -Xmn16m
 *
 * @author yanwei.cyw
 * @version $Id:SqlFectchMain.java, v0.1 2017-04-27 14:41 yanwei.cyw Exp $
 */
public class SqlFetchMain {
    public static void main(String[] args) {
        String user = "root";
        String password = args[0];
        String url = "jdbc:mysql://localhost/test";
        SqlTemplate template = new SqlTemplate(url, user, password);
        template.exec(new RunSql() {
            @Override
            public PreparedStatement genStatement(Connection conn) throws SQLException {
                //return conn.prepareStatement(getPreparedSql());
                //不这样设置会内存溢出
                PreparedStatement pstmt = conn.prepareStatement("select * from test1", ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                pstmt.setFetchSize(Integer.MIN_VALUE);
                return pstmt;
            }

            @Override
            public void runSql(PreparedStatement ps) throws SQLException {
                ResultSet resultSet = null;
                int count = 0;
                resultSet = ps.executeQuery();
                while (resultSet.next()) {
                    ++count;
                }

                System.out.println(count);
            }
        });
    }
}
