package org.shop.java;

import java.util.Scanner;

import org.lessons.java.inheritance.Cuffie;
import org.lessons.java.inheritance.Prodotto;
import org.lessons.java.inheritance.Smartphone;
import org.lessons.java.inheritance.Televisore;

public class Carrello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * creation of a new Scanner variable to get user input
		 */
		Scanner scanner = new Scanner(System.in);
		/**
		 * declaration of standard variables for Prodotto Class, to be used in object
		 * constructor
		 */
		String input;
		String brand;
		String productName;
		float price;
		int vat;

		// declaration of empty array. will be updated with every entry
		Prodotto[] products = new Prodotto[0];

		// newProduct set to true to enter while loop
		boolean newProduct = true;

		while (newProduct) {

			System.out.println("Selezionare il prodotto da inserire:\n" + "1. Smartphone\n" + "2. TV\n" + "3. Cuffie");
			input = scanner.nextLine().toLowerCase();

			System.out.println("Inserisci il brand:");
			brand = scanner.nextLine();

			System.out.println("Inserisci il nome del prodotto:");
			productName = scanner.nextLine();

			System.out.println("Inserisci il prezzo:");
			price = scanner.nextFloat();
			scanner.nextLine();

			System.out.println("Inserisci l'aliquota IVA:");
			vat = scanner.nextInt();
			scanner.nextLine();

			switch (input) {

			case "smartphone":
			case "1":
				// variable declaration for Smartphone Class
				int memory;

				// get memory value from user input
				System.out.println("Inserisci la quantità di memoria in GB:");
				memory = scanner.nextInt();
				scanner.nextLine();

				// creation of new Smartphone instance
				Smartphone smartphone = new Smartphone(productName, brand, price, vat, memory);
				// add smartphone to products array
				products = CarrelloUtils.addToCarrello(products, smartphone);
				// print Object type, name, code, price, memory, IMEI code

				System.out.println("\n" + smartphone.toString());
				break;

			case "tv":
			case "2":
				// variable declaration for Televisore class
				int display;
				boolean smart;

				// ask question to get smart. smart is set to true if "S", to false if "N".
				// keeps asking if user input is different
				String question = "É una smart-TV? (S/N)";
				smart = CarrelloUtils.checkInput(question, "S", "N");
				// get display size from user
				System.out.println("Inserisci la dimensione del display:");
				display = scanner.nextInt();
				scanner.nextLine();
				// creation of a new Televisore instance
				Televisore tv = new Televisore(productName, brand, price, vat, display, smart);
				// add tv to products array
				products = CarrelloUtils.addToCarrello(products, tv);
				// print Object type, name, code, price, display size, technology
				System.out.println("\n" + tv.toString());

				break;

			case "cuffie":
			case "3":
				// variable declaration for Cuffie class
				boolean wifi;
				String color;
				// ask question to get wifi. wifi is set to true if "S", to false if "N".
				// keeps asking if user input is different
				question = "Sono cuffie Wi-Fi? (S/N)";
				wifi = CarrelloUtils.checkInput(question, "S", "N");
				// get color from user input
				System.out.println("Inserisci il colore del prodotto:");
				color = scanner.nextLine();
				// creation of a new Cuffie instance
				Cuffie cuffie = new Cuffie(productName, brand, price, vat, color, wifi);
				// add cuffie to products array
				products = CarrelloUtils.addToCarrello(products, cuffie);
				// print Object type, name, code, price, color, connectivity
				System.out.println("\n" + cuffie.toString());

				break;

			} // switch close

			// ask question to user. newProduct is set to true if "S", to false if "N".
			// keeps asking if user input is different
			// if newProduct is true, restart program and ask for new entry
			String question = "\n" + "Si desidera inserire un nuovo prodotto (S/N)?";
			newProduct = CarrelloUtils.checkInput(question, "S", "N");

		} // while loop close

		scanner.close();

		System.out.println("Inserimento prodotti completato\n");
		System.out.println("Sono stati inseriti " + (products.length) + " prodotti\n");

		for (Prodotto product : products) {
			System.out.println(product.toString() + "\n");
		}

	}

}
