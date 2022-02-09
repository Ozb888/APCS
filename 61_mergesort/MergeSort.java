/*
N.O.A.B Oscar Breen Nakib Abedin
APCS pd07
HW61 -- MergeSort
2022-2-8t
time spent: 1.2 hrs

DISCO:
- arrays don't have an in-built feature that lets you add and remove items
- the array's length is immutable
- always check your for loop for index out of bound errors
QCC:
- What is the point of mess?
- Why did we not use ArrayLists instead of Arrays?
*/


/***
  class MergeSort
  Implements mergesort on array of ints.

  Summary of Algorithm:
  1) Split the input collection in half, forming two new collections
  2) If the size of the array is not 1, repeat step 1 on the new collections
  3) Once size is equal to 1, the collection is guaranteed to be sorted. Return the collection back to the distributor.
  4) If a collection is returned to you... create third collection. Compare the first index of each of the two original collections. Place larger value into new collection. If they are equal, put in either.
  5) Remove the value that was place into the new collection from the original collection
  6) Go back to step 4 until one of the original collections are empty. Then append all values from the non-empty collection into the new collection.
  7) Return to distributor
  8) Repeat step 4
  9) If size of the collection returned is equal to the size of the given array, then return the collection as final output.
  ***/

public class MergeSort
{
  /******************************************************
   * int[] merge(int[],int[])
   * Merges two input arrays
   * Precond:  Input arrays are sorted in ascending order
   * Postcond: Input arrays unchanged, and
   * output array sorted in ascending order.
   ******************************************************/
  private static int[] merge( int[] a, int[] b )
  {
    int[] mergeArr = new int[a.length + b.length];
    int counter = 0;
    int aCounter = 0;
    int bCounter = 0;

    while (a.length > aCounter && b.length > bCounter){
      if(a[aCounter] < b[bCounter]){
        mergeArr[counter] = a[aCounter];
        aCounter += 1;
      }else if (a[aCounter] > b[bCounter]){
        mergeArr[counter] = b[bCounter];
        bCounter += 1;
      }else{
        mergeArr[counter] = a[aCounter];
        aCounter += 1;
      }
      counter += 1;
    }
    if(b.length==bCounter){
      for(int e = aCounter; e<a.length ; e++){
        mergeArr[counter] = a[e];
        counter += 1;
    }
    }else{
      for(int x = bCounter; x<b.length ; x++){
        mergeArr[counter] = b[x];
        counter += 1;
    }

  }
  return mergeArr;

  }//end merge()


  /******************************************************
   * int[] sort(int[])
   * Sorts input array using mergesort algorithm
   * Returns sorted version of input array (ascending)
   ******************************************************/
  public static int[] sort( int[] arr )
  {
    if(arr.length == 1){
      return arr;
    }else{
      int mid = arr.length/2;
      int[] arr0 = new int[mid];
      int[] arr1 = new int[arr.length - mid];

      for( int i = 0 ; i<mid; i++ ){
        arr0[i] = arr[i];
      }
      for( int e = 0; e<arr.length-mid; e++ ){
        arr1[e] = arr[e+mid];
      }
      return merge(sort(arr0), sort(arr1));

    }
  }//end sort()



  // -------------------HELPERS-------------------------
  // tester function for exploring how arrays are passed
  // usage: print array, mess(array), print array. Whaddayasee?
  public static void mess( int[] a) {
    for( int i = 0 ; i<a.length; i++ )
      a[i] = 0;
  }



  //helper method for displaying an array
  public static void printArray( int[] a ) {
    System.out.print("[");
    for( int i : a )
      System.out.print( i + ",");
    System.out.println("]");
  }
  //---------------------------------------------------


  //main method for testing
  public static void main( String [] args )
  {
      int[] arr0 = {0};
      int[] arr1 = {1};
      int[] arr2 = {1,2};
      int[] arr3 = {3,4};
      int[] arr4 = {1,2,3,4};
      int[] arr5 = {4,3,2,1};
      int[] arr6 = {9,42,17,63,0,512,23};
      int[] arr7 = {9,42,17,63,0,9,512,23,9};

      // System.out.println("\nTesting mess-with-array method...");
      // printArray( arr3 );
      // mess(arr3);
      // printArray( arr3 );
      //
      // System.out.println("\nMerging arr1 and arr0: ");
      // printArray( merge(arr1,arr0) );

      // System.out.println("\nMerging arr4 and arr6: ");
      // printArray( merge(arr4,arr6) );

      System.out.println("\nSorting arr4-7...");
      printArray( sort( arr4 ) );
      printArray( sort( arr5 ) );
      printArray( sort( arr6 ) );
      printArray( sort( arr7 ) );
      /*
      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*/
  }//end main()

}//end class MergeSort
