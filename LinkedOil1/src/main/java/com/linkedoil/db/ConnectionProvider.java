package com.linkedoil.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class ConnectionProvider {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:XE";
			String user = "";
			String password = "";
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, password);
		}catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
		return conn;
	}
	
	public static void close(Connection conn, Statement stmt) {
		try {

			if(conn != null) {
				conn.close();
			}
			if(stmt != null) {
				stmt.close();
			}
		}catch (Exception e) {
			
		}
	}
	
}
