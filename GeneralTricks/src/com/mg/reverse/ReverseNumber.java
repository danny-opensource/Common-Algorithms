package com.mg.reverse;

public class ReverseNumber {

	private int reverseNumber(int number) {

		// Eg: 12345

		int reverse = 0;
		int rem = 0;
		while (number > 0) {
			rem = number % 10;
			reverse = reverse * 10 + rem;
			number = number / 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		ReverseNumber reverseNum = new ReverseNumber();
		int reversed = reverseNum.reverseNumber(12345);
		System.out.println(reversed);
	}
}
