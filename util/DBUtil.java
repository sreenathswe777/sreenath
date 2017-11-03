package com.ems.util;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.PooledConnection;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

/**
 * @author Challa
 *
 */
public class DBUtil {
	/**
	 * @return connection
	 */
	public static Connection getConnection() {
		Connection connection = null;
		try {
			// OracleConnectionPoolDataSource ds = new
			// OracleConnectionPoolDataSource();
			MysqlConnectionPoolDataSource ds = new MysqlConnectionPoolDataSource();
			ds.setURL("jdbc:mysql://localhost:3306/emp");
			ds.setUser("root");
			ds.setPassword("");
			PooledConnection pc = ds.getPooledConnection();
			connection = pc.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return connection;
	}
}
/*
 * 1) DriverManager 2) DataSource javax.sql.*
 */

