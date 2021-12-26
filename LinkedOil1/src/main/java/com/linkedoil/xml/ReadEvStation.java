package com.linkedoil.xml;

import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.linkedoil.dao.EvChargerDAO;
import com.linkedoil.dao.EvstationDAO;
import com.linkedoil.vo.EvChargerVO;
import com.linkedoil.vo.EvStationVO;



public class ReadEvStation {
	
	static ArrayList<EvStationVO> EvStationlist = new ArrayList<EvStationVO>();
	static ArrayList<EvChargerVO> EvChargerlist = new ArrayList<EvChargerVO>();
	

    //item 정보를 가져오는 메소드 
    private static String getTagValue(String tag, Element ele) {
        NodeList nodeList = ele.getElementsByTagName(tag).item(0).getChildNodes();
        Node nValue = (Node) nodeList.item(0);
        if(nValue == null) {
            return null;
        }
        return nValue.getNodeValue();
    }// getTagValue
    
    public static void main(String[] args) {


   // public static void getEvstationAPI() {

    	//서비스키
        String serviceKey = "8SMqToM5fi5G6orHE75UaxVTf1IC43Yx%2Bn3UG7RnYFaeHYuNyZLr835P6kLf%2FcOPMxQHZFcSBK5z0koBco6XDQ%3D%3D";

        int page =1; //페이지 초기값
    	String []address= {"서울특별시","부산광역시","대구광역시","인천광역시","광주광역시","대전광역시","울산광역시","세종특별자치시","경기도","강원도","충청북도","충청남도","전라북도","전라남도","경상북도","경상남도","제주특별자치도"};
        int i = 0;

        try {
        	
        while(true){	
        	String ppage = Integer.toString(page);
            StringBuilder urlBuilder = new StringBuilder("http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList"); /*URL*/
            urlBuilder.append("?" + URLEncoder.encode("serviceKey","UTF-8") + "="+serviceKey); /*Service Key*/
            urlBuilder.append("&" + URLEncoder.encode("pageNo","UTF-8") + "=" + URLEncoder.encode(ppage, "UTF-8")); /*페이지번호*/
            urlBuilder.append("&" + URLEncoder.encode("numOfRows","UTF-8") + "=" + URLEncoder.encode("30", "UTF-8")); /*한 페이지 결과 수*/
            urlBuilder.append("&" + URLEncoder.encode("addr","UTF-8") + "=" + URLEncoder.encode(address[i], "UTF-8")); /*검색대상 충전소주소*/	
            String url = urlBuilder.toString();
            
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder  = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(url);
            
            //root tag
            doc.getDocumentElement().normalize();
            System.out.println("Root Element : "+doc.getDocumentElement().getNodeName());

         // parsing tag
            NodeList nodeList = doc.getElementsByTagName("item");
            System.out.println("파싱할 리스트 수 : "+ nodeList.getLength());

            
            for(int temp =0; temp<nodeList.getLength(); temp++) {
                Node nNode = nodeList.item(temp);
                
                if(nNode.getNodeType()==Node.ELEMENT_NODE){
                Element element = (Element) nNode;
                
              //충전소VO
                EvStationVO e = new EvStationVO();
                e.setEv_id(Integer.parseInt(getTagValue("csId", element))); //충전소아이디
                e.setEv_name(getTagValue("csNm", element));  //충전소명
                e.setEv_addr(getTagValue("addr", element)); //충전소 주소
                e.setEv_x(Double.parseDouble(getTagValue("lat", element)));  //위도
                e.setEv_y(Double.parseDouble(getTagValue("longi", element)));  //경도
                EvStationlist.add(e);
                for(EvStationVO ev :  EvStationlist) {
                System.out.println(ev);
                }
               

                	
             //충전기VO
                EvChargerVO evcharger = new EvChargerVO();
        		evcharger.setCharger_id(Integer.parseInt(getTagValue("cpId", element))); //충전기id
        		evcharger.setCharger_name(getTagValue("cpNm", element));  //충전기이름
        		evcharger.setCharger_type(Integer.parseInt(getTagValue("chargeTp", element))); //타입
        		evcharger.setCharger_status_code(Integer.parseInt(getTagValue("cpStat", element))); //상태
        		evcharger.setCharger_method_no(Integer.parseInt(getTagValue("cpTp", element))); //방식
        		evcharger.setCharger_time_renuewal(getTagValue("statUpdateDatetime", element));//갱신날짜
        		evcharger.setEv_id(Integer.parseInt(getTagValue("csId", element))); //충전소id
        		EvChargerlist.add(evcharger);
	            
                }
            }//for
                page += 1;
	           if(page >5) {
	              i+=i;
	             page=1;
	           }
	           
               if(i>address.length) {
            	   break;
               }
        }//while
        

        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
    }//main
}


