package com.linkedoil.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectionProvider {
	public static Connection getConnection() {
		Connection conn = null;
		try {
			String url = "jdbc:oracle:thin:@database-2.ckt1x7xytc2q.ap-northeast-2.rds.amazonaws.com:1521:ORACLE";
			String user = "admin";
			String password = "admin1234";
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
	
	public static void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(rs != null) {
				rs.close();
			}
			if(stmt != null) {
				stmt.close();
			}
			if(conn != null) {
				conn.close();
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
