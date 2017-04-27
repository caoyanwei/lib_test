/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.sql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yanwei.cyw
 * @version $Id:SqlTemplate.java, v0.1 2017-04-27 14:08 yanwei.cyw Exp $
 */
public class SqlTemplate {
    private String url;
    private String user;
    private String password;

    public SqlTemplate(String url, String user, String password) {
        this.url = url;
        this.user = user;
        this.password = password;
    }

    public void exec(RunSql runSql) {
        Connection conn = null;
        PreparedStatement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url, user, password);

            conn.setAutoCommit(false);
            //STEP 4: Execute a query
            stmt = runSql.statement(conn);
            runSql.exec(stmt);
            conn.commit();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }//end finally try
        }//end try
    }
}
