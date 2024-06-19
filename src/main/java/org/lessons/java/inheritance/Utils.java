package org.lessons.java.inheritance;

import java.util.Random;

public class Utils {

	// given a min and a max value, return a random number
	public static int randomCode(int max, int min) {

		Random rnd = new Random();
		int randomNumber = rnd.nextInt(max - min) + min;
		return randomNumber;
	}

	// given an int, return the lenght
	public static int getIntLenght(int number) {
		int intLenght = String.valueOf(number).length();
		return intLenght;
	}

	// given a char and an int, return a string of the char repeated int times
	public static String repeatChar(char charToRepeat, int repetitions) {

		String repeatedChars = "";

		for (int i = 0; i < repetitions; i++) {
			repeatedChars += charToRepeat;
		}

		return repeatedChars;
	}

}
