package com.linkedoil.dao;

import java.util.ArrayList;

import com.linkedoil.vo.WeekAvgOilPriceVO;

public class WeekAvgOilPriceDAO {
	
	public ArrayList<WeekAvgOilPriceVO> listWeekAvgpremiumGas(){
		CsvDAO dao = new CsvDAO();
		ArrayList<WeekAvgOilPriceVO> csv = dao.loadCsv("주간평균판매가격(고급휘발유,휘발유,경유)");
		ArrayList<WeekAvgOilPriceVO> list = new ArrayList<WeekAvgOilPriceVO>();
		
		for(WeekAvgOilPriceVO w : list){
			w.getDiesel_price();
		}
		
		
		
		return list;
	}
}
