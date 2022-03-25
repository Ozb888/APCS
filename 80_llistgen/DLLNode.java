/***
 * class DLLNode<o> v1
 * Implements a node, for use in lists and other container classes.
 * Stores an o as cargo.
 **/

public class DLLNode<o>
{
  private o _cargo;    //cargo may only be of type Object
  private DLLNode<o> _nextNode, _prevNode; //pointers to next, prev DLLNodes


  // constructor -- initializes instance vars
  public DLLNode( o value, DLLNode<o> prev, DLLNode<o> next )
  {
    _cargo = value;
    _nextNode = next;
    _prevNode = prev;
  }


  //--------------v  ACCESSORS  v--------------
  public o getCargo() { return _cargo; }

  public DLLNode<o> getNext() { return _nextNode; }

  public DLLNode<o> getPrev() { return _prevNode; }
  //--------------^  ACCESSORS  ^--------------


  //--------------v  MUTATORS  v--------------
  public o setCargo( o newCargo )
  {
    o foo = getCargo();
    _cargo = newCargo;
    return foo;
  }

  public DLLNode<o> setNext( DLLNode<o> newNext )
  {
    DLLNode<o> foo = getNext();
    _nextNode = newNext;
    return foo;
  }

  public DLLNode<o> setPrev( DLLNode<o> newPrev )
  {
    DLLNode<o> foo = getPrev();
    _prevNode = newPrev;
    return foo;
  }
  //--------------^  MUTATORS  ^--------------


  // override inherited toString
  public String toString() { return _cargo.toString(); }


  //main method for testing
  public static void main( String[] args )
  {
    //Below is an exercise in creating a linked list...

 /*********************
    //Create a node
    DLLNode<o> first = new DLLNode<o>( "cat", null );

    //Create a new node after the first
    first.setNext( new DLLNode<o>( "dog", null ) );

    //Create a third node after the second
    first.getNext().setNext( new DLLNode<o>( "cow", null ) );

    DLLNode<o> temp = first; 
    while( temp != null ) {
      System.out.println( temp );
      temp = temp.getNext();
    }
   ***********************/
  }//end main

}//end class DLLNode<o>