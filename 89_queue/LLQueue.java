import java.util.LinkedList;
public class LLQueue<T> implements Queue<T> {
 private LinkedList<T> _queue;
 public LLQueue(){
   _queue = new LinkedList<T>();
 }

 public void enqueue(T val){
	_queue.addLast(val);
 }

 public T dequeue(){
   if(!isEmpty()){
      return _queue.removeFirst();
   }
   return null;
 }

 public T peekFront(){
   return _queue.getFirst();
 }

 public boolean isEmpty(){
   return _queue.isEmpty();
 }

 public static void main(String[] args) {
    LLQueue<Integer> max = new LLQueue<Integer>();
    max.enqueue(1);
    max.enqueue(2);
    max.enqueue(3);
    max.enqueue(4);

    System.out.println(max.peekFront());
    max.dequeue();
    max.dequeue();
    max.dequeue();

    System.out.println(max.peekFront());
    max.dequeue();

 }
}
