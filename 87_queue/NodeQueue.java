/*Max Schneider, Oscar Breen, Perry Huang
APCS
HW87 -- <The English Do Not Wait In Line for Soup /Queue/Making a queue, remove from front, add to back
2022-04-03
time spent: 2

DISCO:
	-  Nodes are maleable
	-  assigning and maintaining the values of a first and last makes 
	   many methods a lot easier

QCC;
    - Why not Double linked Nodes? 
*/
public class NodeQueue<QUASAR> implements Queue<QUASAR> {
  //~~~~~~~~~~~~~~~~~~begin AP subset~~~~~~~~~~~~~~~~~~
  //means of removing an element from collection:
  //Dequeues and returns the first element of the queue.
  public Node<QUASAR> first;
  public Node<QUASAR> last;
  public int size;
  public NodeQueue () {
    first = new Node<QUASAR>(null,null);
    last = first;
    size = 0;
  }
  public QUASAR dequeue() {
    if (size > 1) {
      int x = size;
      Node temp = last;
      while (x > 1) {
        temp = temp.cdr;
        x--;
      }
      first = temp;
      first.cdr=null;
      size--;
    }else if (size == 1){
      first = new Node<QUASAR>(null,null);
      last = first;
      size=0;
      return null;
    } else {
      return null;
    }
    return first.car;
  }

  //means of adding an element to collection:
  //Enqueue an element onto the back of this queue.
  public void enqueue( QUASAR x ){
    if (isEmpty()) {
      first = new Node(x, null);
      last = first;
    }
    else {
      last = new Node(x, last);
    }
    size++;
  }

  //Returns true if this queue is empty, otherwise returns false.
  public boolean isEmpty(){
    return size==0;
  }

  //Returns the first element of the queue without dequeuing it.
  public QUASAR peekFront(){
    return first.car;
  }
  public String toString() {
    String retval = last.toString();
    return retval;
  }
  public static void main(String[] args) {
    NodeQueue<String> test = new NodeQueue<String>();
    System.out.println(test);
    test.enqueue("a");
    test.enqueue("b");
    test.enqueue("c");
    test.enqueue("d");
    System.out.println(test);
    test.dequeue();
    test.dequeue();
    test.dequeue();
    test.dequeue();
    System.out.println(test);


  }

}
class Node<QUASAR> {
  public QUASAR car;
  public Node<QUASAR> cdr;
  public Node(QUASAR carr, Node<QUASAR> cdrr ) {
    car = carr;
    cdr = cdrr;
  }
  public String toString () {
    String retval = "";
    retval += car;
    retval+= "--> " + cdr;
    return retval;
  }
}
