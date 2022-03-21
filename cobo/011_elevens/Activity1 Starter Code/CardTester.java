/**

 * This is a class that tests the Card class.

 */

public class CardTester {



	/**

	 * The main method in this class checks the Card operations for consistency.

	 *	@param args is not used.

	 */

	public static void main(String[] args) {

		Card Oscar = new Card("king", "spades", 13);

		Card Max = new Card("two", "clubs", 2);

		Card Orion = new Card("king", "spades", 13);



		System.out.println(Oscar.rank());

		System.out.println(Oscar.suit());

		System.out.println(Oscar.pointValue());

		System.out.println(Oscar);



		System.out.println(Max.rank());

		System.out.println(Max.suit());

		System.out.println(Max.pointValue());

		System.out.println(Max);



		System.out.println(Orion.rank());

		System.out.println(Orion.suit());

		System.out.println(Orion.pointValue());

		System.out.println(Orion);



		System.out.println("Max is a conformist: " + Max.matches(Oscar));

		System.out.println("Orion is a conformist: " + Orion.matches(Oscar));



	}

}
