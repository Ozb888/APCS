// Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
// APCS
// HW84 -- Stack: What Is It Good For?
// 2022-03-29
// time spent: 2.5 hrs
//
// DISCO
// Sometimes the error is in the other file
// Adding print statements when debugging is insanely useful
//
// QCC
// Is there a way to make allMatched more efficient?


/***
 * class LatKtS
 * SKELETON
 * driver class for Latkes
 * Uses a stack to reverse a text string, check for sets of matching parens.
 **/

public class LatKtS
{
  /***
   * precondition:  input string has length > 0
   * postcondition: returns reversed string s
   *                flip("desserts") -> "stressed"
   **/
  public static String flip( String s )
  {
    Latkes r = new Latkes(s.length());
    for(int i = 0; i < s.length(); i ++) {
      r.push(s.substring(i, i+1));
    }
    String retStr = "";
    for (int i = 0; i < s.length(); i ++) {
      retStr += r.pop();
    }
    return retStr;
  }


  /***
   * precondition:  s contains only the characters {,},(,),[,]
   * postcondition: allMatched( "({}[()])" )    -> true
   *                allMatched( "([)]" )        -> false
   *                allMatched( "" )            -> true
   **/
  public static boolean allMatched( String s )
  {
    String strVal = "";
    Latkes r = new Latkes(s.length());
    if (s.length() % 2 == 1) {
      return false;
    }
    for(int i = 0; i < s.length(); i++) {
      strVal = s.substring(i,i+1);
      if (strVal.equals("(") || strVal.equals("[") || strVal.equals("{")) {
        r.push(strVal);
      }
      else if (r.peek().equals("(")) {
        if (!strVal.equals(")")){
          return false;
        }
        r.pop();
      }
      else if (r.peek().equals("[")) {
        if (!strVal.equals("]")){
          return false;
        }
        r.pop();
      }
      else if (r.peek().equals("{")) {
        if (!strVal.equals("}")){
          return false;
        }
        r.pop();
      }
    }
    return true;
  }


  //main method to test
  public static void main( String[] args )
  {
    
    System.out.println(flip("stressed"));
    System.out.println(allMatched( "({}[()])" )); //true
    System.out.println(allMatched( "([)]" ) ); //false
    System.out.println(allMatched( "(){([])}" ) ); //true
    System.out.println(allMatched( "](){([])}" ) ); //false
    System.out.println(allMatched( "(){([])}(" ) ); //false
    System.out.println(allMatched( "()[[]]{{{{((([])))}}}}" ) ); //true
    /*v~~~~~~~~~~~~~~MAKE MORE~~~~~~~~~~~~~~v
      ^~~~~~~~~~~~~~~~AWESOME~~~~~~~~~~~~~~~^*/
  }

}//end class
