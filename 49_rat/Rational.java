/*Ari Gurovich -- Consonants -- Oscar, Eric
APCS
HW41 -- Be More Rational -- Code that deals with rational numbers, lots of instances lots of use of
      pre-created default constructor ints
2021-12-6
time spent: 1,5
DISCO -- I dont think anything
QCC  -- still dont know if theres a way to bypass creating new instances for each test case
*/
public class Rational implements Comparable{
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

public String toString()
{
return numerator + " / " + denominator;
}

public static double floatValue(){
return ((double)numerator / denominator);
}

public static void multiply(Rational numsnums){

numerator = (numerator * numsnums.numerator);
denominator = (denominator * numsnums.denominator);
}

public static void  divide(Rational numsnums){
numerator = (numerator * numsnums.denominator);
denominator = (denominator * numsnums.numerator);
}

public static int gcd(){
int num = numerator;
int dum = denominator;
   while (num != dum) {
        if(num > dum)
             num = num - dum;
        else
         dum = dum - num;
    }
return num;
}

public static void reduce(){
int gcd = gcd();
denominator = denominator / gcd;
numerator = numerator / gcd;
}

public static void subtract(Rational numnums){
gcd();
numnums.gcd();
numerator = numerator - numnums.numerator;
}

public static void add(Rational numnums){
gcd();
numnums.gcd();
numerator = numerator + numnums.numerator;
}

public int compareTo(Object ob){
Rational r = (Rational)ob;
  if(!(floatValue() > r.floatValue())){
	if (floatValue() == r.floatValue()){
	    return 0;
	}
  }
  else{
  return 1;
  }
return -1;
}
public static void main(String [] args){
Rational r = new Rational(1 , 5);
Rational s = new Rational(1 , 2);
r.multiply(s);
System.out.println("Multiplying: " + r.floatValue());

Rational t = new Rational(1 , 0); 
Rational p = new Rational(0 , 1);
t.multiply(p);
System.out.println("Multiplying badly: " + t.floatValue());

Rational r2 = new Rational (1 , 5);
Rational s2 = new Rational (1 , 2);
r2.divide(s2);
System.out.println("\n" + "\n" +"Dividing: " + r2.floatValue());

Rational t2 = new Rational(1 , 0);
Rational p2 = new Rational(0 , 1);
t2.divide(p2);
System.out.println("Dividing badly: " + t2.floatValue());

Rational r3 = new Rational( 10, 35);
//System.out.println(r.gcd());
r3.reduce();
System.out.println("reduce test " + r3.toString());
Rational r4 = new Rational (10 , 60);
Rational s4 = new Rational ( 4 , 5);
System.out.println("compare test "+ r4.compareTo());
r4.subtract(s4);
System.out.println("subtraction test "+ r4.floatValue());

Rational r5 = new Rational (6 , 7);
Rational s5 = new Rational (13 , 40);
r5.add(s5);
System.out.println("addition test "+ r5.floatValue());
}
}
