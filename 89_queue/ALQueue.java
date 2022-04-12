import java.util.ArrayList;
public class ALQueue<t> implements Queue<t> {
    private ArrayList<t> _data = new ArrayList<t>();
    private int _size = 0;
    private int _head = 0;
    private int _tail = 0;
    public void enqueue(t newdata) {
        _data.add(newdata);
        _size +=1;
        _head+=1;
    }
    public t dequeue() {
        t retVal = _data.get(_tail);
        _tail+=1;
        _size-=1;
        return retVal;
    }

    public String toString () {
        String retVal = "";
        for(int i = _tail; i < _head;i++) {
            retVal += _data.get(i);
            retVal+=", ";
        } 
        return retVal;
    }
    public boolean isEmpty () {
        return (_tail == _head);
    }
    public t peekFront() {
        return _data.get(_head);
    }
    public static void main(String[] args) {
        ALQueue<Integer> max = new ALQueue<Integer>();
        max.enqueue(1);
        max.enqueue(1);
        max.enqueue(1);
        max.enqueue(1);
        System.out.println(max);
        max.dequeue();
        max.dequeue();
        max.dequeue();
        System.out.println(max);



    }
}
