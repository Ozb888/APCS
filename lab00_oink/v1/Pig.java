public class Pig
{
  //Q: How does this initialization make your life easier?
  private static final String VOWELS = "aeiouy";
  private static final String CAPS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
  private static final String PUNCS = ".,:;!?";

  /*=====================================
    boolean hasA(String,String) -- checks for a letter in a String
    pre:  w != null, letter.length() == 1
    post: hasA("cat", "a") -> true
    hasA("cat", "p")       -> false
    =====================================*/
  public static boolean hasA( String w, String letter )
  {
    /* YOUR IMPLEMENTATION HERE */
    if(letter.length()!=1){
      System.out.println("Letter must have length 1.");
      return false;
    }
    if(w.length()<1){
      System.out.println("String w length cannot be less than 1.");
      return false;
    }
    if (-1 != w.indexOf(letter)) {
      return true;
    }
    else {
      return false;
    }
  }//end hasA()


  /*=====================================
    boolean isAVowel(String) -- tells whether a letter is a vowel
    precondition: letter.length() == 1
    =====================================*/
  public static boolean isAVowel( String letter )
  {
    /* YOUR IMPLEMENTATION HERE */
    if (letter.length() != 1) {
      System.out.println("Letter must have length 1.");
      return false;
    }     
    return hasA(VOWELS, letter);
  
  }


  /*=====================================
    int countVowels(String) -- counts vowels in a String
    pre:  w != null
    post: countVowels("meatball") -> 3
    =====================================*/
  public static int countVowels( String w )
  {
    if(w.length()<1){
      System.out.println("String w length cannot be less than 1.");
      return -1;
    }
    int counter = 0;
    for (int index = 0; index < w.length(); index++) {
      String letter = w.substring(index, index+1);
      if ( isAVowel(letter)) {
        counter++;
      }
    }
    return counter;
  
  }


  /*=====================================
    boolean hasAVowel(String) -- tells whether a String has a vowel
    pre:  w != null
    post: hasAVowel("cat") -> true
    hasAVowel("zzz")       -> false
    =====================================*/
  public static boolean hasAVowel( String w ) {
    if(w.length()<1){
      System.out.println("String w length cannot be less than 1.");
      return false;
    }
    for (int index = 0; index < w.length(); index++) {
      String letter = w.substring(index, index+1);
      if ( isAVowel(letter)) {
       return true; 
      }
    }
    return false;
  
  }


  /*=====================================
    String allVowels(String) -- returns vowels in a String
    pre:  w != null
    post: allVowels("meatball") -> "eaa"
    =====================================*/
  public static String allVowels( String w )
  {
    if(w.length()<1){
      System.out.println("String w length cannot be less than 1.");
      return "";
    }
    String output = "";
  	for (int index = 0; index < w.length(); index++) {
    	String letter = w.substring(index, index+1);
      if ( isAVowel(letter)) {
      output += letter;
      }
    }
    return output; 
  }

      /*=====================================
      boolean i sP un c (S tr i ng) -- tells whether a character is punctuation
      pre:  symbol.length() == 1
      post: isPunc(".") -> true
            isPunc("b") -> false
      =====================================*/
    public static boolean isPunc( String symbol ) {
      if (symbol.length()<1){
        System.out.println("No punctuation");
        return false;
        }
      
	return PUNCS.indexOf( symbol ) != -1;
    }


    /*=====================================
      boolean isUpperCase(String) -- tells whether a letter is uppercase
      pre:  letter.length() == 1
      post: isUpperCase("a") -> false
            isUpperCase("A") -> true
      =====================================*/
    public static boolean isUpperCase( String letter ) {
	return CAPS.indexOf(letter) != -1;  //test this
		}

    /*=====================================
      boolean hasPunc(String) -- tells whether a String contains punctuation
      pre:  w != null
      post: hasPunc(cat.) -> true
            hasPunc(cat) -> false
      =====================================*/

    public static boolean hasPunc( String w ) {
	for (int x = 0; x < w.length(); x++) {

	if(isPunc(w.substring(x, x =x+1))) {
		return true;
	}
    }
return false;
}

    /*=====================================
      boolean beginsWithUpper(String) -- tells whether 1st letter is uppercase
      pre:  w != null and w.length() > 0
      post: beginsWithUpper("Apple") -> true
            beginsWithUpper("apple") -> false
      =====================================*/
    public static boolean beginsWithUpper( String w ) {

	return isUpperCase(w.substring(0,1) );
    }

	
	public static void main(String[] args){
		System.out.println(isUpperCase("B")); //return true
		System.out.println(isUpperCase("b"));//return false
		System.out.println("--------hasPunc testing------");
		System.out.println(isPunc("he-llo")); // return true
		System.out.println(isPunc("hello")); //return false		
	}
}
