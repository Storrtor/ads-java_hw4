package lesson4;

public class TwoSideLinkedListImpl<E> extends SimpleLinkedListImpl<E> implements TwoSideLinkedList<E> {

    protected Node<E> last;

    @Override
    public void insertFirst(E value) {
        super.insertFirst(value);
        if (size == 1) {
            last = first;
        }
    }

    //3. Реализовать метод insert в классе списка
    public void insert(int index, E value) { // 2 13
        Node<E> prev = null;
        Node<E> current = first;
        int num = 0;

        while (current != null) {
            if (num == index) {
                break;
            }
            num++;
            prev = current;
            current = current.next;
        }

        if (current == first) {
            insertFirst(value);
            return;
        }
        if (current == last) {
            insertLast(value);
            return;
        }
        Node<E> addedNode = new Node<>(value, current);
        prev.next = addedNode;
        size++;

    }

    @Override
    public void insertLast(E value) {
        if (isEmpty()) {
            insertFirst(value);
            return;
        }

        last.next = last  = new Node<>(value, null);
//        Node<E> newNode  = new Node<>(value, null);
//        last.next = newNode;
//        last = newNode;
        size++;
    }

    @Override
    public E removeFirst() {
        E removedValue = super.removeFirst();

        if (isEmpty()) {
            last = null;
        }

        return removedValue;
    }

    @Override
    public boolean remove(E value) {
        Node<E> prev = null;
        Node<E> current = first;

        while (current != null) {
            if (current.item.equals(value)) {
                break;
            }
            prev = current;
            current = current.next;
        }

        if (current == null) {
            return false;
        }

        if (current == first) {
            removeFirst();
            return true;
        }
        if (current == last) {
            last = prev;
            last.next = null;
        }

        prev.next = current.next;
        current.next = null;
        size--;

        return true;
    }

    @Override
    public E getLast() {
        return last.item;
    }
}
