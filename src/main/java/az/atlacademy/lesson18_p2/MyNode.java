package az.atlacademy.lesson18_p2;

import java.util.LinkedList;

public class MyNode<E> extends LinkedList {
    public E data;
    public MyNode<E> next;

    public MyNode(E data) {
        this.data = data;
        this.next = null;
    }

    public MyNode(E data, MyNode<E> next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return String.format("{data=%s}", data);
    }

}
