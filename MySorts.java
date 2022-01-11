
import java.util.ArrayList;

public class MySorts
{

  //~~~~~~~~~~~~~~~~~~~ HELPER METHODS ~~~~~~~~~~~~~~~~~~~
  //precond: lo < hi && size > 0
  //postcond: returns an ArrayList of random integers
  //          from lo to hi, inclusive

  public static ArrayList populate( int size, int lo, int hi )
  {
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
    for( int i = al.size()-1; i > 0; i-- ) {
      //pick an index at random
      randomIndex = (int)( (i+1) * Math.random() );
      //swap the values at position i and randomIndex
      al.set( i, al.set( randomIndex, al.get(i) ) );
    }
  }
  //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // VOID version of SelectionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
// finds the largest eleemtn in a lsist and moves that to the furtherst right position, then the next largest to the furtherest rightr -1, etc.
  public static void selectionSort( ArrayList<Comparable> data )
  {
    //note: this version places greatest value at "rightmost" end

    //maxPos will point to position of SELECTION (greatest value)
    int maxPos = data.size() -1;
    int pass = data.size() -1 ;
    boolean change = false;
    int counter = 0;
    int counterC = 0;
    int counterP = 0;

    for( Comparable x: data ) {
     // System.out.println( "\nbegin pass " + (data.size()-pass) );//diag // doing loops


      for( int i = 0; i <= pass ; i ++ ) {
		if( (int)data.get(maxPos)  <  (int)(data.get(i))){
			maxPos = i;
		        change = true;
	                counterC ++;
        }
	}
	if(change == true){
	Comparable Posmax = data.get(maxPos) ;
	data.set(maxPos , data.get(pass));
        data.set(pass , Posmax);
	counter ++;
        }
	change = false;
	//System.out.println( "maxPos: " + maxPos );//diag // finding max
        //System.out.println( data );//diag
	pass = pass - 1;
	maxPos = pass;
	counterP ++;
      }


      //System.out.println( "after swap: " +  data );//diag
      //System.out.println("\nSwaps: " + counter + "\nComparisons: " + counterC + "\nPasses: " + counterP );
  }//end selectionSort
  
   // VOID version of InsertionSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
 // starts odff with a one size list, then adds one and compares it to the closes t left element, swasp if it is smalleler, repeeats thisu untiul list is compleete
  public static void insertionSort( ArrayList<Comparable> data )
  {
int counter = 0;
int counterC = 0;
int counterP = 0;

    for(int partition = 1; partition < data.size(); partition ++  ) {
      //partition marks first item in unsorted region
	counterP ++;
      //System.out.println( "\npartition: " + partition + "\tdataset:"); //diag
      //System.out.println( data );
       
      //traverse sorted region from right to left
      for( int i = partition; i > 0 ; i-- ) { // for styatement to contiunue swap for the number of partitions (size)
        counterC ++;
        // "walk" the current item to where it belongs
        // by swapping adjacent items
        if ( data.get(i).compareTo(data.get(i-1)) < 0  ) {  //bigger or smaller question

          //System.out.println( "swap indices "+(i-1)+" & "+i+"..." ); //diag
          Comparable sorting = data.get(i);
	  data.set(i , data.get(i-1));    //swaps them here
	  data.set(i-1, sorting);
	  counter ++;
        }
        else
          break;

      }
 }
    //  System.out.println("\nSwaps: " + counter + "\nComparisons: " + counterC + "\nPasses: " + counterP );

}//end insertionSortV
  
   // VOID version of bubbleSort
  // Rearranges elements of input ArrayList
  // postcondition: data's elements sorted in ascending order
  // goes down the lsit , coimpares tow elemtns it has and if one is larger, it swaps it, if not it moves on to one further and repeats
   public static void bubbleSort( ArrayList<Comparable> data )
  {
int counter = 0;
int counterP = 0;
int counterC = 0;
    for (int passNum = 0; passNum < data.size() - 1; passNum++) {
     counterP++;
      for (int index = data.size() - 1; index > passNum; index--) {
        Comparable previous = data.get(index - 1);
	Comparable current = data.get(index);
        int comparison = previous.compareTo(current);
        counterC ++;
        if (comparison > 0) {
          data.set(index, previous);
	  data.set(index - 1, current);
	counter ++;
	}
      }
    }
  //    System.out.println("\nSwaps: " + counter + "\nComparisons: " + counterC + "\nPasses: " + counterP );

  } // end counter

}// end all
