package org.lessons.java.inheritance;

public class Prodotto {
	private int productCode;
	private String productName;
	private String brand;
	private float price;
	private int vat;

	public Prodotto(String productName, String brand, float price, int vat) {
		this.productName = productName;
		this.brand = brand;
		this.price = price;
		this.vat = vat;
		this.productCode = Utils.randomCode(99999999, 1);

	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public int getVat() {
		return vat;
	}

	public void setVat(int vat) {
		this.vat = vat;
	}

	public int getProductCode() {
		return productCode;
	}

	public float getVatPrice() {
		float vatPrice = this.price + (this.price * this.vat / 100);
		return vatPrice;

	}

	public void getProductInfo() {
		System.out.println("************************************");
		System.out.println("Brand: " + this.brand);
		System.out.println("Nome prodotto: " + this.productName);
		System.out.println("Codice prodotto: " + this.productCode);
		System.out.println(String.format("Prezzo: %.2f €", this.price));
		System.out.println(String.format("Prezzo + IVA: %.2f €", this.getVatPrice()));

	}

	@Override
	public String toString() {
		String className = this.getClass().getSimpleName();
		String output = ("Tipo prodotto: " + className + "\n" + "Brand: " + this.getBrand() + "\n" + "Nome: "
				+ this.getProductName() + "\n" + "Codice prodotto: " + this.getProductCode() + "\n" + "Prezzo finale: "
				+ String.format("%.2f €", this.getVatPrice()));
		return output;
	}

}
