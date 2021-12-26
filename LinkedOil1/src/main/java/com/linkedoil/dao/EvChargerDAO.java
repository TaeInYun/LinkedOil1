package com.linkedoil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.linkedoil.db.ConnectionProvider;
import com.linkedoil.vo.EvChargerVO;
import com.linkedoil.vo.EvStationVO;
import com.linkedoil.xml.ReadEvStation;

public class EvChargerDAO {
	
	public int insertEvCharger(EvChargerVO evcharger) {
		
		int re = -1;
 		
 			String sql="insert into ev_charger(charger_no,charger_id,charger_method_no,charger_status_code,charger_type,charger_name,charger_time_renuewal,ev_id) "
 					+ "values(select nvl(max(no),0)+1 from ev_charger,?,?,?,?,?,to_date(?),?)";
 			
 			try {
 			Connection conn = ConnectionProvider.getConnection();
 			PreparedStatement pstmt = conn.prepareStatement(sql);
 			pstmt.setInt(1, evcharger.getCharger_id());
 			pstmt.setInt(2,evcharger.getCharger_method_no());
 			pstmt.setInt(3, evcharger.getCharger_status_code());
 			pstmt.setInt(4, evcharger.getCharger_type());
 			pstmt.setString(5, evcharger.getCharger_name());
 			pstmt.setString(6, evcharger.getCharger_time_renuewal());
 			pstmt.setInt(7, evcharger.getEv_id());
 			
 			re = pstmt.executeUpdate();
 		
 			ConnectionProvider.close(conn, pstmt);
 			
	 		} catch (Exception e1) {
	 			System.out.println("예외발생:"+e1.getMessage());
	 		}
 		
 		return re;
	}

	
	
	public int updateEvCharger(EvChargerVO evcharger) {
		int re = -1;
		EvstationDAO dao = new EvstationDAO();
		ArrayList<String> evidlist= dao.selectEvStation();
		
 		for(String ev_id  : evidlist) {
 		String sql="update ev_charger set charger_no=(select max(charger_no)+1 from ev_charger),"
 				+ "charger_id=?,charger_method_no=?,charger_status_code=?,charger_type=?,"
 				+ "charger_name=?,charger_time_renuewal=? where ev_id="+ev_id;
 		try {
 			Connection conn = ConnectionProvider.getConnection();
 			PreparedStatement pstmt = conn.prepareStatement(sql);
 			pstmt.setInt(1, evcharger.getCharger_id());
 			pstmt.setInt(2,evcharger.getCharger_method_no());
 			pstmt.setInt(3, evcharger.getCharger_status_code());
 			pstmt.setInt(4, evcharger.getCharger_type());
 			pstmt.setString(5, evcharger.getCharger_name());
 			pstmt.setString(6, evcharger.getCharger_time_renuewal());
 			
 			int re1 = pstmt.executeUpdate();
 		
 			ConnectionProvider.close(conn, pstmt);
 			
	 		} catch (Exception e1) {
	 			System.out.println("예외발생:"+e1.getMessage());
	 		}
 		}
 		return re;
	}
}
	

