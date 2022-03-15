///Pom Pom: Max Schneider, Perry Huang, Oscar Breen
//APCS pd07
//HW76 -- We Got a Little Ol' Convoy
//2022-03-14
//time spent: 999 hrs

/***
 * class LList
 * Implements a linked list of LLNodes, each containing String data
 **/

public class LList implements List //interface def must be in this dir
{

  //instance vars
  private LLNode _head;
  private int _size;

  // constructor -- initializes instance vars
  public LList( )
  {
    _head = new LLNode("bruh", null);
    _size = 1;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode temp = _head;

//   _head.setCargo(newVal);
     while(temp.getNext() != null){
	temp = temp.getNext();
     }
     LLNode val = new LLNode(newVal, null);
      temp.setNext(val);
     return true;
  }


  public String get( int index )
  {
    String ind = "";
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
      if (index == 0)
	ind = (_head.getCargo());
     else
	for(int i = 0; i <= index; i++){
		ind = _head.getCargo();
		_head = _head.getNext();
	}
    return ind;
} 


  public String set( int index, String newVal )
  {
//    String res = "";
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();
     LLNode boc = _head;
     for( int i = 0; i < index; i++){
     	boc = boc.getNext();
     }
     boc.setCargo(newVal);
    return newVal;
    // YOUR CODE HERE
  }


  //return number of nodes in list
  public int size()
  {
    int i = 0;
    LLNode temp = _head;
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
      i++;
    }
    return i;
  }

  //--------------^  List interface methods  ^--------------

/*

  override inherited toString
  public String toString()
  {
    // YOUR CODE HERE
  }
*/
  //main method for testing
  public static void main( String[] args )
  {

    LList james = new LList();

    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("beat");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("a");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("need");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    james.add("I");
    System.out.println( james );
    System.out.println( "size: " + james.size() );

    System.out.println( "2nd item is: " + james.get(1) );

    james.set( 1, "got" );
    System.out.println( "...and now 2nd item is: " + james.set(1,"got") );

    System.out.println( james );
  }

}//end class LList
