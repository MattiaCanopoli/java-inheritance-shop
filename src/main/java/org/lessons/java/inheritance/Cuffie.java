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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}

	public String getConnectivity() {

		String connectivity;

		if (wifi) {
			connectivity = "Wi-Fi";
		} else {
			connectivity = "Cavo";
		}

		return connectivity;
	}

	public void getProductInfo() {
		super.getProductInfo();
		System.out.println("Colore: " + this.color);
		System.out.println("Connettività: " + this.getConnectivity());
		System.out.println("************************************");
	}

	@Override
	public String toString() {
		String infos = super.toString() + "\n" + "Colore: " + this.getColor() + "\n" + "Connettività: "
				+ this.getConnectivity();
		return infos;
	}

}
