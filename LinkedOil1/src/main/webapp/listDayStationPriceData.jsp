<%@page import="java.util.Arrays"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.net.URL"%>
<%@ page language="java" contentType="application/json; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	
	URL url = new URL("https://www.opinet.co.kr/api/avgSidoPrice.do?out=json&code=F211201253");
	InputStream is = url.openStream();
	String str = "";
	
	try{
		int ch ;
		while(( ch = is.read()) != -1){			
			str += (char)ch;
		}
		is.close();
	
	}catch(Exception e){
		System.out.println(e.getMessage());
	}

out.print(str);
%>