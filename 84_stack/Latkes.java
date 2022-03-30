// Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
// HW83 -- Stacks on Stacks 
// APCS
// 2022-03-28
// Time spent: 0.5 hrs

/***
 * class Latkes
 * v1
 * SKELETON
 * Implements a stack of Strings using an encapsulated array
 **/

/***
    DISCO
    This class is pretty efficient because all the methods are O(1).

    QCC
    Is it possible to make a pop method that removes at index 0 that is more efficient?
    Are all of these methods actually O(1)?

 **/


public class Latkes
{
  private String [] _stack;
  private int _stackSize;


  //constructor
  public Latkes( int initCapacity )
  {
    _stackSize = 0;
    _stack = new String[initCapacity];
  }// O(1)


  //means of insertion
  public void push( String s )
  {
    if (isFull()) {
    System.out.println("Nope, we've reached max capacity.");
    return;
    }
    _stack[_stackSize] = s;
    _stackSize++;
    //System.out.println("Added " + s);
  }// O(1)


  //means of removal
  public String pop( )
  {
    if (isEmpty()) {
        return "Nope, we've run out";
    }
    String r = _stack[_stackSize - 1];
    _stack[_stackSize - 1] = null;
    _stackSize--;
    //System.out.print("Removed ");
    return r;

  }// O(1)


  //check for emptiness
  public boolean isEmpty()
  {
    return (_stackSize == 0);
  }// O(1)


  //chk for fullness
  public boolean isFull()
  {
    return (_stackSize == _stack.length);
  }// O(1)

  public String peek()
  {
      return _stack[_stackSize - 1];
  }

  //main method for testing
  public static void main( String[] args )
  {

    Latkes tastyStack = new Latkes(10);

    tastyStack.push("aoo");
    tastyStack.push("boo");
    tastyStack.push("coo");
    tastyStack.push("doo");
    tastyStack.push("eoo");
    tastyStack.push("foo");
    tastyStack.push("goo");
    tastyStack.push("hoo");
    tastyStack.push("ioo");
    tastyStack.push("joo");
    tastyStack.push("coocoo");
    tastyStack.push("cachoo");

    //cachoo
    System.out.println( tastyStack.pop() );
    //coocoo
    System.out.println( tastyStack.pop() );
    //joo
    System.out.println( tastyStack.pop() );
    //ioo
    System.out.println( tastyStack.pop() );
    //hoo
    System.out.println( tastyStack.pop() );
    //goo
    System.out.println( tastyStack.pop() );
    //foo
    System.out.println( tastyStack.pop() );
    //eoo
    System.out.println( tastyStack.pop() );
    //doo
    System.out.println( tastyStack.pop() );
    //coo
    System.out.println( tastyStack.pop() );
    //boo
    System.out.println( tastyStack.pop() );
    //aoo
    System.out.println( tastyStack.pop() );

    //stack empty by now; SOP(null)
    System.out.println( tastyStack.pop() );
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/

  }//end main()

}//end class Latkes