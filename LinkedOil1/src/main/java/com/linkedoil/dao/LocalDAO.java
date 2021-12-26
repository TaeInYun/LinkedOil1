package com.linkedoil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.linkedoil.db.ConnectionProvider;
import com.linkedoil.vo.EvStationVO;
import com.linkedoil.vo.LocalVO;

public class LocalDAO {
	
public int insertLocal(LocalVO Local) {
		
		int re = -1;
		String sql="insert into Local(local_code,local_name) values(?,?)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, Local.getLocal_code());
			pstmt.setString(2,Local.getLocal_name());
			re = pstmt.executeUpdate();
			
		
			ConnectionProvider.close(conn, pstmt);
			
		} catch (Exception e1) {
			System.out.println("예외발생:"+e1.getMessage());
		}
		return re;
	}
}
