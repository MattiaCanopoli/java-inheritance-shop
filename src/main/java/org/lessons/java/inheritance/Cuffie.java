package org.lessons.java.inheritance;

public class Cuffie extends Prodotto {

	String color;
	boolean wifi;

	public Cuffie(String productName, String brand, float price, int vat) {
		super(productName, brand, price, vat);
		// TODO Auto-generated constructor stub
	}

	public Cuffie(String productName, String brand, float price, int vat, String color, boolean wifi) {
		super(productName, brand, price, vat);
		this.color = color;
		this.wifi = wifi;
	}

}
