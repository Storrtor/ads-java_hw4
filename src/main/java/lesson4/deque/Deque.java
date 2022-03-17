package lesson4.deque;


import lesson3.queue.Queue;
import lesson4.LinkedList;

//1. Реализовать Deque
public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();

    class NodeDeq<E> {
        E item;
        NodeDeq<E> next;
        NodeDeq<E> prev;

        public NodeDeq(NodeDeq<E> prev, E item, NodeDeq<E> next) {
            this.prev = prev;
            this.item = item;
            this.next = next;
        }
    }
}