/***
 * class Scheme
 * Simulates a rudimentary Scheme interpreter
 *
 * ALGORITHM for EVALUATING A SCHEME EXPRESSION:
 *   1. Steal underpants.
 *   2. ...
 *   5. Profit!
 *
 * STACK OF CHOICE: ALStack by Pom Pom
 * b/c ...
 **/
import java.util.Iterator;
import java.util.ArrayList;
public class Scheme
{
  /***
   * precond:  Assumes expr is a valid Scheme (prefix) expression,
   *           with whitespace separating all operators, parens, and
   *           integer operands.
   * postcond: Returns the simplified value of the expression, as a String
   * eg,
   *           evaluate( "( + 4 3 )" ) -> 7
   *	         evaluate( "( + 4 ( * 2 5 ) 3 )" ) -> 17
   **/

   //changed to not include parentheses
   public static String evaluate(String expr) {
     String[] exprArr = expr.split("\\s+");
    // Iterator<String> exprIt = exprArr.iterator();
     Stack<String> exprStack = new ALStack<String>();
     for (String g : exprArr) {

         if (!(g.equals(")"))) {
           exprStack.push(g);
         }
         else {
           ArrayList<String> empty = new ArrayList<String>();
           while(!(exprStack.peekTop().equals("("))) {
            empty.add(exprStack.pop());
          }
          exprStack.pop();
          exprStack.push(math(empty));
        }
     }

     return exprStack.pop();
   }

  public static String math( ArrayList<String> g )
  {
    String s = g.get(g.size() - 1);
    System.out.println(g);
    if (s.equals("+")) {
      return adder(g);
    }

    if (s.equals("-")) {
      return subtracter(g);
    }

    if (s.equals("*")) {
      return multiplier(g);
    }

    return "Invalid operation";
  }//end evaluate()

  public static String adder(ArrayList<String> g) {
    Integer i = 0;
    for (String s : g) {
      if (!(s.equals("+"))) {
        i+=Integer.parseInt(s);
      }
    }
    return i.toString();
  }

  public static String subtracter(ArrayList<String> g) {
    Integer b = Integer.parseInt(g.get(g.size() - 2));
    for (int i = g.size() - 3 ; i > -1; i--) {
      String s = g.get(i);
      b-=Integer.parseInt(s);
    }
    return b.toString();
  }

  public static String multiplier(ArrayList<String> g) {
    Integer i = 1;
    for (String s : g) {
      if (!(s.equals("*"))) {
        i*=Integer.parseInt(s);
      }
    }
    return i.toString();
  }



  //main method for testing
  public static void main( String[] args )
  {


      String zoo1 = "( + 4 3 )";
      System.out.println(zoo1);
      System.out.println("zoo1 eval'd: " + evaluate(zoo1) );
      //...7

      String zoo2 = "( + 4 ( * 2 5 ) 3 )";
      System.out.println(zoo2);
      System.out.println("zoo2 eval'd: " + evaluate(zoo2) );
      //...17

      String zoo3 = "( + 4 ( * 2 5 ) 6 3 ( - 56 50 ) )";
      System.out.println(zoo3);
      System.out.println("zoo3 eval'd: " + evaluate(zoo3) );
      //...29

      String zoo4 = "( - 1 2 3 )";
      System.out.println(zoo4);
      System.out.println("zoo4 eval'd: " + evaluate(zoo4) );
      //...-4
        /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }//main()

}//end class Scheme
