import java.util.*;

public class ImpStack<E> implements Stack<E> {

    Vector<E> pila = new Vector<E>();

    @Override
    public void add(E item) {
        // TODO Auto-generated method stub
        pila.add(item);
    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        pila.remove(size() -1);
        return null;
    }

    @Override
    public E peek() {
        // TODO Auto-generated method stub
        pila.get(size() -1);
        return null;
    }

    @Override
    public boolean empty() {
        // TODO Auto-generated method stub
        pila.isEmpty();
        return false;
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        return pila.size();
    }

    
}
