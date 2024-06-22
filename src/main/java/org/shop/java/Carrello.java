package org.shop.java;

import java.util.Scanner;

import org.lessons.java.inheritance.Smartphone;

public class Carrello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * create a new Scanner variable to get user input
		 */
		Scanner scanner = new Scanner(System.in);
		/**
		 * declare a new String variable named input to store user input, obtained by
		 * scanner
		 */
		String input;
		String brand;
		String productName;
		float price;
		int memory;
		int display;
		boolean smart;
		int vat = 22;

		System.out.println("Inserisci il brand:");
		brand = scanner.nextLine();

		System.out.println("Inserisci il nome del prodotto:");
		productName = scanner.nextLine();

		System.out.println("Inserisci il prezzo:");
		price = scanner.nextFloat();

		System.out.println("Selezionare il prodotto da inserire:\n" + "1. Smartphone\n" + "2. TV\n" + "3. Cuffie");
		input = scanner.nextLine().toLowerCase();

		switch (input) {

		case "smartphone":
		case "1":
			// richiedi argomenti per costruttore Smartphone
			System.out.println("Inserisci la quantità di memoria in GB:");
			memory = scanner.nextInt();
			// crea una nuova istanza per oggetto Smartphone
			Smartphone smartphone = new Smartphone(productName, brand, price, vat, memory);
			smartphone.getProductInfo();

		case "tv":
		case "2":
			String smartOrNot;
			boolean smartError = false;

			while (smartError) {
				System.out.println("É una smart-TV? (S/N");
				smartOrNot = scanner.nextLine().toLowerCase();

				if (smartOrNot.equals("y")) {
					smart = true;
					smartError = false;
				} else if (smartOrNot.equals("n")) {
					smart = false;
					smartError = false;
				} else {
					System.out.println("il valore inserito non è valido");
					smartError = true;
				}
			}

			// richiedi argomenti per costruttore Televisore
			// crea una nuova istanza per oggetto Televisore

		case "cuffie":
		case "3":
			// richiedi argomenti per costruttore Cuffie
			// crea una nuova istanza per oggetto Cuffie

		}

		scanner.close();

	}

}
