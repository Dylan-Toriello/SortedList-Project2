# SortedList-Project2
Implement the SortedList class. The SortedList class extends
the List class. Both can be seen here** (Links to an external site.). Your assignment is to
implement (recursively) all of the abstract methods of the List class.
They are:

insert (recursive)
iterator
remove (recursive)
retrieve (recursive)
search (recursive)

You must also implement an Iterator inner class for the
SortedList class. You must submit a modified SortedList.java
file with your source code. Do not submit and do not modify
the List.java file or the Main.java file.

**
/*
 *
 *  List.java
 *
 */

public abstract class List<E> implements Iterable<E> {

    protected class Node<T> {

        protected Node(T data) {
            this.data = data;
        }

        protected T data;
        protected Node<T> next;
    }

    public abstract void insert(E data);
    public abstract void remove(E data);
    public abstract E retrieve(int index);
    public abstract boolean search(E data);

    protected Node<E> head;
}

/*
 *
 *  SortedList.java
 *
 */

public class SortedList<E extends Comparable<? super E>> extends List<E> {

}
