/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS 
HW81 -- Thank You, Next
2022-03-24
time spent: 0.4 hrs

 * class ItrWork
 *  SKELETON
 * Facilitates familiarization with iterators

    DISCO
    Iterator can be given a type.
    Iterators and for each loops are very similar.
    You need to be careful to not .next too many times.

    QCC
    Why do iterators exist?
    Are we going to write our own iterator?

    SUMMARY THE FIRST:
    Iterator is an interface with 3 methods. It can be applied to multiple classes such as maps, sets, and lists. 
    The first method is hasNext.

    SUMMARY THE SECOND:

**/




import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class ItrWork
{

  //using FOREACH loop
  //returns a boolean to indicate whether key is present in L
  public static boolean foundA( Integer key,
                                List<Integer> L )
  {
    for (int i : L) {
        if (i == key) {
            return true;
        }
    }
    return false;
  }

  //explicitly using an iterator
  //returns a boolean to indicate whether key is present in L
  public static boolean foundB( Integer key,
                                List<Integer> L )
  {
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
        if (it.next() == key) {
            return true;
        }
    }
    return false;
  }

  //using FOREACH loop
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsA( List<Integer> L )
  {
    List<Integer> retList = new ArrayList<Integer> ();
    for (int i : L) {
        if (i % 2 == 1) {
            retList.add(i);
        }     
    }
    return retList;
  }

  //explicitly using an iterator
  //returns a list containing the odd numbers in L
  public static List<Integer> oddsB( List<Integer> L )
  {
    List<Integer> retList = new ArrayList<Integer> ();
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
        Integer a = it.next(); 
        if (a % 2 == 1) {
            retList.add(a);
        }
    }
    return retList;
  }


  //explicitly using an iterator
  //modifies L s.t. it contains no evens
  public static void removeEvens( List<Integer> L )
  {
    Iterator<Integer> it = L.iterator();
    while (it.hasNext()) {
        Integer a = it.next(); 
        if (a % 2 == 0) {
            it.remove();
        }
    }
  }


  public static void main( String [] args )
  {

    //var type: List   obj type: ?
    List<Integer> L = new ArrayList<Integer>();

    for( int i = 0; i < 10; i++)
      L.add(i);


    // TASK: write code to print the contents of L...

    // a) using a FOREACH loop
    for (int i : L) {
        System.out.print(i + " ");
        
    }
    System.out.println("");

    // b) explicitly using an iterator
    Iterator<Integer> i = L.iterator();
    while(i.hasNext()) {
        System.out.print(i.next() + " ");
    }

    System.out.println("\nTesting foundA...");
    System.out.println("9 in L? -> " + foundA(9,L) );
    System.out.println("13 in L? -> " + foundA(13,L) );

    System.out.println("\nTesting foundB...");
    System.out.println("9 in L? -> " + foundB(9,L) );
    System.out.println("13 in L? -> " + foundB(13,L) );

    System.out.println("\nTesting oddsA...");
    List<Integer> A = oddsA(L);
    for( int n : A ) System.out.println(n);

    System.out.println("\nTesting oddsB...");
    List<Integer> B = oddsB(L);
    for( int n : B ) System.out.println(n);

    System.out.println("\nTesting removeEvens...");
    removeEvens(L);
    for( int n : L ) System.out.println(n);
    /*~~~~~~~~~~~~~~~m~o~v~e~~m~e~~d~o~w~n~~~~~~~~~~~~~~
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/

  }//end main

}//end class ItrWork
