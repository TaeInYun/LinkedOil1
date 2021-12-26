package com.linkedoil.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

import com.linkedoil.db.ConnectionProvider;
import com.linkedoil.vo.WeekAvgOilPriceVO;

public class WeekAvgOilPriceDAO {
	
	public static void main(String[] args) {
		/*
		WeekAvgOilPriceDAO dao = new WeekAvgOilPriceDAO();
		int premiumGas = dao.insertWeekAvgPremiumGas();
		int gas = dao.insertWeekAvgGas();
		int diesel = dao.insertWeekAvgDiesel();
		int lpg = dao.insertWeekAvgLpg();
		*/
		//System.out.println("삽입한 고급휘발유 레코드 수:" + premiumGas);
		//System.out.println("삽입한 휘발유 레코드 수:" + gas);
		//System.out.println("삽입한 경유 레코드 수:" + diesel);
		//System.out.println("삽입한 lpg 레코드 수:" + lpg);
	}
	
	//메소드
	
	//레코드가져오기
	
	
	//고급휘발유 주간유가평균 데이터 삽입
	public int insertWeekAvgPremiumGas(){
		CsvDAO dao = new CsvDAO();
		ArrayList<WeekAvgOilPriceVO> csv = dao.loadOilCsv("주간평균판매가격(고급휘발유,휘발유,경유)");
		int re = 0;
		
		String sql = "insert into WeekAvgOilPrice values((select nvl(count(*),0) + 1 from WeekAvgOilPrice), "
					+ "'B034',?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for(WeekAvgOilPriceVO w : csv) {
				pstmt.setString(1, w.getWeek());
				pstmt.setDouble(2, w.getPremium_gas_price());
				re += pstmt.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}finally {
			ConnectionProvider.close(conn, pstmt);
		}
		
		return re;
	}
	
	//휘발유 주간평균유가 데이터 삽입
	public int insertWeekAvgGas(){
		CsvDAO dao = new CsvDAO();
		ArrayList<WeekAvgOilPriceVO> csv = dao.loadOilCsv("주간평균판매가격(고급휘발유,휘발유,경유)");
		int re = 0;
		
		String sql = "insert into WeekAvgOilPrice values((select nvl(count(*),0) + 1 from WeekAvgOilPrice), "
				+ "'B027',?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for(WeekAvgOilPriceVO w : csv) {
				pstmt.setString(1, w.getWeek());
				pstmt.setDouble(2, w.getGas_price());
				re += pstmt.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}finally {
			ConnectionProvider.close(conn, pstmt);
		}
		
		return re;
	}
	
	//경유 주간평균유가 데이터삽입
	public int insertWeekAvgDiesel(){
		CsvDAO dao = new CsvDAO();
		ArrayList<WeekAvgOilPriceVO> csv = dao.loadOilCsv("주간평균판매가격(고급휘발유,휘발유,경유)");
		int re = 0;
		
		String sql = "insert into WeekAvgOilPrice values((select nvl(count(*),0) + 1 from WeekAvgOilPrice), "
				+ "'D047',?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for(WeekAvgOilPriceVO w : csv) {
				pstmt.setString(1, w.getWeek());
				pstmt.setDouble(2, w.getDiesel_price());
				re += pstmt.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}finally {
			ConnectionProvider.close(conn, pstmt);
		}
		
		return re;
	}
	
	//LPG 주간평균유가 데이터삽입
	public int insertWeekAvgLpg(){
		CsvDAO dao = new CsvDAO();
		ArrayList<WeekAvgOilPriceVO> csv = dao.loadLpgCsv("주간평균판매가격(LPG)");
		int re = 0;
		
		String sql = "insert into WeekAvgOilPrice values((select nvl(count(*),0) + 1 from WeekAvgOilPrice), "
				+ "'K015',?,?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = ConnectionProvider.getConnection();
			pstmt = conn.prepareStatement(sql);
			
			for(WeekAvgOilPriceVO w : csv) {
				pstmt.setString(1, w.getWeek());
				pstmt.setDouble(2, w.getLpg_price());
				re += pstmt.executeUpdate();
			}
		} catch (Exception e) {
			System.out.println("예외발생:" + e.getMessage());
		}finally {
			ConnectionProvider.close(conn, pstmt);
		}
		
		return re;
	}
}
