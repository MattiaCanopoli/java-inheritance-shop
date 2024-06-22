package org.shop.java;

import java.util.Scanner;

import org.lessons.java.inheritance.Cuffie;
import org.lessons.java.inheritance.Smartphone;
import org.lessons.java.inheritance.Televisore;

public class Carrello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * create a new Scanner variable to get user input
		 */
		Scanner scanner = new Scanner(System.in);
		/**
		 * declares variable to mach instance variables, to be used in costructor
		 */
		String input;
		String brand;
		String productName;
		float price;
		int vat = 22;

		System.out.println("Selezionare il prodotto da inserire:\n" + "1. Smartphone\n" + "2. TV\n" + "3. Cuffie");
		input = scanner.nextLine().toLowerCase();

		System.out.println("Inserisci il brand:");
		brand = scanner.nextLine();

		System.out.println("Inserisci il nome del prodotto:");
		productName = scanner.nextLine();

		System.out.println("Inserisci il prezzo:");
		price = scanner.nextFloat();
		scanner.nextLine();

		switch (input) {

		case "smartphone":
		case "1":
			// variable declaration for Smartphone Class
			int memory;

			// richiedi argomenti per costruttore Smartphone
			System.out.println("Inserisci la quantità di memoria in GB:");
			memory = scanner.nextInt();
			// crea una nuova istanza per oggetto Smartphone
			Smartphone smartphone = new Smartphone(productName, brand, price, vat, memory);
			smartphone.getProductInfo();

			break;

		case "tv":
		case "2":
			// variable declaration for Televisore class
			int display;
			boolean smart;

			String ask = "É una smart-TV? (S/N)";

			smart = CarrelloUtils.verifyInput(ask, "S", "N");

			System.out.println("Inserisci la dimensione del display:");
			display = scanner.nextInt();

			Televisore tv = new Televisore(productName, brand, price, vat, display, smart);
			tv.getProductInfo();

			break;

		case "cuffie":
		case "3":

			boolean wifi;
			String color;

			ask = "Sono cuffie Wi-Fi? (S/N)";
			wifi = CarrelloUtils.verifyInput(ask, "S", "N");

			System.out.println("Inserisci il colore del prodotto:");
			color = scanner.nextLine();

			Cuffie cuffie = new Cuffie(productName, brand, price, vat, color, wifi);
			cuffie.getProductInfo();

			break;

		} // switch close

		scanner.close();

	}

}
