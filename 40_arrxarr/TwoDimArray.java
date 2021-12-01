/******************************
 * class TwoDimArray
 * (skeleton)
 * practice working with 2D arrays
 ******************************/
/*
Oscar Breen - Team 10 Consonants, Ari, Eric
APCS
HW40 -- Demand A Raise -- filling skeleton 
2021-11-30
time spent:  0.5
DISCO: relearned how to use for each loops
	working within multiple dimensions of arrays just requires more loops within loops

QCC  does it go frther? are ther 4D and 5D arrays, is it infinte?
	do more dimensional arrays offer more functionality?
	Is a for each loop better for arrays in general practice
*/

public class TwoDimArray
{
  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOR loop
  public static void print1( int[][] a )
  {
    //Implementation
	String res = "";
	for (int i=0; i < a.length; i++){

	   for(int ii = 0; ii < a[i].length; ii++){
		if (ii == 0){
		   res += a[i][ii];
		}

		else {
		   res += ", " + a[i][ii];
		}
	   }
	       res += "\n";
	}
  
	System.out.println(res);
}

  //postcond: prints each row of 2D int array a on its own line
  //          uses a FOREACH loop
  public static void print2( int[][] a )
  {
    // YOUR IMPLEMENTATION HERE
  int cntr = 0; 
  String res = "";
   

   for (int[] i: a) {
	for(int ii: i){
	    if(cntr ==0){
		res += ii;
	    } else {
		res +=", "+ ii;
	     }
	cntr = cntr +1;
	}

   
   res += "\n";
 }
}


  //postcond: returns sum of all items in 2D int array a
  public static int sum1( int[][] a )
  {
    // YOUR IMPLEMENTATION HERE
 int sum = 0;
	for (int[] i: a){
	   for( int ii: i){
		sum += ii;
	}
       }
      return sum;
  }


  //postcond: returns sum of all items in 2D int array a
  //          * uses helper fxn sumRow
  public static int sum2( int [][] m )
  {
    // YOUR IMPLEMENTATION HERE
 int res = 0;
 for (int i=0; i < m.length; i++){
	res = res + sumRow2(i,m);
 }
return res;
}


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOREACH loop
  public static int sumRow2( int r, int[][] m )
  {
    // YOUR IMPLEMENTATION HERE
 int res = 0;                                                                                                           
   for (int i: m[r]){                                                                                                            
      res = res + i;                                                                                                     
  }
 return res;
}


  //postcond: returns sum of all items on row r of 2D int array a
  //          uses a FOR loop
  public static int sumRow(int r, int[][] a)
  {
    // *** YOUR IMPLEMENTATION HERE ***
    int res = 0; 
  for (int i = 0; i < a[r].length; i++){
	res += a[r][i];
  }
    return res;
}


  public static void main( String [] args )
  {
    
      int [][] m1 = new int[4][2];
      int [][] m2 = { {2,4,6}, {3,5,7} };
      int [][] m3 = { {2}, {4,6}, {1,3,5} };
      print1(m1);
      print1(m2);
      print1(m3);

      print2(m1);
      print2(m2);
      print2(m3);

  System.out.print("testing sum1...\n");
      System.out.println("sum m1 : " + sum1(m1));
      System.out.println("sum m2 : " + sum1(m2));
      System.out.println("sum m3 : " + sum1(m3));
      System.out.print("testing sum2...\n");
      System.out.println("sum m1 : " + sum2(m1));
      System.out.println("sum m2 : " + sum2(m2));
      System.out.println("sum m3 : " + sum2(m3));
      

    // your own custom test cases welcomed and encouraged
  }

}//end class TwoDimArray
