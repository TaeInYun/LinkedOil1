package com.linkedoil.vo;

public class WeekAvgOilPriceVO {

		private int no;
		private String week;
		private String  oil_code;
		private double price;
		
		public WeekAvgOilPriceVO() {
			super();
		}
		public WeekAvgOilPriceVO(int no, String week, String oil_code, double price) {
			super();
			this.no = no;
			this.week = week;
			this.oil_code = oil_code;
			this.price = price;
		}
		public int getNo() {
			return no;
		}
		public void setNo(int no) {
			this.no = no;
		}
		public String getWeek() {
			return week;
		}
		public void setWeek(String week) {
			this.week = week;
		}
		public String getOil_code() {
			return oil_code;
		}
		public void setOil_code(String oil_code) {
			this.oil_code = oil_code;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price = price;
		}
		
		
		
}
