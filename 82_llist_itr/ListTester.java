public class ListTester{


  //main method for testing
  public static void main( String[] args )
  {
    LList james = new LList();

    System.out.println("initially: " );
	System.out.println("\n" + james);

    james.add("beat");
	System.out.println("\n" + james);

    james.add("a");
	System.out.println("\n" + james); 

    james.add("need");
 	System.out.println("\n" + james);

    james.add("I");
 	System.out.println("\n" + james);

    System.out.println( "2nd item is: " + james.get(1) );

    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );
	System.out.println("\n" + james);

    james.add(0,"whut");
    System.out.println( "...after add(0,whut): " );
	System.out.println("\n" + james);

    james.add(4,"phat");
    System.out.println( "...after add(4,phat): " );
	System.out.println("\n" + james);

    System.out.println( "...after remove last: ");
	System.out.println("\n" + james);

    System.out.println( "...after remove(0): " + james.remove(0) );
	System.out.println("\n" + james);

    System.out.println( "...after remove(0): " + james.remove(0) );
	System.out.println("\n" + james);

    System.out.println( "...after remove(0): " + james.remove(0) );
	System.out.println("\n" + james);
  }//end main()

}
