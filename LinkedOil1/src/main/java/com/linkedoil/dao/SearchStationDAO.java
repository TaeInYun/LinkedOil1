package com.linkedoil.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import com.linkedoil.db.ConnectionProvider;
import com.linkedoil.vo.EvStationVO;
import com.linkedoil.vo.SearchStationVO;

public class SearchStationDAO {
	
	
	//충전소 검색 리스트
	public	ArrayList<SearchStationVO>	searchEvStationList(){
	ArrayList<SearchStationVO> list = new ArrayList<SearchStationVO>();
		
		String sql = "select ev_name, ev_addr from ev_station where ev_addr like '%'|| ?||'%' and oil_code=?";
		try {
			Connection conn = ConnectionProvider.getConnection();
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				//list.add(new EvStationVO(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getInt(5), rs.getString(6), rs.getInt(7), rs.getInt(8)));
			}
		} catch (Exception e) {
			System.out.println("예외발생:"+e.getMessage());
		}
				
		return list;
		
	}
}
