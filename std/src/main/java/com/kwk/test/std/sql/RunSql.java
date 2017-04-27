/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2017 All Rights Reserved.
 */
package com.kwk.test.std.sql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author yanwei.cyw
 * @version $Id:RunSql.java, v0.1 2017-04-27 14:10 yanwei.cyw Exp $
 */
public abstract class RunSql {
    public PreparedStatement statement(Connection conn) {
        try {
            return genStatement(conn);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    protected abstract PreparedStatement genStatement(Connection conn) throws SQLException;

    public void exec(PreparedStatement ps) {
        try {
            runSql(ps);
        } catch (Throwable e) {
            throw new IllegalStateException(e);
        }
    }

    public abstract void runSql(PreparedStatement ps) throws SQLException;
}
