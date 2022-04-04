/*Max Schneider, Oscar Breen, Perry Huang
APCS
HW87 -- <The English Do Not Wait In Line for Soup /Queue/Making a queue, remove>
2022-04-03
time spent: 2

DISCO:
        -  Nodes are maleable
        -  assigning and maintaining the values of a first and last makes
           many methods a lot easier

QCC;
    - Why not Double linked Nodes?
*/



/***
 * interface Queue
 * Includes only methods listed in AP subset of Java
 * (Local version, to override built-in Java implementation.)
 **/

public interface Queue<QUASAR>
{
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public QUASAR dequeue();

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x );

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty();

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront();
  //~~~~~~~~~~~~~~~~~~~end AP subset~~~~~~~~~~~~~~~~~~~

}//end interface Queue
