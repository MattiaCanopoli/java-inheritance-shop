package org.shop.java;

import java.util.Scanner;

import org.lessons.java.inheritance.Prodotto;

public class CarrelloUtils {

	/**
	 * Ask a <strong>question</strong> to user, expecting a certain input
	 * <strong>positiveInput</strong> or <strong>negativeInput</strong>.<br />
	 * Expected input should be displayed in question (i.e. "Continue? (Y/N))<br />
	 * Determines if user input matches <strong>positiveInput</strong> or
	 * <strong>negativeInput</strong>.<br />
	 * Input is converted to lower case to prevent case sensitivity.<br />
	 * Return <strong>true</strong> for <strong>positiveInput</strong>.<br />
	 * Return <strong>false</strong> for <strong>negativeInput</strong>.<br />
	 * If user input does not matches <strong>positiveInput</strong> or
	 * <strong>negativeInput</strong>, informs user of the invalid input and ask for
	 * a valid one, printing valid answer (i.e. "Input is not valid. Type "Y" for
	 * "yes" of "N" for "No") <br />
	 * Keep asking until user provides a valid input.
	 * 
	 * @param question      input question argument will be printed to ask for input
	 * @param positiveInput compared to user input
	 * @param negativeInput compared to user input
	 * @return boolean
	 */
	public static boolean checkInput(String question, String positiveInput, String negativeInput) {

		Scanner scanner = new Scanner(System.in);
		String yesOrNo;
		boolean inputError = false;
		boolean result = false;

		do {
			System.out.println(question);
			yesOrNo = scanner.nextLine().toLowerCase();

			if (yesOrNo.equals(positiveInput.toLowerCase())) {
				result = true;
				inputError = false;

			} else if (yesOrNo.equals(negativeInput.toLowerCase())) {
				result = false;
				inputError = false;

			} else {
				System.out.println("il valore inserito non è valido.\nInserire \"" + positiveInput
						+ "\" per SI oppure \"" + negativeInput + "\" per NO");
				inputError = true;
			}
		} while (inputError);
//		
		return result;
	}

	public static Prodotto[] addToCarrello(Prodotto[] products, Prodotto product) {
		Prodotto[] newProducts = new Prodotto[products.length + 1];
		for (int i = 0; i < products.length; i++) {
			newProducts[i] = products[i];
		}
		newProducts[newProducts.length - 1] = product;
		products = newProducts;
		return products;
	}

}
