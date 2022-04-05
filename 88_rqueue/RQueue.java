import javax.swing.plaf.synth.SynthStyleFactory;

// Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
// APCS
// HW88 -- BPC Kiddies Do Not Wait in Line Either
// 2022-04-04
// time spent: 2 hrs
// DISCO
// Instead of trying to use setNext we can just dequeue and enqueue repeatedly to sample.
// Typecasting int should be done after putting parenthesis on the expression so that you don't accidentally make Math.random() into 0 every time.
//
// QCC
// Is there a better way to implement dequeue so that there aren't so many conditionals?

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
  }//O(1)


  // remove and return random thing
  // assume _queue ! empty
  public SWASHBUCKLE dequeue()
  {
    SWASHBUCKLE retVal;
    LLNode<SWASHBUCKLE> temp = _front;
    int randVal = (int) (Math.random() * _size);

    if (randVal == 0) {
      retVal = _front.getCargo();
      _front = _front.getNext();
      _size--;
      return retVal;
    }
    if (randVal == _size) {
      for (int i = 0; i < _size; i++) {
        temp = temp.getNext();
      }
      _end = temp;
      retVal = _end.getCargo();
      _end.setCargo(null);
      _size--;
      return retVal;
    }

    for (int i = 0; i < randVal - 2; i++) {
      temp = temp.getNext();
    }
    retVal = temp.getNext().getCargo();
    temp.setNext(temp.getNext().getNext());

    _size--;

    return retVal;
  }//O(n)


  public SWASHBUCKLE peekFront()
  {
    return _front.getCargo();
  }//O(1)


/***
   * void sample() -- a means of "shuffling" the queue
   * Algo:
   *   < YOUR SUCCINCT SUMMARY HERE >
   **/
  public void sample()
  {
    for (int i = 0; i < _size; i ++) {
      enqueue(dequeue());
    }
  }//O(n)

  public boolean isEmpty()
  {
    return _front == null;
  } //O(1)


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

    System.out.println("\nnow testing sample...");
    PirateQueue.sample();
    System.out.println( PirateQueue );

    System.out.println("\nnow dequeuing..."); 
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );
    System.out.println( PirateQueue.dequeue() );

      /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
    System.out.println("\nnow dequeuing fr empty queue...\n" +
                       "(expect NPE)\n"); 
    System.out.println( PirateQueue.dequeue() );
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main

}//end class RQueue
