package com.example;

public class Product {
	private String name; // setter 없어도됨
	private int qauntity; // setter 없어도됨
	private int sellprice; // setter 없어도됨
	private int buyprice; // setter 없어도됨
	private int transport; // 운송료. // setter 없어도됨
	
	private int benefit; // 이익금. 생성자에 없어도 된다. 계산해서 들어가기 때문.
	private double rate; // 이익률. 생성자에 없어도 된다. 계산해서 들어가기 때문.
	
	public Product(String name, int qauntity, int sellprice, int buyprice, int transport) {
		super();
		this.name = name;
		this.qauntity = qauntity;
		this.sellprice = sellprice;
		this.buyprice = buyprice;
		this.transport = transport;
	}

	public int getBenefit() {
		return benefit;
	}

	public void setBenefit(int benefit) {
		this.benefit = benefit;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public String getName() {
		return name;
	}

	public int getQauntity() {
		return qauntity;
	}

	public int getSellprice() {
		return sellprice;
	}

	public int getBuyprice() {
		return buyprice;
	}

	public int getTransport() {
		return transport;
	}

	@Override
	public String toString() {
		return String.format(
				"%12s\t %,7d\t %,7d\t %,7d\t %,7d\t %,10d\t %7.2f", name,
				qauntity, sellprice, buyprice, transport, benefit, rate);
	}
	
	
}
