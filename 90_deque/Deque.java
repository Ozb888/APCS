import java.util.ArrayList;
public interface Deque<T> 
{

    public void addFirst(T newVal);
    public void addLast (T newVal);
    public T pollFirst();
    public T pollLast();
    public T peekFirst();
    public T peekLast();
    public boolean offerFirst(T newVal);
    public boolean offerLast(T newVal);
    
}