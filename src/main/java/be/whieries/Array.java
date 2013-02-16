package be.whieries;

import aos.console.AosConsole;

public class Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] ints = { 1, 263, 354, 4, 5, 685, 7 };
		AosConsole.println("____________________");
		for (int i = ints.length - 1; i > 0; i--) {
			AosConsole.print("! " + ints[i] + " ");
		}
		AosConsole.println("!");
		AosConsole.println("____________________");

	}

}
