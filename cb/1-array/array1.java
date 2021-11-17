public class array1{

public boolean firstLast6(int[] nums) {
      if (nums[0] == 6){
      return true;
      
}
      if (nums[nums.length -1]==6){
        return true;
}
      else { 
        return false;

}
}

public boolean sameFirstLast(int[] nums) {
     
      if (nums.length > 0){
        
        if (nums[0] == nums[nums.length-1]){
          return true;
        }
       else { 
           return false;
        }
}
      else { 
        return false;

}
}

public int[] makePi() {
  int[] var = {3, 1, 4};
  return var;
}

public boolean commonEnd(int[] a, int[] b) {
      if ((a.length > 0) && (b.length > 0)){

        if ((a[0] == b [0]) || (a[a.length-1] == b[b.length-1]) ){
          return true;
        }
       else { 
           return false;
        }
}
      else { 
        return false;

}
}


public int sum3(int[] nums) {
int m = 0;
  for( int i = 0;  i < nums.length; i++){
    m= nums[i] + m;
  }
  return m;
}


public static void main (String [] args) {
int [] a;
/*

System.out.println("firstLast6 test:");
System.out.println( firstLast6(int [] a = {1, 2, 6}));//true
System.out.println( firstLast6(a[{6, 1 ,2 ,3}]));//true
System.out.println( firstLast6(a{13, 6, 1 ,2 ,3}));//false
/*
System.out.println("sameFirstLast test:");
System.out.println(sameFirstLast(1, 2 , 3)); // false
System.out.println(sameFirstLast(1, 2 , 3, 1));//true
System.out.println(sameFirstLast(1, 2 , 1));//true

System.out.println("makePi test: ");
System.out.println(makePi()); // [ 3, 1, 4]
*/
}
}
