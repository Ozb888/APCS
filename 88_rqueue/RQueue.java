/***
 * class RQueue
 * SKELETON
 * A node-based, randomized queue
 * (a collection with FIIDKO property)
 *
 *       -------------------------------
 *   end |  --->   Q U E U E   --->    | front
 *       -------------------------------
 *
 *  linkages point opposite direction for O(1) en/dequeuing
 *            N <- N <- ... <- N <- N
 *      _end -^                     ^- _front
 *
 **/


public class RQueue<SWASHBUCKLE> implements Queue<SWASHBUCKLE>
{
  //instance variables
  private LLNode<SWASHBUCKLE> _front, _end;
  private int _size;


  // default constructor creates an empty queue
  public RQueue()
  {
    _front = _end = null;
    _size = 0;
  }


  public void enqueue( SWASHBUCKLE enQVal )
  {
  if ( isEmpty() ) {
      _front = _end = new LLNode<SWASHBUCKLE>( enQVal, null );
    }
    else {
      _end.setNext( new LLNode<SWASHBUCKLE>( enQVal, null ) );
      _end = _end.getNext();
    }
    _size++;
    System.out.println("enqueued " + enQVal);
  }//O(?)


  // remove and return thing at front of queue
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    int randVal = (int)Math.random() * _size;
    LLNode<SWASHBUCKLE> temp = _front;
    for (int i = 0; i < randVal - 1; i++) {
      temp = temp.getNext();
    }
    SWASHBUCKLE retVal = temp.getNext().getCargo();
    temp.setNext(temp.getNext().getNext());

    if ( _front == null ) //just moved past last node
      _end = null;      //update _end to reflect emptiness

    _size--;

    return retVal;
  }//O(?)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(?)


  /***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   **/
  public void sample()
  {
    LLNode<SWASHBUCKLE> temp = _end;
    LLNode<SWASHBUCKLE> prev = _end;
    for (int i = 0; i < _size; i ++) {
      int t = (int)(Math.random() * 3);
      if (t == 0 && i!=0) {
        prev.setNext(temp.getNext());
        enqueue(temp.getCargo());
        temp=prev.getNext();
      }
      else if(t == 1 && i!=0) {
        prev.setNext(temp.getNext());
        _end.setNext(temp);
        _end = _end.getNext();
        temp=prev.getNext();
      } 
      else {
        temp=temp.getNext();
        prev=prev.getNext();
      } 
    }
  }//O(?)


  public boolean isEmpty()
  {
    return _front == null;
  } //O(?)


  // print each node, separated by spaces
  public String toString()
  {
    String retStr = "FRONT :: ";
    LLNode<SWASHBUCKLE> tmp = _front; //init tr
    while( tmp != null ) {
      retStr += tmp.getCargo() + " ";
      tmp = tmp.getNext();
    }
    retStr += " :: END";
    return retStr;
  }//end toString()

  //main method for testing
  public static void main( String[] args )
  {

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    
    Queue<String> PirateQueue = new RQueue<String>();

    System.out.println("\nnow enqueuing..."); 
    PirateQueue.enqueue("Dread");
    PirateQueue.enqueue("Pirate");
    PirateQueue.enqueue("Roberts");
    PirateQueue.enqueue("Blackbeard");
    PirateQueue.enqueue("Peter");
    PirateQueue.enqueue("Stuyvesant");

    System.out.println("\nnow testing toString()..."); 
    System.out.println( PirateQueue ); //for testing toString()...

    System.out.println("\nnow dequeuing..."); 
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );

      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
