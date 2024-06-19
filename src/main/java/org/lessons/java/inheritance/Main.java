package org.lessons.java.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Prodotto prod1 = new Prodotto("name", "brand", 15.00f, 22);

		System.out.println(prod1.getBrand());
		System.out.println(prod1.getPrice());
		System.out.println(prod1.getProductCode());
		System.out.println(prod1.getProductName());
		System.out.println(prod1.getVat());

		prod1.setBrand("brand2");
		prod1.setPrice(222.5f);
		prod1.setProductName("name2");
		prod1.setVat(22);

		System.out.println(prod1.getBrand());
		System.out.println(prod1.getPrice());
		System.out.println(prod1.getProductCode());
		System.out.println(prod1.getProductName());
		System.out.println(prod1.getVat());

	}

}
