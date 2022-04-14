/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW91 -- Deque the Halls
2022-04-13
time spent: 1 hr
*/
import java.util.Iterator;
import java.util.Collection;
import java.util.LinkedList;
public class QQCC<T> implements Deque<T> {
    private LinkedList<T> _data;
    public QQCC () {

        _data = new LinkedList<T>();

    }

    public void addFirst(T newVal) {
        _data.addFirst(newVal);
    }
    public void addLast(T newVal) {
        _data.addLast(newVal);
    }

    public T pollFirst() {
        return _data.pollFirst();
    }

    public T pollLast() {
        return _data.pollLast();
    }

    public T peekFirst() {
        return _data.peekFirst();
    }

    public T peekLast() {
        return _data.peekLast();
    }

    public boolean offerFirst(T newVal) {
        return _data.offerFirst(newVal);
    }

    public boolean offerLast(T newVal) {
        return _data.offerLast(newVal);
    }

    public boolean contains(T findVal) {
      return _data.contains(findVal);
    }

    public Iterator<T> iterator() {
        return _data.iterator();
    }
    public boolean addAll (Collection<T> c){
        return _data.addAll(c);
    }
    public Iterator<T> descendingIterator(){
        return _data.descendingIterator();
    }

    public boolean remove(T o) {
        return _data.remove(o);
    }   
    public boolean removeLastOccurrence(T o) {
        return _data.removeLastOccurrence(o);
    }
    
    public String toString() {
        return _data.toString();
    }

}