/*
Perry Huang, Max Shneider, Oscar Breen
APCS
HW77 -- Insert|Remove -- add and remove
2022-03-16
time spent: 1

DISCO
-- Add as many nodes for data backup as possible 

QCC
 - 

ALGO

Add
 - walks to psoiiton ot add, when arrived, sets backup Nodes to posiiton before and after, sets cargo of one of the backup nodes to 
	newVal, then sets all other backup nodes to that new node to keep all the data.

remove
- walks to one before we are rmeoving, sets cargo to what we are removing
   sets node to cdr of second item after items position, skipping over than item, removing it
*/
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
    _head = null; //at birth, a list has no elements
    _size = 0;
  }


  //--------------v  List interface methods  v--------------

  public boolean add( String newVal )
  {
    LLNode tmp = new LLNode( newVal, _head );
    _head = tmp;
    _size++;
    return true;
  }


  public void add(int index, String newVal){
//   if(index == 0)
//	LLNode timp = new LLNode(newVal, _head);
//    else{
      LLNode temp1 = new LLNode(newVal, null);
      LLNode temp2 = _head;


      for (int i = 0; i < index-1; i++) {
        temp2 = temp2.getNext();
      }
      LLNode next = temp2.getNext(); 


      temp1.setNext(next);
      temp2.setNext(temp1);
      _size++;
  //  }
  }

  public void remove(int index){
   LLNode tmp = _head;
    for( int i=0; i < index-1; i++ )
      tmp = tmp.getNext();
      tmp.setNext(tmp.getNext().getNext());
      _size --;

}

  public String get( int index )
  {
    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    String retVal;
    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //check target node's cargo hold
    retVal = tmp.getCargo();
    return retVal;
  }


  public String set( int index, String newVal )
  {

    if ( index < 0 || index >= size() )
      throw new IndexOutOfBoundsException();

    LLNode tmp = _head; //create alias to head

    //walk to desired node
    for( int i=0; i < index; i++ )
      tmp = tmp.getNext();

    //store target node's cargo
    String oldVal = tmp.getCargo();

    //modify target node's cargo
    tmp.setCargo( newVal );

    return oldVal;
  }


  //return number of nodes in list
  public int size() { return _size; }

  //--------------^  List interface methods  ^--------------


  // override inherited toString
  public String toString()
  {
    String retStr = "HEAD->";
    LLNode tmp = _head; //init tr
    while( tmp != null ) {
	    retStr += tmp.getCargo() + "->";
	    tmp = tmp.getNext();
    }
    retStr += "NULL";
    return retStr;
  }


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

    System.out.println("adding funny to _head at index 3");
    james.add(3, "funny");
    System.out.println("updated james: " + james);

   System.out.println("remove: " + james.get(3));
   james.remove( 3);
   System.out.println(james);

  }

}//end class LList
