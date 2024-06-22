package org.shop.java;

import java.util.Scanner;

public class CarrelloUtils {

	/**
	 * determine if the user input is valid. keep asking until user provides a valid
	 * input
	 * 
	 * @param question      String. input question argument will be printed to ask
	 *                      for input
	 * @param positiveInput String. compared to user input
	 * @param negativeInput String. compared to user input
	 * @return boolean
	 */
	public static Boolean verifyInput(String question, String positiveInput, String negativeInput) {

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

}
