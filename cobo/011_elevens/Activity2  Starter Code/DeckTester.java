/**
 * This is a class that tests the Deck class.
 */
public class DeckTester {

	/**
	 * The main method in this class checks the Deck operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
	   String[] ranks = {"jack", "queen", "king"};
		 String[] suits = {"hearts", "clubs", "spades"};
		 int[] pointValues = {11, 12, 13};
		 Deck deck1 = new Deck(ranks, suits, pointValues);
		 deck1.deal();
		 deck1.deal();
		 deck1.deal();
		 deck1.deal();
		 deck1.deal();
		 deck1.deal();
		 System.out.println(deck1);
	}
}
