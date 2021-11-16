/*
Team 10: Consonants
APCS
HW34 -- A Pirate's Life for Me -- about arrays and setting them as well as searching them
2021-11-14
time spent: 2
*/
public class Loopier {

public static int[] intArray(int[] input){
for ( int i = 0; i < input.length; i++) {
input[i] = (int)(Math.random() * 10);
}
 return input;
}


public static String arrayToString( int[] ary ) {
   String ans = "[";
   for( int i = 0; i < ary.length; i++ ) {
     ans += ary[i];
     if( i != ary.length - 1 ) {
       ans += ", ";
     }
   }
   return ans + "]";
 }

public static int linSearch(int[] a, int target){
for( int i = 0; i < a.length; i++){

   if (a[i] == target){
    return i;
}
}
    return -1;

}

public static int linSearchR(int[] a, int target, int i){

if ( i == a.length){
	return -1;
}
else if (a[i] == target) {
	return i;
}
else {
	return linSearchR(a, target, i = i+1);
}
}

public static int freq( int[] a, int target ){
int counter = 0;
for (int i = 0; i < a.length; i++){
if (a[i] == target){
counter += 1;
}
}
return counter;
}

public static int freqR( int[] a, int target, int i, int counter ){
if ( i == a.length){
        return counter;
}
else if (a[i] == target) {
        return freqR(a, target, i =i+1, counter = counter+1);
}
else { 
        return freqR(a, target, i = i+1, counter);
}                                                                                                                       }


public static void main (String [] args) {
int[] array = new int[10];
array = intArray(array);
int target = (int)(Math.random() * 10);
System.out.println("Target is: " + target);

System.out.println(arrayToString(array));

System.out.println("Located at character: " + linSearch(array, target));
System.out.println("(recursive) " + linSearchR(array, target, 0));

System.out.println("Found this many times: "+  freq(array, target));
System.out.println("(recursive) " + freqR(array, target, 0, 0));
}
}
