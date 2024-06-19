package org.lessons.java.inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Prodotto prod1 = new Prodotto("name", "brand", 15.00f, 22);
//
//		System.out.println(prod1.getBrand());
//		System.out.println(prod1.getPrice());
//		System.out.println(prod1.getProductCode());
//		System.out.println(prod1.getProductName());
//		System.out.println(prod1.getVat());
//
//		prod1.setBrand("brand2");
//		prod1.setPrice(222.5f);
//		prod1.setProductName("name2");
//		prod1.setVat(22);
//
//		System.out.println(prod1.getBrand());
//		System.out.println(prod1.getPrice());
//		System.out.println(prod1.getProductCode());
//		System.out.println(prod1.getProductName());
//		System.out.println(prod1.getVat());
//
//		Smartphone smart1 = new Smartphone("smart", "samsung", 555f, 22, 32);

//		System.out.println(smart1.getProductCode());
//		System.out.println(smart1.getBrand());
//		System.out.println(smart1.getProductName());
//		System.out.println(smart1.getRamGB());
//		System.out.println(smart1.getImei());

//		smart1.getProductInfo();
//ho ereditato il metodo getProductInfo, ma se volessi espanderlo per la sottoclasse smartphone?

//		Televisore tv = new Televisore("TV1", "LG", 358.99f, 22, 49.3f, true);
//		tv.getProductInfo();

		Cuffie cuffie = new Cuffie("M1070", "Monolith", 444.44f, 22, "Black", false);

		cuffie.getProductInfo();

		cuffie.setPrice(364.30f);

		cuffie.getProductInfo();

	}

}
