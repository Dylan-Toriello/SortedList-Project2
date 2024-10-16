import java.util.Iterator;
public class SortedList<E extends Comparable<? super E>> extends List<E> {
    
    public void insert(E data){
        head = recursiveInsert(head, data);
                  
    
    }
    private Node<E> recursiveInsert(Node<E> current, E data){
        if (current.data == null || current.data.compareTo(data) < 0){ 
            Node<E> temp = new Node<>(data);
            temp.next = current;
        }
        current.next = recursiveInsert(current.next, data);
        return current;
    }
    public void remove(E data){
        head = recursiveRemove(head, data);
    }
    private Node<E> recursiveRemove(Node<E> current, E data){
        if(current == null){
            return null;
        }
        if (data.equals(current.data)){
            return current.next;
        }
        current.next = recursiveRemove(current.next, data);
        return current;
    }
    public E retrieve(int index){
       return recursiveRetrieve(head, index);
    }
    private E recursiveRetrieve(Node<E> current, int index){
        if (current == null || index < 0){
            throw new IndexOutOfBoundsException();
        }
        if (index == 0){
            return current.data;
        }
        return recursiveRetrieve(current.next,index-1);

    }
    public boolean search(E data){
        return recursiveSearch(head, data);
    }

    private boolean recursiveSearch(Node<E> current, E data){
        if (current.data == null){
            return false;
        }
        if(data.equals(current.data)){
            return true;
        }
        return recursiveSearch(current.next, data);
    }
}