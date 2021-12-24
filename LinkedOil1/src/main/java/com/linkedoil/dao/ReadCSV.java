package com.linkedoil.dao;

public class ReadCSV {
	public ArrayList<GasStationVO> v(String filename){
		 ArrayList<GasStationVO> ret = new ArrayList<GasStationVO>();
			BufferedReader br = null;
			
			try {
				br = Files.newBufferedReader(Paths.get("C:\\data\\stationPrice.csv"), Charset.forName("UTF-8"));
				String line = "";
				
				while((line = br.readLine())!=null) {
					//CSV 1���� �����ϴ� ����Ʈ
					
	                List<String> tmpList = new ArrayList<String>();
	                String array[] = line.split(",");
	                //�迭���� ����Ʈ ��ȯ
	                tmpList = Arrays.asList(array);
	                GasStationVO vo = new GasStationVO(tmpList.get(0), tmpList.get(1), tmpList.get(2), 
	                		tmpList.get(3),tmpList.get(4),tmpList.get(5), tmpList.get(6));
	                ret.add(vo);
				}
			} catch (Exception e) {
				System.out.println("���ܹ߻�:" + e.getMessage());
			}finally {
				try {
					if(br != null) br.close();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
			return ret;
	}
}
