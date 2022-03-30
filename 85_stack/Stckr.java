/***
 * class Stckr
 * SKELETON
 * driver/tester for Stack implementations (Linked-list-based, ArrayList-based)
 **/

public class Stckr
{
  public static void main( String[] args )
  {

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // USAGE: un-comment exactly 1 assignment below
    //Stack<Integer> cakes = new ALStack<Integer>();
    Stack<Integer> cakes = new LLStack<Integer>();
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    //...
    cakes.push(1);
    cakes.push(2);
    cakes.push(3);
    cakes.push(4);
    cakes.push(5);
    cakes.push(6);
    cakes.push(7);
    cakes.push(8);
    cakes.push(9);
    cakes.push(10);
    cakes.push(11);
    cakes.push(12);
    cakes.push(13);
    System.out.println(cakes);



    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());
    cakes.pop();
    System.out.println(cakes.peekTop());



    System.out.println(cakes);

  }//end main

}//end class
