import java.util.Scanner;
/**
 * Starts the Celebrity Game application
 * @author cody.henrichsen
 *
 */
public class CelebrityRunner
{
	/**
	 * The entry point of the Java application.
	 * @param args Unused parameter as it is a GUI based program.
	 */
	public static void main(String [] args)
	{
		CelebrityGame game = new CelebrityGame();
		game.prepareGame();

		System.out.println("Welcome player ");
		while(true) {
		Scanner sc = new Scanner(System.in);
		boolean maybe = true;
		System.out.print("No names, ");
		while ( maybe) {
			System.out.println("add a name");
			String newname = sc.nextLine();
			System.out.println("Add a clue");
			String newclue = sc.nextLine();
			game.addCelebrity(newname, newclue, "no");
			System.out.println("Add more? (y/n)");
			String may = sc.nextLine();
			maybe = may.equals("y");
		}

		while(game.getCelebrityGameSize() != 0) {
		game.play();
		System.out.println("clue: " + (game.sendClue()));
		boolean check = false;
		while (!check) {
			String guess = sc.nextLine();
			check = game.processGuess(guess);
			if (check) {
				System.out.println("Nice");
			}
			else {
				System.out.println("Nope");
			}
		}
		}
		System.out.print("No Names, ");
		}
	}
}
