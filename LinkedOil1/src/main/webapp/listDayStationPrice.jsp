<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script type="text/javascript"  src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<script type="text/javascript">
$(function(){
    $.ajax({url:"listDayStationPriceData.jsp",success:function(data){
       console.log(data);
        arr = data['RESULT']['OIL'];
        $.each(arr, function(index, item){
           var price= item['PRICE'];
           var diff = item['DIFF'];
           var sidocd = item['SIDOCD'];
           var prodcd = item['PRODCD'];
           
           if(sidocd == '00' ){
               switch(prodcd){
        		case  'B034' :
        		 var p= $("<p></p>").html( "����ֹ��� : " + price + " �������� : " +diff );
        			break;
        		case 'B027' :
        			var p= $("<p></p>").html("�ֹ��� : " + price + " �������� : " +diff  );
    				break;
        		case 'D047' :
        			var p= $("<p> </p>").html("���� :"+ price + " �������� : " +diff  );
    				break;
        		case 'C004' :
        			var p= $("<p></p>").html("�ǳ� ���� : "+ price + " �������� : " +diff );
    				break;       				
        	}
          	 }
             
           $("#list").append(p);
        });
    }})      
 });
</script>


</head>
<body>
   <div id="list"></div>
	<table>
		<tr>
			<td>�ֹ���</td>
			<td>����</td>
			<td>LPG</td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>
		<tr>
			<td></td>
			<td></td>
			<td></td>
		</tr>
	</table>
</body>
</html>