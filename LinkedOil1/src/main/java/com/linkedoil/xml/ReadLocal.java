package com.linkedoil.xml;

import java.net.URLDecoder;
import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import org.w3c.dom.Element;

import org.w3c.dom.Node;

import org.w3c.dom.NodeList;

import com.linkedoil.dao.LocalDAO;
import com.linkedoil.vo.LocalVO;

 

public class ReadLocal {

    //local 정보를 가져오는 메소드 
    private static String getTagValue(String tag, Element ele) {
        NodeList nodeList = ele.getElementsByTagName(tag).item(0).getChildNodes();
        Node nValue = (Node) nodeList.item(0);
        if(nValue == null) {
            return null;
        }
        return nValue.getNodeValue();
    }// getTagValue
    
    
    //충전소 정보읽고 인설트메소드 실행
   public static void main(String[] args) {

    	//서비스키
        String serviceKey = "F211201253";

       // int area =00; //지역 초기값

        try {
            	//open api url	
            	String url="http://www.opinet.co.kr/api/areaCode.do?out=xml&code="+serviceKey+"&area=00";

                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder  = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(url);

                //root tag
                doc.getDocumentElement().normalize();
                System.out.println("Root Element : "+doc.getDocumentElement().getNodeName());

                
                // parsing tag -
                NodeList nodeList = doc.getElementsByTagName("OIL");
                System.out.println("파싱할 리스트 수 : "+ nodeList.getLength());

                for(int temp =0; temp<nodeList.getLength(); temp++) {
                    Node nNode = nodeList.item(temp);
                    if(nNode.getNodeType()==Node.ELEMENT_NODE){
                       
                    	Element element = (Element) nNode;
                    	
                        //VO에 값 담기
                        LocalVO local = new LocalVO();
                        local.setLocal_code(Integer.parseInt(getTagValue("AREA_CD", element))); //충전소아이디
                        local.setLocal_name(getTagValue("AREA_NM", element));  //충전소명
                        
                        
                        //insert메소드
                        LocalDAO dao = new LocalDAO();
                        int re = dao.insertLocal(local);
                    	if(re==1) {
            				System.out.println("레코드 생성 성공");
            			}else {
            				System.out.println("레코드 생성 실패");
            			}
                        
                    }//if

                }//for nodelist

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//main
    
    
    
    
    
}
