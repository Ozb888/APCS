/*
Team Pom Pom: Max Schneider, Perry Huang, Oscar Breen
APCS
HW91 -- Deque the Halls
2022-04-13
time spent: 1 hr

DISCO

QCC
*/
import java.util.Iterator;
import java.util.Collection;
public interface Deque<T> 
{

    public void addFirst(T newVal); //tested

    public void addLast(T newVal); //tested

    public boolean addAll (Collection<T> c); //tested

    public boolean remove(T o); //tested

    public boolean removeLastOccurrence(T o);

    public T pollFirst(); //tested

    public T pollLast(); //tested

    public boolean offerFirst(T newVal); //tested

    public boolean offerLast(T newVal); //tested

    public T peekFirst(); //tested

    public T peekLast(); //tested

    public boolean contains(T findVal); //tested

    public Iterator<T> iterator(); //tested 

    public Iterator<T> descendingIterator(); //tested

}