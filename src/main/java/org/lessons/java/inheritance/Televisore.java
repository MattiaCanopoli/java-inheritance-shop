package org.lessons.java.inheritance;

public class Televisore extends Prodotto {

	private float displaySize;
	private boolean smart;

	public Televisore(String productName, String brand, float price, int vat) {
		super(productName, brand, price, vat);
		// TODO Auto-generated constructor stub
	}

	/**
	 * constructor for Televisore class
	 * 
	 * @param productName
	 * @param brand
	 * @param price
	 * @param vat
	 * @param displaySize
	 * @param smart
	 */
	public Televisore(String productName, String brand, float price, int vat, float displaySize, boolean smart) {
		super(productName, brand, price, vat);
		this.displaySize = displaySize;
		this.smart = smart;
	}

	public float getDisplaySize() {
		return displaySize;
	}

	public void setDisplaySize(float displaySize) {
		this.displaySize = displaySize;
	}

	public boolean isSmart() {
		return smart;
	}

	public void setSmart(boolean smart) {
		this.smart = smart;
	}

	public void getProductInfo() {
		super.getProductInfo();
		System.out.println(String.format("Dimensione: %.1f\"", this.displaySize));
		if (this.isSmart()) {
			System.out.println("Smart: Yes");
		} else {
			System.out.println("Smart: No");
		}
		System.out.println("************************************");
	}

	public String getTechnology() {
		String tech = "Smart";
		if (!this.isSmart()) {
			tech = "non Smart";
		}
		return tech;

	}

	@Override
	public String toString() {
		String infos = super.toString() + "\n" + "Dimensioni: " + this.getDisplaySize() + "\"" + "\n" + "Tecnologia: "
				+ this.getTechnology();
		return infos;
	}
}
