public class LinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node first;
    private Node last;


    public void addFirst(int item) {
        var node = new Node(item);

        if (first == null) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
    }


    public void addLast(int item) {
        var node = new Node(item);
        if (first == null) {
            first = last = node;
        } else {
            last.next = node;
            last = node;
        }
    }


    public void deleteFirst() {
        if (first == null) {
            throw new NullPointerException();
        }
        if (first == last) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void deleteLast() {
        if (first == null) {
            throw new NullPointerException();
        }

        if (first == last) {
            first = last = null;
            return;
        }

        var current = first;
        while (current.next != last) {
            current = current.next;
        }
        current.next = null;
        last = current;

    }

    public int indexOf(int item) {
        var index = 0;
        var current = first;

        while(current != null) {
            if(current.value == item) {
                return index;
            } else {
                current = current.next;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(int item) {
        return indexOf(item) != -1;
    }
}
