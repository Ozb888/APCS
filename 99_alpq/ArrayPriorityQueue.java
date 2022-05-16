import java.util.ArrayList;

public class ArrayPriorityQueue implements PriorityQueue {

    public ArrayList<Integer> _data;
    public int _back, _front;

    public ArrayPriorityQueue() {
        _data = new ArrayList<Integer>();
        _back = -1;
        _front = 0;
    }

    public int peekMin() {
        return _data.get(_front);
    }

    public int removeMin() {
        int retVal = this.peekMin();
        _front += 1;
        return retVal;
    }

    public boolean isEmpty() {
        return _back == _front - 1;
    }

    public void add(int x) {
        int prio = 0;
        if (this.isEmpty()) {
            _data.add(x);
            _back+=1;
            return;
        }
        for (int i = _back ; i >= _front; i--) {
            prio = _data.get(i);
            if (prio <= x) {
                _data.add(i + 1, x);
                _back += 1;
                return;
            }
        }
        _data.add(_front, x);
        _back += 1;
    }

    public String toString() {
        ArrayList<Integer> retVal = new ArrayList<Integer>();
        for(int i = _front; i < _back + 1; i++) {
            retVal.add(_data.get(i));
        }
        return retVal.toString();
    }

    public static void main(String[] args) {

        ArrayPriorityQueue max = new ArrayPriorityQueue();
        System.out.println(max.isEmpty());
        max.add(0);
        max.add(1);
        max.add(2);
        max.add(-1);
        max.add(1);
        max.add(0);
        max.add(3);
        max.add(-2);
        max.add(6);
        max.add(17);
        System.out.println(max);
        while(!(max.isEmpty())) {
            System.out.println("removing " + max.peekMin());
            max.removeMin();
            System.out.println(max);
        }
    }
}