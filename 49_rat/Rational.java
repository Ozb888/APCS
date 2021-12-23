public class Rational implements Comparable{
 private int denominator;
 private int numerator;
public Rational(){
denominator = 1;
numerator = 0;
}
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

public static int gcd(int num ,int  dum){
   while (num != dum) {
        if(num > dum)
             num = num - dum;
        else
         dum = dum - num;
    }
return num;
}

public int gcd(){
return gcd(numerator , denominator);
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
if(!(obj instanceof Rational)){
        throw new ClassCastException("error bro not A RATIONAL");
} 
else if(!(callVal < PVal)){     
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
if (obj instanceof Rational){
  return callVal == PVal;
}
else{
throw new ClassCastException(" error bro, not rational");
}
}
}
