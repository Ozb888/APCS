/*Oscar Breen -- Consonants -- Ari, Eric
APCS
HW41 -- Be Rational -- Code that deasl with rational numbers
2021-12-1
time spent: <elapsed time in hours, rounded to nearest tenth>
DISCO -- (long) does not also make an int into a "int.0" as double does, double best for use.
      -- running a method outside a S.O.U.P still prints the change (pass-by-value java)
QCC ---- why are we doing this? is it because of the PBV? seems like a bit of a step back from
 arrays so im thinking i perhaps did it not like it was intended?
     -- is there a way to do thi without using multiple new instances each time?
*/
public class Rational {

 private static int denominator;
 private static int numerator;

public Rational(int num, int dum){
if (dum != 0){
	denominator = dum;
	numerator = num;
}
else{
	System.out.println("\n"+ "bro u cant divide by zero");
  }
}

public static String toString(long inp){
return ("the result: " + ""+ inp);
}

public static double floatValue(int num, int dum){
return ((double)num / dum);
}

public static void multiply(Rational numsnums){

numerator = (numerator * numsnums.numerator);
denominator = (denominator * numsnums.denominator);
}

public static void  divide(Rational numsnums){
numerator = (numerator * numsnums.denominator);
denominator = (denominator * numsnums.numerator);
}

public static void main(String [] args){
Rational r = new Rational(1 , 5);
Rational s = new Rational(1 , 2);
r.multiply(s);
System.out.println("Multiplying: " + r.floatValue(numerator, denominator));

Rational t = new Rational(1 , 0); 
Rational p = new Rational(0 , 1);
t.multiply(p);
System.out.println("Multiplying badly: " + t.floatValue(numerator , denominator));

Rational r2 = new Rational (1 , 5);
Rational s2 = new Rational (1 , 2);
r2.divide(s2);
System.out.println("\n" + "\n" +"Dividing: " + r2.floatValue(numerator, denominator));

Rational t2 = new Rational(1 , 0);
Rational p2 = new Rational(0 , 1);
t2.divide(p2);
System.out.println("Dividing badly: " + t2.floatValue(numerator, denominator));
}
}
