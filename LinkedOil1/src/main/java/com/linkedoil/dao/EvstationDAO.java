package com.linkedoil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.linkedoil.db.ConnectionProvider;
import com.linkedoil.vo.EvStationVO;
//import com.linkedoil.xml.ReadEvStation;
import com.linkedoil.xml.ReadEvStation;

public class EvstationDAO {
	
	public ArrayList selectEvStation(){
		ArrayList list = new ArrayList();

		String sql = "select ev_id from ev_station";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				 EvStationVO e = new EvStationVO();
				 e.setEv_id(rs.getInt(1));
				 list.add(e);
				}
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
				
		return list;
		
	}
	
	public int insertEvstation(EvStationVO e) {

		
		int re = -1;
		String sql="insert into ev_station(ev_id,ev_name,ev_addr,ev_x,ev_y,oil_code,local_code,mgr_no) values(?,?,?,?,?,'E001',00,1)";
		try {
			Connection conn = ConnectionProvider.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, e.getEv_id());
			pstmt.setString(2,e.getEv_name());
			pstmt.setString(3, e.getEv_addr());
			pstmt.setDouble(4, e.getEv_x());
			pstmt.setDouble(5, e.getEv_y());
			re = pstmt.executeUpdate();
			
			
			ConnectionProvider.close(conn, pstmt);
			
		} catch (Exception e1) {
			System.out.println("예외발생:"+e1.getMessage());
		}
		return re;
	}
	
	

}
