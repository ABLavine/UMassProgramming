/*
 * Copyright 2021 Marc Liberatore.
 */

package hamspam;

import java.util.ArrayList;

public class HamSpam {
	private final int hamNumber;
	private final int spamNumber;

	/**
	 * Construct an object that can compute hamspam values for a game of 
	 * Ham and Spam.
	 * 
	 * @param hamNumber the ham number; it must be greater than 1
	 * @param spamNumber the spam number; it must be greater 
	 * than 1 and not equal to the ham number 
	 * if either is invalid, throws an invalidConstructor error.
	 */
	public HamSpam(int hamNumber, int spamNumber) {
		if (!(hamNumber > 1) || !((spamNumber > 1) && (spamNumber != hamNumber))) {
			throw new IllegalArgumentException("hamNumber and/or spamNumber is not valid!");
		}
		this.hamNumber = hamNumber;
		this.spamNumber = spamNumber;
	}
	
	/**
	 * Returns the nth hamspam value (a number, ham, spam, or hamspam) 
	 * for this game of Ham and Spam.
	 * 
	 * For example, getValue(1) returns "1".
	 * 
	 * @param n
	 *            the number to consider; n > 0, n < 0 throws InvalidArgumentException
	 * @return the hamspam value, as a String
	 */
	public String getValue(int n) {
		if (n < 0) {
			throw new IllegalArgumentException("n must be greater than 0!");
		}
		String returnString = ""; // technically I think a hashmap would be faster here, but ehhhh I'm lazy
		if (n % hamNumber == 0) {
			returnString += "ham";
		}
		if (n % spamNumber == 0) {
			returnString += "spam";
		}
		if (returnString == "") {
			returnString = String.valueOf(n);
		}
		return returnString;
	}

	/**
	 * Returns an array of the hamspam values from start to end, inclusive, for
	 * this game of Ham and Spam.
	 * 
	 * For example, if the ham number is 3 and the spam number is 4,
	 * getValues(2,6) should return an array of Strings:
	 * 
	 * {"2", "ham", "spam", "5", "ham"}
	 * 
	 * @param start
	 *            the number to start from; start > 0
	 * @param end
	 *            the number to end at; end >= start
	 * @return the array of hamspam values
	 */
	public String[] getValues(int start, int end) {
		ArrayList<String> returnList = new ArrayList<>();
		for (int i = start; i <= end; i++) {
			returnList.add(getValue(i));
		}
		return returnList.toArray(new String[0]);
        	
	}
}
