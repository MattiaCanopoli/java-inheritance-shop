package org.lessons.java.inheritance;

public class Smartphone extends Prodotto {

	private long imei;
	private int memoryGB;

	public Smartphone(String productName, String brand, float price, int vat) {
		super(productName, brand, price, vat);
		// TODO Auto-generated constructor stub
	}

	/**
	 * Costruttore per Smartphone. richiede i parametri: String productName, String
	 * brand, float price, int vat, int ramGB
	 * 
	 * @param productName
	 * @param brand
	 * @param price
	 * @param vat
	 * @param memoryGB
	 */
	public Smartphone(String productName, String brand, float price, int vat, int memoryGB) {
		super(productName, brand, price, vat);
		this.memoryGB = memoryGB;
		this.imei = Utils.randomCode(999999999999999l, 111111111111111l);
	}

	public long getImei() {
		return imei;
	}

//	private void setImei(long imei) {
//		this.imei = imei;
//	}

	public int getMemory() {
		return this.memoryGB;
	}

	public void setMemoryGB(int memoryGB) {
		this.memoryGB = memoryGB;
	}

	public void getProductInfo() {
		super.getProductInfo();
		System.out.println("Codice IMEI: " + this.imei);
		System.out.println("RAM: " + this.memoryGB + "GB");
		System.out.println("************************************");

	}

	@Override
	public String toString() {
		String infos = super.toString() + "\n" + "Memoria: " + this.getMemory() + "GB" + "\n" + "IMEI: "
				+ this.getImei();
		return infos;
	}

}
