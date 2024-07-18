package com.example;

import java.util.List;

public class Output {
	private List<Product> list;
	
	public Output(List<Product> list) {
		this.list = list;
	}

	public void print() {
		this.labelPrint();
		for (Product p : this.list) {
			System.out.println(p); // p.toString()
		}	
	}
	private void labelPrint() {
		System.out.println("                     <<제품관리 프로그램>> ");
		System.out.println("----------------------------------------------------------------------------------------");
		System.out.println("\t제품명\t     수량\t\t   판매단가\t   매입단가\t    운송료\t    이익금\t    이익률");
		System.out.println("----------------------------------------------------------------------------------------");
	}

}
