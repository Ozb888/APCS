/*
Oscar Breen
APCS
HW23 -- What Does Equality Look Like? -- simulating coin flip with bias
2021-10-25
time spent: 1 hr
*/

import java.util.Random;

public class Coin {

	int value, flipCount, headsCount, tailsCount;
	double bias;
	String name, upFace;

	public Coin() {
		bias = 0.5;
		upFace = "heads";
	}

	public Coin(String denomination) {
		bias = 0.5;
		upFace = "heads";

		if (denomination == "penny" || denomination == "nickel" || denomination == "dime" || denomination == "quarter" || denomination == "dollar" || denomination == "tiffany") {
			name = denomination;
		}

	}

	public Coin(String denomination, String face) {
		bias = 0.5;

		if (face == "heads" || upFace == "tails") {
			upFace = face;
		}

		if (denomination == "penny" || denomination == "nickel" || denomination == "dime" || denomination == "quarter" || denomination == "dollar" || denomination == "tiffany") {
			name = denomination;
		}
	}

	public void flip() {
		Random rand = new Random();
		double flip = rand.nextDouble();
		if (flip > bias) {
			upFace = "tails";
		} else {
			upFace = "heads";
		}

		System.out.println(name + " -- " + upFace);
	}

	public void equals() {
		Coin tiffany = new Coin("tiffany");
		tiffany.flip();

		if (tiffany.upFace == upFace) {
			System.out.println("Match. Firestarter you may be.");
		} else {
			System.out.println("No match. Firestarter you can not be.");
		}
	}

	public void assignValue() {
		if (name == "penny") {
			value = 1;
		} else if (name == "nickel") {
			value = 5;
		} else if (name == "dime") {
			value = 10;
		} else if (name == "quarter") {
			value = 25;
		} else if (name == "dollar") {
			value = 100;
		}
	}
}
