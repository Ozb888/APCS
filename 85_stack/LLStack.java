import java.util.LinkedList;
public class LLStack<PANCAKE> implements Stack<PANCAKE> {
  public LinkedList<PANCAKE> cargo;
  public int length;

  public LLStack() {
    cargo = new LinkedList<PANCAKE>();
    length = 0;
  }

  public boolean isEmpty(){
    return length == 0;
  }

  //Return top element of stack without popping it.
  public PANCAKE peekTop(){
    return cargo.get(0);
  }

  //Pop and return top element of stack.
  public PANCAKE pop(){
    if (!isEmpty()) {
      length --;
      return cargo.remove(0);
    }
    else {
      return null;
    }

  }

  //Push an element onto top of this stack.
  public void push( PANCAKE x ){
    length ++;
    cargo.add(0, x);
  }
  public String toString () {
    return cargo.toString();
  }
}
