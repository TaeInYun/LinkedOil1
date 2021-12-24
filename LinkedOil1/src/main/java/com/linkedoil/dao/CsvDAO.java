package com.linkedoil.dao;

import java.io.BufferedReader;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.linkedoil.vo.WeekAvgOilPriceVO;

public class CsvDAO {
	
	public ArrayList<WeekAvgOilPriceVO> listCsv(String filename){
		 ArrayList<WeekAvgOilPriceVO> list = new ArrayList<WeekAvgOilPriceVO>();
			BufferedReader data = null;
			try {
				data = Files.newBufferedReader(Paths.get("C:\\linkedOil_File\\CSV\\"+filename+".csv"), Charset.forName("UTF-8"));
				String line = "";
				
				while((line = data.readLine())!=null) {
					//CSV 1행을 저장하는 리스트
					
	                List<String> tmpList = new ArrayList<String>();
	                
	                String array[] = line.split(",");
	                //배열에서 리스트 반환
	                tmpList = Arrays.asList(array);
	                
	                String week = tmpList.get(0);
	        		double premium_gas_price = Double.parseDouble(tmpList.get(1));
	        		double gas_price = Double.parseDouble(tmpList.get(2));
	        		double diesel_price = Double.parseDouble(tmpList.get(3));
	        		
	                WeekAvgOilPriceVO vo = new WeekAvgOilPriceVO(week,premium_gas_price,gas_price,diesel_price);
	                
	                list.add(vo);
				}
			} catch (Exception e) {
				System.out.println("예외발생:" + e.getMessage());
			}finally {
				try {
					if(data != null) data.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return list;
	}
}
