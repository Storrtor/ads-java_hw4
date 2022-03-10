package lesson4.deque;


import lesson3.queue.Queue;
import lesson4.LinkedList;

//1. Реализовать Deque (с возможностью обратного прохода) 1:18:00 - deque 1:27:00 - спойлер к декью
public interface Deque<E> extends Queue<E> {

    boolean insertLeft(E value);
    boolean insertRight(E value);

    E removeLeft();
    E removeRight();

    class NodeDeq<E> {
        E item;
        NodeDeq<E> next;
        NodeDeq<E> prev;

        public NodeDeq(E item, NodeDeq<E> next, NodeDeq<E> prev) {
            this.item = item;
            this.next = next;
            this.prev = prev;
        }
    }
}