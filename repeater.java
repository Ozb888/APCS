/*
<Frist> <Lsat>
APCS
HW<nn> -- <Title/Topic/Summary... (Aim for concision, brevity, CLARITY. Write to your future self...)>
<yyyy>-<mm>-<dd>
time spent: <elapsed time in hours, rounded to nearest tenth>
*/
public class repeater {
  public static String fenceW(int numPosts){
int counter = 1;
    if (counter <= numPosts) {
    System.out.print("|");
  }
      while(counter < numPosts) {
            System.out.print("--|");
                counter++;
          }
return "";
  }

public static String fenceR(int numPosts){
  if (numPosts == 1){
    System.out.print("|");
  }
    else {
    fenceR((numPosts - 1));
    System.out.print("--|");
  }
  return "";
}
public static void main(String[] args) {
System.out.println(fenceW(2));
System.out.println(fenceR(6));
    }
  }
