
// Clyde "Thluffy" Sinclair
// APCS pd0
// HW51 -- implementing bubblesort
// 2022-01-04t
// time spent:  hrs

/******************************
 * class BubbleSort -- implements bubblesort algorithm (vanilla)
 *
 * ALGO:
 * 
 * DISCO
 *
 * QCC
 * q0: If a pass requires no swaps, what do you know?
 * a0: 
 * q1: After pass p, what do you know?
 * a1: 
 * q2: How many passes are necessary to completely sort?
 * a2: 
 * 
 ******************************/

import java.util.ArrayList;

public class BubbleSort
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond:  lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive
  public static ArrayList populate( int size, int lo, int hi ) {
    ArrayList<Integer> retAL = new ArrayList<Integer>();
    while( size > 0 ) {
      //     offset + rand int on interval [lo,hi]
      retAL.add( lo + (int)( (hi-lo+1) * Math.random() ) );
      size--;
    }
    return retAL;
  }

  //randomly rearrange elements of an ArrayList
  public static void shuffle( ArrayList al )
  {
    int randomIndex;
    //setup for traversal fr right to left
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  public static void bubbleSortV( ArrayList<Comparable> data )
  {
    int size =  data.size();
    int loops = size;
    shuffle(data);
    while (loops >= 0){
        for( int i = (size - 2); i >= 0; i = i - 1){
                if (data.get(i).compareTo(data.get(i+1)) == 1){
                    Comparable val = data.get(i);
                    data.remove(i);
                    data.add(i+1 , val);
                 }
         }

        loops --;
    }
//System.out.println(loops); // if completed all should show -1
  }


  // ArrayList-returning bubbleSort
  // postcondition: order of input ArrayList's elements unchanged
  //                Returns sorted copy of input ArrayList.
  public static ArrayList<Comparable> bubbleSort( ArrayList<Comparable> input )
  {
    int size =  input.size();
    int loops = size;
    shuffle(input);
    while (loops >= 0){
        for( int i = (size - 2); i >= 0; i = i - 1){
                if (input.get(i).compareTo(input.get(i+1)) == 1){
                    Comparable val = input.get(i);
                    input.remove(i);
                    input.add(i+1 , val);
                 }
         }

        loops --;
    }
//System.out.println(loops); // if completed all should show -1
return input;
  }
  


  public static void main( String [] args )
  {

    
      ArrayList mark = new ArrayList<Integer>();
      mark.add(7);
      mark.add(1);
      mark.add(5);
      mark.add(12);
      mark.add(3);
      System.out.println( "ArrayList mark before sorting:\n" + mark );
      bubbleSortV(mark);
      System.out.println( "ArrayList mark after sorting:\n" + mark );
      ArrayList coco = populate( 10, 1, 1000 );
      System.out.println( "ArrayList coco before sorting:\n" + coco );
      bubbleSortV(coco);
      System.out.println( "ArrayList coco after sorting:\n" + coco );
      

    // tests for the non void method
      ArrayList glen = new ArrayList<Integer>();
      glen.add(7);
      glen.add(1);
      glen.add(5);
      glen.add(12);
      glen.add(3);
      System.out.println( "ArrayList glen before sorting:\n" + glen );
      ArrayList glenSorted = bubbleSort( glen );
      System.out.println( "sorted version of ArrayList glen:\n" 
      + glenSorted );
      System.out.println( "ArrayList glen after sorting:\n" + glen );
      ArrayList sally = populate( 10, 1, 1000 );
      System.out.println( "ArrayList sally before sorting:\n" + sally );
      ArrayList sallySorted = bubbleSort( sally );
      System.out.println( "sorted version of ArrayList sally:\n" 
      + sallySorted );
      System.out.println( "ArrayList sally after sorting:\n" + sally );
      //System.out.println( sally ); //not sure why this is here      

  }//end main

}//end class BubbleSort
