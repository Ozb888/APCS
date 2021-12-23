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
 private int denominator;
 private int numerator;

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

public  double floatValue(){
return ((double)numerator / denominator);
}

public  void multiply(Rational numsnums){

numerator = (numerator * numsnums.numerator);
denominator = (denominator * numsnums.denominator);
}

public  void  divide(Rational numsnums){
numerator = (numerator * numsnums.denominator);
denominator = (denominator * numsnums.numerator);
}

public  int gcd(){
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

public  void reduce(){
int gcd = gcd();
denominator = denominator / gcd;
numerator = numerator / gcd;
}

public  void subtract(Rational numnums){
gcd();
numnums.gcd();
numerator = numerator - numnums.numerator;
}

public  void add(Rational numnums){
gcd();
numnums.gcd();
numerator = numerator + numnums.numerator;
}

public int compareTo(Object obj){
Rational ob = (Rational)obj;
double callVal = floatValue();
double PVal = ob.floatValue();

  if(!(callVal < PVal)){	
	if (callVal == PVal){
	    return 0;
	}

  	else{
  	return 1;
	}

  }
return -1;
}


public boolean equals(Object obj){
Rational ob = (Rational) obj;
double callVal = floatValue();
double PVal = ob.floatValue();

  return callVal == PVal;

}
}
