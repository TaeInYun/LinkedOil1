<%@page import="com.linkedoil.dao.CsvDAO"%>
<%@page import="com.linkedoil.vo.WeekAvgOilPriceVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.linkedoil.dao.CsvDAO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
<%
CsvDAO dao = new CsvDAO();
	ArrayList<WeekAvgOilPriceVO> list = dao.listCsv("주간평균판매가격(고급휘발유,휘발유,경유)");
	
	for(WeekAvgOilPriceVO w : list){
		System.out.println(w.getPremium_gas_price());
	}
%>
</body>
</html>