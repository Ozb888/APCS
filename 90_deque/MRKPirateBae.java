/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW91 -- Deque the Halls
2022-04-13
time spent: 1 hr
*/
import java.util.Iterator;
import java.util.Stack;
public class MRKPirateBae {
    public static void main(String[] args) {

        // Testing addFirst, addLast, pollFirst, pollLast, peekFirst, and peekLast
        
        QQCC<Integer> perry = new QQCC<Integer>();
        perry.addFirst(1);
        perry.addFirst(2);
        perry.addFirst(3);
        perry.addFirst(4);
        perry.addFirst(5);
        perry.addFirst(6);
        perry.addFirst(7);

        System.out.println(perry); //7654321
        System.out.println(perry.contains(7)); //true
        System.out.println(perry.contains(11)); // false


	    perry.addLast(8);
        System.out.println(perry); //76543218
        System.out.println(perry.peekLast()); //8
        System.out.println(perry.peekFirst()); //7

	    perry.pollFirst();
	    perry.pollLast();
        System.out.println(perry.peekLast()); //1
        System.out.println(perry.peekFirst()); //6

	    System.out.println(perry.pollFirst()); //6
    	System.out.println(perry.pollFirst()); //5
	    System.out.println(perry.pollFirst()); //4
    	System.out.println(perry.pollFirst()); //3
	    System.out.println(perry.pollFirst()); //2

        System.out.println(perry.peekLast()); //1
        System.out.println(perry.peekFirst()); //1

        perry.pollFirst(); //1

    	System.out.println(perry.peekLast()); //null
        System.out.println(perry.peekFirst()); //null

        //testing offerFirst and offerLast

        QQCC<Integer> Verstappen = new QQCC<Integer>();
        Verstappen.offerFirst(1);
        Verstappen.addFirst(2);
        Verstappen.offerFirst(3);
        Verstappen.addFirst(4);

        //testing iterator

        Iterator<Integer> Riccardo = Verstappen.iterator();
        while(Riccardo.hasNext()) {
            System.out.print(Riccardo.next() + ", ");
        }

        // should print out 7654321

        Verstappen.addLast(0);
        Verstappen.offerLast(-1);
        Verstappen.addLast(-2);
        Verstappen.offerLast(-3);
        Verstappen.addLast(-4);

        //testing descendingIterator

        Iterator<Integer> Botas = Verstappen.descendingIterator();
        System.out.println();
        while(Botas.hasNext()) {
            
            System.out.print(Botas.next() + ", ");
        }
        System.out.println();

        //should print out -4 to 4
        //testing addAll with a Stack

        Stack<Integer> Leclerc = new Stack<Integer>();
        Leclerc.push(-5);
        Leclerc.push(-6);
        Leclerc.push(-7);
        Leclerc.push(-8);
        Verstappen.addAll(Leclerc);
        Iterator<Integer> Russell = Verstappen.iterator();
        System.out.println();
        while(Russell.hasNext()) {
            
            System.out.print(Russell.next() + ", ");
        }
        System.out.println();

        //should print out 4 to -8
        //testing remove and removeLastOccurrence

        Verstappen.remove(-8);
        Verstappen.remove(-7);
        Verstappen.remove(-6);
        Verstappen.remove(-5);
        Verstappen.remove(-4);
        Verstappen.remove(-3);
        Verstappen.remove(-2);
        Verstappen.remove(-1);

        System.out.println(Verstappen);

        //should print out 4 to 0;

        Verstappen.addLast(0);
        Verstappen.addLast(0);
        Verstappen.removeLastOccurrence(0);

        System.out.println(Verstappen);

        //should print out 4 to 0 with an extra 0
        //testing contains

        System.out.println(Verstappen.contains(0)); //true
        System.out.println(Verstappen.contains(-1));        //false
    }
}
