/*Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
* APCS
* HW78 -- Double Up
* 2022-03-16
* time spent: 0.2 hrs
*
* DISCO:
* All we had to do was create a couple of new methods by copying and pasting and update the constructors.
* We had to update methods for _tail.
*
* QCC:
* Are there simpler test cases to test our updated methods?
* 
* ALGO ADD
* walks to psoiiton ot add, when arrived, sets backup Nodes to posiiton before and after, sets cargo of one of the backup nodes to 
* newVal, then sets all other backup nodes to that new node to keep all the data.
* sets _tail to the last value if the index parameter was one less than the size.
*
* ALGO REMOVE
* walks to one before we are removing, sets cargo to what we are removing
* sets node to cdr of second item after items position, skipping over than item, removing it.
* sets _tail to the last value if the index parameter was one less than the size.
*/

/*****************************************************
 * class DLLNode
 * Implements a node, for use in lists and other container classes.
 * Stores its data as a String
 *****************************************************/

public class DLLNode
{
    //instance vars
    private String _cargo;    //cargo may only be of type String
    private DLLNode _nextNode; //pointer to next LLNode
    private DLLNode _prevNode; //pointer to previous LLNode

    // constructor -- initializes instance vars
    public DLLNode ( String value, DLLNode next, DLLNode prev ) {
	_cargo = value;
	_nextNode = next;
  _prevNode = prev;
    }


    //--------------v  ACCESSORS  v--------------
    public String getCargo() { return _cargo; }

    public DLLNode getNext() { return _nextNode; }

    public DLLNode getPrev() { return _prevNode; }
    //--------------^  ACCESSORS  ^--------------


    //--------------v  MUTATORS  v--------------
    public String setCargo( String newCargo ) {
	String foo = getCargo();
	_cargo = newCargo;
	return foo;
    }

    public DLLNode setNext( DLLNode newNext ) {
	DLLNode foo = getNext();
	_nextNode = newNext;
	return foo;
    }

    public DLLNode setPrev( DLLNode newPrev ) {
	DLLNode foo = getPrev();
	_prevNode = newPrev;
	return foo;
    }

    //--------------^  MUTATORS  ^--------------

    
    // override inherited toString
    public String toString() { return _cargo.toString(); }
	

}//end class DLLNode

