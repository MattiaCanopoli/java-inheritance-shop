package org.lessons.java.inheritance;

public class Smartphone extends Prodotto {

	private long imei;
	private int ramGB;

	public Smartphone(String productName, String brand, float price, int vat) {
		super(productName, brand, price, vat);
		// TODO Auto-generated constructor stub
	}

	public Smartphone(String productName, String brand, float price, int vat, int ramGB) {
		super(productName, brand, price, vat);
		this.ramGB = ramGB;
		this.imei = Utils.randomCode(999999999999999l, 111111111111111l);
	}

	public long getImei() {
		return imei;
	}

//	private void setImei(long imei) {
//		this.imei = imei;
//	}

	public int getRamGB() {
		return ramGB;
	}

	public void setRamGB(int ramGB) {
		this.ramGB = ramGB;
	}

	public void getProductInfo() {
		super.getProductInfo();
		System.out.println("Codice IMEI: " + this.imei);
		System.out.println("RAM: " + this.ramGB + "GB");
		System.out.println("************************************");

	}

}
