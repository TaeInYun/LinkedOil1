package com.linkedoil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.linkedoil.db.ConnectionProvider;

public class OilDAO {
	
	public static void main(String[] args) {
		OilDAO dao = new OilDAO();
		int re = dao.insertOil();
		System.out.println("삽입한 레코드 수:" + re);
	}
	
	public int insertOil() {
		int re = 0;
		String[] oil_code = {"B027", "D047", "B034", "C004", "K015", "E001", "Y000"};
		String[] oil_name = {"휘발유", "경유", "고급휘발유", "실내등유", "자동차부탄", "전기", "요소수"};
		
		String sql = "insert into oil values(?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for(int i = 0; i < oil_code.length; i++) {
				pstmt.setString(1, oil_code[i]);
				pstmt.setString(2, oil_name[i]);
				
				re += pstmt.executeUpdate();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			ConnectionProvider.close(conn, pstmt);
		}
		return re;
	}
}
