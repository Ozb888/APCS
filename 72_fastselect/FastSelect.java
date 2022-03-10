//Oscar breen , Max Schneider, Perry Huang
//APCS
//HW72 -- So So Fast -- algo to find nth smallest of an array
//2022-03-08
//time spent: 0.4
/*
 ALGO
  Partition array
	repeat n times with linear 1 increasing c value
  BCS:
   looking for smallest value Big O(n) -- only completes one operation once

  WCS
   looking for nth smallest of an n sized array Big (On^2)-- completes one operation on every element of the array 
                                                              inside a for loop

DISCO
   Partition is useful

QCC
   do we rly havce to use parititon

*/
public class FastSelect
{
  //--------------v  HELPER METHODS  v--------------
  //swap values at indices x, y in array o
  public static void swap( int x, int y, int[] o )
  {
    int tmp = o[x];
    o[x] = o[y];
    o[y] = tmp;
  }

  //print input array
  public static void printArr( int[] a )
  {
    for ( int o : a )
      System.out.print( o + " " );
    System.out.println();
  }

  //shuffle elements of input array
  public static void shuffle( int[] d )
  {
    int tmp;
    int swapPos;
    for( int i = 0; i < d.length; i++ ) {
      tmp = d[i];
      swapPos = i + (int)( (d.length - i) * Math.random() );
      swap( i, swapPos, d );
    }
  }

  //return int array of size s, with each element fr range [0,maxVal)
  public static int[] buildArray( int s, int maxVal )
  {
    int[] retArr = new int[s];
    for( int i = 0; i < retArr.length; i++ )
      retArr[i] = (int)( maxVal * Math.random() );
    return retArr;
  }
  //--------------^  HELPER METHODS  ^--------------


  /**
   * int Partition(int[],int,int,int)
   * DESCRIP
   * chooses an element as a "center" (don't know actual terminology), and works around that
    moves that center to index b, and then partitions subarray between indicies a and b-1
    into 2 parts: the part that consists of elemets that are smaller than the center element
    (on the left) and the part that consists of elements that are at least as large as the
    center element (on the right). Then, puts the center element between the 2 parts.
   * @param arr
   * @param a
   * @param b
   * @param c
   * @return int
   *
   */
  public static int Partition( int arr[], int a, int b, int c)
  {
    /** Copy and Pasted for convenience
    * algo as pseudocode:
    * ------------------------------
    *     v = arr[c]
    *     swap arr[c], arr[b]
    *     s = a
    *     for i in [a..b-1]
    *         if arr[i] < v
    *             swap arr[s], arr[i]
    *             s+=1
    *     swap arr[b], arr[s]
    */
    int v = arr[c]; // CHOOSE THE CENTER ELEMENT
    swap(c,b,arr); // SWAP CENTER ELEMENT TO END OF SUBARRAY
    int s=a;
    for(int i = a; i < b; i++) { //PERFORM SWAPS UNTIL THE ARRAY IS PARTITIONED INTO THE AFOREMENTIONED PARTS
      if (arr[i] < v) {
        swap(s,i,arr);
        s+=1; // MOVES THE LINE OF DIVISION BETWEEN THE TWO PARTS OF THE SUBARRAY
      }
    }
    swap(b,s,arr); // PLACES CENTER ELEMENT AT THE END OF THE FIRST PART OF THE SUBARRAY
    return arr[s];
  }//end Partition



  //finds the nth smallest value of the array
 public static int FastSelect(int[] arr, int n)
 {
 if( arr.length == 1)
     return arr[0];
int res = 0;
   for( int test = 0; test < n; test++){
	Partition(arr, 0, (arr.length - 1), test);
         
	res = arr[test];
   }
  return res;
 } // end FastSelect


  //main method for testing
  public static void main( String[] args )
  {


    //init test arrays of magic numbers
    int[] arr1 = {8,21,17,69,343};
    int[] arr3 = {1,28,33,4982,37};
    int[] arr4 = {17,4,5,9000,6};
    int[] arr5 = {3,0,16,599,1024};
    int[] arr6 = {7,1,5,12,3};
    int[] arr7 = {900, 800 , 700, 600 , 500};
    int[] arr8 = {2};
    int[] arr9 = { 2,7,56,54,32,5,3, 67, 76, 1 , 26 , 45};
    /**
    System.out.println("arr6: ");
    printArr(arr6);
    Partition(arr6,0,4,2);
    System.out.println("after Partition w/ a=0,b=4,c="
    + 2 +"...");
    printArr(arr6);
    System.out.println("-----------------------");
    */



  // Fast select testing

    System.out.println(" third smallest arr4; ");
    printArr(arr4);
    System.out.println(""+FastSelect(arr4,3));
    System.out.println("-----------------------");


    System.out.println(" second smallest arr1: ");
    printArr(arr1);
    System.out.println(""+FastSelect(arr1,2));
    System.out.println("-----------------------");

    System.out.println(" third smallest arr3: ");
    printArr(arr3);
    System.out.println(""+FastSelect(arr3,3));
    System.out.println("-----------------------");

    System.out.println(" WCS arr7: ");
    printArr(arr7);
    System.out.println(""+FastSelect(arr7,5));
    System.out.println("-----------------------");

    System.out.println(" BCS arr8: ");
    printArr(arr8);
    System.out.println(""+FastSelect(arr8,1));
    System.out.println("-----------------------");

    System.out.println("arr9: ");
    printArr(arr9);
    System.out.println(""+FastSelect(arr9,5));
    System.out.println("-----------------------");



/*
    // run Partition on each array,
    // holding a & b fixed, varying c...
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr1: ");
    printArr(arr1);
    Partition(arr1,0,4,testC);
    System.out.println("after Partition w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr1);
    System.out.println("-----------------------");
   }
    // Where be arr2?
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr3:");
    printArr(arr3);
    Partition(arr3,0,4,testC);
    System.out.println("after Partition w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr3);
    System.out.println("-----------------------");
   }
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr4:");
    printArr(arr4);
    Partition(arr4,0,4,testC);
    System.out.println("after Partition w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr4);
    System.out.println("-----------------------");
   }
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr6:");
    printArr(arr6);
    Partition(arr6,0,4,testC);
    System.out.println("after Partition w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr6);
    System.out.println("-----------------------");
   }
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr5:");
    printArr(arr5);
    Partition(arr5,0,4,testC);
    System.out.println("after Partition w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr5);
    System.out.println("-----------------------");
   }
    for( int testC = 0; testC < 5; testC++ ) {
    System.out.println("arr7:");
    printArr(arr7);
    Partition(arr7,0,4,testC);
    System.out.println("after Partition w/ a=0,b=4,c="
    + testC +"...");
    printArr(arr7);
    System.out.println("-----------------------");

    }
    /*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main

}//end class Partition
