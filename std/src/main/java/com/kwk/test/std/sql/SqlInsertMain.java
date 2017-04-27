/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
CREATE TABLE `test1` (
`log_id` bigint(20) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键',
`op_id` int(11) NOT NULL COMMENT '操作人',
`gmt_create` datetime NOT NULL COMMENT '创建时间',
PRIMARY KEY (`log_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

 * @author yanwei.cyw
 * @version $Id:SqlMain.java, v0.1 2017-04-27 11:51 yanwei.cyw Exp $
 */
public class SqlInsertMain {
    public static void main(String[] args) {
        String user = "root";
        String password = args[0];
        String url = "jdbc:mysql://localhost/test";
        SqlTemplate template = new SqlTemplate(url, user, password);
        template.exec(new RunSql() {
            @Override
            public PreparedStatement genStatement(Connection conn) throws SQLException {
                return conn.prepareStatement(getPreparedSql());
            }

            public String getPreparedSql() {
                return "insert into test1(op_id, gmt_create) values (?, now());";
            }

            @Override
            public void runSql(PreparedStatement ps) throws SQLException {
                for(int i = 0; i < 100000; ++i) {
                    ps.setInt(1, i);
                    ps.execute();
                }
            }
        });
    }
}
